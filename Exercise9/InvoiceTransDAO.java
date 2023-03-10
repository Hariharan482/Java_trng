package Assignment9;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;


public class InvoiceTransDAO {
	public InvoiceTransDTO findByID(int id) {
		try {
			Connection con = DBUtility.getConnection();
			PreparedStatement ps = con.prepareStatement("select * from invoice_trans where invoiceno=?");
			ps.setInt(1, id);
			ResultSet rs = ps.executeQuery();
			if (rs.next()) {
				InvoiceTransDTO invoicetrans = new InvoiceTransDTO();
				invoicetrans.setInvoiceno(rs.getInt("invoiceno"));
				invoicetrans.setItemno(rs.getInt("itemno"));
				invoicetrans.setItemqty(rs.getInt("itemqty"));
				return invoicetrans;
			} else {
				return null;
			}
		} catch (Exception e) {
			e.printStackTrace();
			DBUtility.closeConnection(e);
			return null;
		}
	}

	public Collection<InvoiceTransDTO> findAll() {
		try {
			Connection con = DBUtility.getConnection();
			Statement ps = con.createStatement();

			ResultSet rs = ps.executeQuery("select * from invoice_trans");
			List<InvoiceTransDTO> items = new ArrayList<InvoiceTransDTO>();
			while (rs.next()) {
				InvoiceTransDTO dto1 = new InvoiceTransDTO();
				dto1.setInvoiceno(rs.getInt("invoiceno"));
				dto1.setItemno(rs.getInt("itemno"));
				dto1.setItemqty(rs.getInt("itemqty"));
				items.add(dto1);
			}
			return items;
		} catch (Exception e) {
			e.printStackTrace();
			DBUtility.closeConnection(e);
			return null;
		}
	}

	public int update(InvoiceTransDTO dto) {
		try {
			Connection con = DBUtility.getConnection();
			int itemid = dto.getInvoiceno();
			PreparedStatement ps = con.prepareStatement("select * from invoice_trans where invoiceno=?");
			ps.setInt(1, itemid);
			ResultSet rs = ps.executeQuery();
			if (rs.next()) {
				ps = con.prepareStatement("update invoice_trans set Invoiceno=?,itemno=?,itemqty=?");
				ps.setInt(1, dto.getInvoiceno());
				ps.setInt(2, dto.getItemno());
				ps.setInt(3, dto.getItemqty());
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

	public int delete(InvoiceTransDTO dto) {
		try {
			Connection con = DBUtility.getConnection();
			int invoiceno = dto.getInvoiceno();
			PreparedStatement ps = con.prepareStatement("delete from invoice_trans where Invoiceno=?");
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

	public InvoiceTransDTO findItemno(int itemno) {
		try {
			Connection con = DBUtility.getConnection();
			PreparedStatement ps = con.prepareStatement("select * from invoice_trans where itemno=?");
			ps.setInt(1, itemno);
			ResultSet rs = ps.executeQuery();
			if (rs.next()) {
				InvoiceTransDTO dto1 = new InvoiceTransDTO();
				dto1.setInvoiceno(rs.getInt("invoiceno"));
				dto1.setItemno(rs.getInt("itemno"));
				dto1.setItemqty(rs.getInt("itemqty"));
				return dto1;
			} else {
				return null;
			}
		} catch (Exception e) {
			DBUtility.closeConnection(e);
			return null;
		}
	}

	public static void main(String[] args) {
		InvoiceTransDAO user = new InvoiceTransDAO();
		System.out.println(user.findAll());

		System.out.println(user.findByID(2));
		InvoiceTransDTO u = user.findByID(2);
		u.setItemno(5);
		// u.setUpass("secret");
		int n = user.update(u);
		System.out.println(n);

	}
}
