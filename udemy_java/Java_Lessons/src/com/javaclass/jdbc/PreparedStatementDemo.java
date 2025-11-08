package com.javaclass.jdbc;

import java.sql.*;

public class PreparedStatementDemo {

	public static void main(String[] args) {
		
		int sid = 7;
		String sname = "Robin";
		
		String url = "jdbc:postgresql://localhost:5432/demo";
		String uname = "postgres";
		String pass = "root";
		String query = "select * from student";
		String insert_query = "insert into student values(?, ?)";
		
		
		try {
			
			Connection con = DriverManager.getConnection(url, uname, pass);
			
			PreparedStatement pt = con.prepareStatement(insert_query);
			pt.setInt(1, sid);
			pt.setString(2, sname);
			
			pt.execute();
			
			pt = con.prepareStatement(query);
			ResultSet rs = pt.executeQuery();
			while(rs.next()) System.out.println(rs.getInt("sid") + " : " +rs.getString("sname"));
			
			con.close();
			
				
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
