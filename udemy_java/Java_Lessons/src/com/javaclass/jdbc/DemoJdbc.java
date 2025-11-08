package com.javaclass.jdbc;

import java.sql.*;

public class DemoJdbc {

	public static void main(String[] args) {
		/*
		 * 
		 * import library
		 * Load and Register
		 * Create connection
		 * Create Statement
		 * Execute Statement
		 * Process the results
		 * Close the connection.
		 * 
		 * */
		
		String url = "jdbc:postgresql://localhost:5432/demo";
		String uname = "postgres";
		String pass = "root";
		String query = "select * from student";
		String insert_query = "insert into student values(3, 'John'),(4, 'Mare'),(5, 'teech')";
		String update_query = "update student set sname= 'Ainz' where sid= 3";
		String del_query = "delete from student where sid= 5";
		
		try {
			Class.forName("org.postgresql.Driver");
			Connection con = DriverManager.getConnection(url, uname, pass);
			System.out.println("Connection Established.");
			
			Statement st = con.createStatement();
			
//			st.execute(insert_query);
//			st.execute(update_query);
//			st.execute(del_query);
			
			ResultSet rs = st.executeQuery(query);
			while(rs.next()) System.out.println(rs.getInt("sid") + " : " +rs.getString("sname"));
			
			con.close();
			System.out.println("Connection closed.");
				
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
