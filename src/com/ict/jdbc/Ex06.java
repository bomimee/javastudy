package com.ict.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class Ex06 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
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
			esc: while (true) {
				System.out.print("번호:");
				int num = scan.nextInt();
				System.out.print("이름:");
				String name = scan.nextLine();
				System.out.print("주소:");
				String address = scan.nextLine();
				System.out.print("전화번호:");
				String phone = scan.nextLine();
				// "insert customer values(num, 'name', 'address', 'phone')"

				result = stmt.executeUpdate(
						"insert into customer values(" + num + ", '" + name + "', '" + address + "', '" + phone + "')");

				if (result > 0) {
					System.out.println("succeed");
				} else {
					System.out.println("fall");
				}
				rs = stmt.executeQuery("select * from customer");
				while (rs.next()) {
					System.out.print(rs.getInt(1) + "\t");
					System.out.print(rs.getString(2) + "\t");
					System.out.print(rs.getString(3) + "\t");
					System.out.print(rs.getString(4) + "\n");
				}
				System.out.print("continue? ");
				String ans = scan.next();
				if (ans.equalsIgnoreCase("y"))
					continue esc;
				else if (ans.equalsIgnoreCase("n"))
					break esc;
				else
					break;
			}

		} catch (Exception e) {
			System.out.println(e);
		} finally {
			try {
				rs.close();
				stmt.close();
				conn.close();
				scan.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}

	}
}
