package com.ict.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class Ex09 {
	public static void main(String[] args) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;

		try {
			Scanner scan = new Scanner(System.in);
			System.out.print("삭제할 이름: ");
			String name = scan.next();
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "c##bomv", "1111");

			String sql = "delete from customer where name=?";

			pstmt = conn.prepareStatement(sql);

			pstmt.setString(1, name);
			pstmt.executeUpdate();

			String seeRes = "select * from customer";
			rs = pstmt.executeQuery(seeRes);

			// 9-2 insert, update, delete
			// result = stmt.executeUpdate(sql)
			// rs.getXX (index = 1부터) XX자료형
			while (rs.next()) {
				System.out.print(rs.getInt(1) + "\t");
				System.out.print(rs.getString(2) + "\t");
				System.out.print(rs.getString(3) + "\t");
				System.out.print(rs.getString(4) + "\n");

			}

		} catch (Exception e) {
			// TODO: handle exception
		} finally {
			try {
				rs.close();
				pstmt.close();
				conn.close();

			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
	}
}
