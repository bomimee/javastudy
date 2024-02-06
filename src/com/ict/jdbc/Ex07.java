package com.ict.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class Ex07 {
	public static void main(String[] args) {
		// 1. 자바를 오라클에 접속할 수있도록 도와주는 클래스 필요
		Connection conn = null;
		// 2. sql
		PreparedStatement pstmt = null;
		// 3-1 결과를 받은 클래스 (select )
		ResultSet rs = null;

		Scanner scan = new Scanner(System.in);
		try {
			System.out.println("검색번호받기");
			int custid = scan.nextInt();
		

			// 5. 오라클과 연결하기 위한 정보
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String user = "c##bomv";
			String password = "1111";

			// 6. connect to oracle
			conn = DriverManager.getConnection(url, user, password);

			// 7.writing sql
			// ? : 동적 바인딩 변수 => 지금은 값을 모르고 실행할때 값을 알수있다
			String sql = "select * from customer where custid=?";

			// 8. sql 보내기 위해 구분 만들기
			pstmt = conn.prepareStatement(sql);

			// ? 를 처리하자
			pstmt.setInt(1, custid);
			// 9. 보내서 결과 받기
			// 9-1 select
			rs = pstmt.executeQuery();

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
