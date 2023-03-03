package Assignment8;

import java.sql.*;

public class TestConnection {
	public static void main(String args[]) {
		new MakeConnection();
	}
}

class MakeConnection {
	Connection con;
	Statement stmt;
	ResultSet rs;

	MakeConnection() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost/demo", "root", "Hari@2002");
			stmt = con.createStatement();
			rs = stmt.executeQuery("Select * from emp");
			while (rs.next())
				System.out.println(rs.getString(1) + " " + rs.getString(2));
			
			stmt = con.createStatement();
			//int i=stmt.executeUpdate("create table pradeep(empno integer,ename varchar(20),deptno integer)");
			//System.out.println(i);
			
			stmt = con.createStatement();
			int i1=stmt.executeUpdate(" insert into pradeep values (001,'sakre',23)");
			int i2=stmt.executeUpdate(" insert into pradeep values (001,'pradeep',223)");
			int i3=stmt.executeUpdate(" insert into pradeep values (001,'vivek',243)");
			
			System.out.println(i1);
			
			rs=stmt.executeQuery("select * from pradeep");
			while(rs.next()) {
			System.out.println(rs.getInt(1)+ " " +rs.getString(2)+""+rs.getInt(3));
			}
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
