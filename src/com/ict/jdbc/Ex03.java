package com.ict.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Ex03 {
	public static void main(String[] args) {
		// customer table 6, 이강인, 대한민국 제주도, 000-1234-9876 insert
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;

		int result = 0;

		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String user = "c##bomv";
			String password = "1111";

			conn = DriverManager.getConnection(url, user, password);
			stmt = conn.createStatement();
			result = stmt.executeUpdate("insert into customer values(6, '이강인','대한민국 제주도','000-1234-9876')");
			if (result > 0) {
				System.out.println("succeed");
			} else {
				System.out.println("fail");
			}
			
			rs = stmt.executeQuery("select * from customer");
			while (rs.next()) {
				System.out.print(rs.getInt(1) + "\t");
				System.out.print(rs.getString(2) + "\t");
				System.out.print(rs.getString(3) + "\t");
				System.out.print(rs.getString(4) + "\n");
			}
		} catch (Exception e) {
			System.out.println(e);
		} finally {
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
