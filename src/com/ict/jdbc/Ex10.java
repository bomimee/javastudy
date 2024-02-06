package com.ict.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class Ex10 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;

		try {
			System.out.print("이름 :");
			String name = scan.next();
			System.out.print("새 주소 :");
			String address = scan.next();

			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "c##bomv", "1111");
			String sql = "update customer set address=? where name=?";
			ps = conn.prepareStatement(sql);

			ps.setString(1, address);
			ps.setString(2, name);

			int success = ps.executeUpdate();
			if (success > 0) {
				System.out.println("successfully updated!");
			} else {
				System.out.println("fail");
			}
			rs = conn.createStatement().executeQuery("select * from customer");
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
				ps.close();
				conn.close();
				scan.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}

		}
	}
}
