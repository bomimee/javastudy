package com.ict.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Ex05 {
public static void main(String[] args) {
	// 장미란 으 둘리로 주소는 서울방학동 변경
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
		result = stmt.executeUpdate("update customer set name = '둘리', address ='서울 방학동' where name='장미란'");
		if(result>0) {System.out.println("modified");}
		else {System.out.println("fail");}
		
		rs = stmt.executeQuery("select * from customer");
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
			stmt.close();
			conn.close();
		} catch (Exception e2) {
			// TODO: handle exception
		}
	}
	
}
}
