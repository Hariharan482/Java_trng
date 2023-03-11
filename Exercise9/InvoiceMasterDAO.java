package Assignment9;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;



public class InvoiceMasterDAO {
	public InvoiceMasterDTO findByID(int id) {
		try {
			Connection con = DBUtility.getConnection();
			PreparedStatement ps = con.prepareStatement("select * from invoice_master where customerid=?");
			ps.setInt(1, id);
			ResultSet rs = ps.executeQuery();
			if (rs.next()) {
				InvoiceMasterDTO invoiceto = new InvoiceMasterDTO();
				invoiceto.setInvoiceno(rs.getInt("invoiceno"));
				invoiceto.setInvoicedate(rs.getString("invoicedate"));
				invoiceto.setCustomerid(rs.getInt("customerid"));
				return invoiceto;
			} else {
				return null;
			}
		} catch (Exception e) {
			DBUtility.closeConnection(e);
			return null;
		}
	}

	public Collection<InvoiceMasterDTO> findAll() {
		try {
			Connection con = DBUtility.getConnection();
			Statement ps = con.createStatement();
			ResultSet rs = ps.executeQuery("select * from invoice_master");
			// System.out.println(rs);
			List<InvoiceMasterDTO> items = new ArrayList<InvoiceMasterDTO>();
			while (rs.next()) {
				InvoiceMasterDTO dto = new InvoiceMasterDTO();
				dto.setInvoiceno(rs.getInt("invoiceno"));
				dto.setInvoicedate(rs.getString("invoicedate"));
				dto.setCustomerid(rs.getInt("customerid"));
				System.out.println(dto);
				items.add(dto);
			}
			return items;
		} catch (Exception e) {
			e.printStackTrace();
			DBUtility.closeConnection(e);
			return null;
		}
	}

	public int update(InvoiceMasterDTO dto) {
		try {
			Connection con = DBUtility.getConnection();
			int itemid = dto.getInvoiceno();
			PreparedStatement ps = con.prepareStatement("select * from invoice_master where invoiceno=?");
			ps.setInt(1, itemid);
			ResultSet rs = ps.executeQuery();
			if (rs.next()) {
				ps = con.prepareStatement("update invoice_master set invoiceno=?,invoicedate=?,customerid=?");
				ps.setInt(1, dto.getInvoiceno());
				ps.setString(2, dto.getInvoicedate());
				ps.setInt(3, dto.getCustomerid());
				int n = ps.executeUpdate();
				DBUtility.closeConnection(null);
				return n;
			} else {
				return 0;
			}

		} catch (Exception e) {
			e.printStackTrace();
			DBUtility.closeConnection(e);
			return 0;
		}
	}

	public int delete(InvoiceMasterDTO dto) {
		try {
			Connection con = DBUtility.getConnection();
			int invoiceno = dto.getInvoiceno();
			PreparedStatement ps = con.prepareStatement("delete from invoice_master where invoiceno=?");
			ps.setInt(1, invoiceno);
			int n = ps.executeUpdate();
			DBUtility.closeConnection(null);
			return n;
		} catch (Exception e) {
			e.printStackTrace();
			DBUtility.closeConnection(e);
			return 0;
		}
	}

	public InvoiceMasterDTO findByDate(String itemname) {
		try {
			Connection con = DBUtility.getConnection();
			PreparedStatement ps = con.prepareStatement("select * from invoice_master where invoicedate=?");
			ps.setString(1, itemname);
			ResultSet rs = ps.executeQuery();
			if (rs.next()) {
				InvoiceMasterDTO dto = new InvoiceMasterDTO();
				dto.setInvoiceno(rs.getInt("invoiceno"));
				dto.setInvoicedate(rs.getString("invoicedate"));
				dto.setCustomerid(rs.getInt("customerid"));
				return dto;
			} else {
				return null;
			}
		} catch (Exception e) {
			DBUtility.closeConnection(e);
			return null;
		}
	}

	public static void main(String[] args) {
		InvoiceMasterDAO user1 = new InvoiceMasterDAO();
		System.out.println(user1.findAll());

		System.out.println(user1.findByID(2));
		// System.out.println(user1.findByID(2));
		InvoiceMasterDTO u = user1.findByID(1);
		u.setCustomerid(5);
		// u.setUpass("secret");
		int n = user1.update(u);
		System.out.println(n);

	}
}
