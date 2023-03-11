package Assignment9;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class ItemMasterDAO implements Cloneable{
	private static ItemMasterDAO itemmasterdao;

	public static ItemMasterDAO getUserDAOImplObject() {
		if (itemmasterdao == null) {
			itemmasterdao = new ItemMasterDAO();
			return itemmasterdao;
		} else {
			return itemmasterdao.createClone();
		}
	}

	private ItemMasterDAO createClone() {
		if (itemmasterdao != null) {
			try {
				return (ItemMasterDAO) super.clone();
			} catch (Exception e) {
				e.printStackTrace();
				return null;
			}
		} else {
			return null;
		}
	}

	private ItemMasterDAO() {
		// TODO Auto-generated constructor stub
	}
	public ItemMasterDTO findByID(int id) {
		try {
			Connection con = DBUtility.getConnection();
			PreparedStatement ps = con.prepareStatement("select * from item_master where itemid=?");
			ps.setInt(1, id);
			ResultSet rs = ps.executeQuery();
			if (rs.next()) {
				ItemMasterDTO itemdto = new ItemMasterDTO();
				itemdto.setItemname(rs.getString("itemname"));
				itemdto.setItemprice(rs.getInt("itemprice"));
				itemdto.setUnit(rs.getString("itemunit"));
				itemdto.setItemno(id);
				return itemdto;
			} else {
				return null;
			}
		} catch (Exception e) {
			DBUtility.closeConnection(e);
			return null;
		}
	}

	public Collection<ItemMasterDTO> findAll() {
		try {
			Connection con = DBUtility.getConnection();
			Statement ps = con.createStatement();

			ResultSet rs = ps.executeQuery("select * from item_master");
			List<ItemMasterDTO> itemmaster = new ArrayList<ItemMasterDTO>();
			while (rs.next()) {
				ItemMasterDTO dto = new ItemMasterDTO();
				dto.setItemno(rs.getInt("itemid"));
				dto.setItemname(rs.getString("itemname"));
				dto.setItemprice(rs.getInt("itemprice"));
				dto.setUnit(rs.getString("itemunit"));
				itemmaster.add(dto);
			}
			return itemmaster;
		} catch (Exception e) {
			DBUtility.closeConnection(e);
			return null;
		}
	}

	public int update(ItemMasterDTO dto) {
		try {
			Connection con = DBUtility.getConnection();
			int itemid = dto.getItemno();
			PreparedStatement ps = con.prepareStatement("select * from item_master where itemid=?");
			ps.setInt(1, itemid);
			ResultSet rs = ps.executeQuery();
			if (rs.next()) {
				ps = con.prepareStatement("update users set itemname=?,itemprice=?,itemunit=? where itemid=?");
				ps.setString(1, dto.getItemname());
				ps.setInt(2, dto.getItemprice());
				ps.setString(3, dto.getUnit());
				ps.setInt(4, dto.getItemno());
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

	public int deleteItem(ItemMasterDTO dto) {
		try {
			Connection con=DBUtility.getConnection();
			int itemid=dto.getItemno();
			PreparedStatement ps = con.prepareStatement("select * from item_master where itemid=?");
			ps.setInt(1, itemid);
			ResultSet rs = ps.executeQuery();
			if (rs.next()) {
				ps = con.prepareStatement("delete  from item_master where itemid=?");
				int n = ps.executeUpdate();
				return n;
			}
			else {
				return 0;}
			
		}
		catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			DBUtility.closeConnection(e);
			return 0;}
	}

	public ItemMasterDTO findByItemName(String itemname) {
		try {
			Connection con = DBUtility.getConnection();
			PreparedStatement ps = con.prepareStatement("select * from item_master where itemname=?");
			ps.setString(1, itemname);
			ResultSet rs = ps.executeQuery();
			if (rs.next()) {
				ItemMasterDTO dto = new ItemMasterDTO();
				dto.setItemno(rs.getInt("itemid"));
				dto.setItemname(rs.getString("itemname"));
				dto.setItemprice(rs.getInt("itemprice"));
				dto.setUnit(rs.getString("itemunit"));
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
		ItemMasterDAO user=new ItemMasterDAO();
		
		
	}
}