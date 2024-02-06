package com.ict.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.ResultSet;

public class Ex02 {
public static void main(String[] args) {
	
	Connection conn = null;
	Statement stmt = null;
	ResultSet rs = null;
	int result = 0;

	try {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "c##bomv";
		String password = "1111"; 
		
		conn=DriverManager.getConnection(url, user, password);
		
		String sql= "select * from book";
		
		stmt = conn.createStatement();
		rs = stmt.executeQuery(sql);
		

		while(rs.next()) {
			
			System.out.print(rs.getInt("bookid")+"\t");
			 System.out.print(rs.getString("bookname")+"\t");
			 System.out.print(rs.getString("publisher")+"\t");
			 System.out.print(rs.getInt("price")+"\n");
		}
		
	} catch (Exception e) {
		System.out.println(e);
	}finally {
		try {
			rs.close();
			stmt.close();
			conn.close();
		} catch (Exception e2) {
			// TODO: handle exception
		}
	}
}
}
