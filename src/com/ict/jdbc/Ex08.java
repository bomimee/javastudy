package com.ict.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class Ex08 {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	
	Connection conn = null;
	PreparedStatement ps = null;
	ResultSet rs = null;
	int res = 0;
	
	try {
		System.out.print("번호 :");
		int num = scan.nextInt();
		System.out.print("이름 :");
		String name = scan.next();
		System.out.print("주소 :");
		String address = scan.next();
		System.out.print("전화 :");
		String phone = scan.next();
		
		Class.forName("oracle.jdbc.driver.OracleDriver");
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "c##bomv";
		String password = "1111";
		conn = DriverManager.getConnection(url,user,password);
		String sql = "insert into customer values(?,?,?,?)";
		ps = conn.prepareStatement(sql);
		ps.setInt(1, num);
		ps.setString(2, name);
		ps.setString(3, address);
		ps.setString(4, phone);
		res = ps.executeUpdate();
		
		rs = ps.executeQuery("select * from customer");
		while(rs.next()) {
			System.out.print(rs.getInt(1) + "\t");
			System.out.print(rs.getString(2) + "\t");
			System.out.print(rs.getString(3) + "\t");
			System.out.print(rs.getString(4) + "\n");
		}
	} catch (Exception e) {
		System.out.println(e);
	}finally {
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
