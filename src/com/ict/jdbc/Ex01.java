package com.ict.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

//jar: 자바로 압축한 파일. 보통 라이브러리에 사용됨, 클래스들로 이루어져있다
//자바와 오라클을 연결해주는 드라이버가 필요하다 (ojdbcXXX.jar)
//1. sql developer 에 존재. 해당 드라이버를 찾아서 유틸폴더에 넣자
//2. 이클립스에서 프로젝트 마우스 오른쪽 빌드패스 - 컨피거 빌드패스
public class Ex01 {
	public static void main(String[] args) {
		// 1. 자바를 오라클에 접속할 수있도록 도와주는 클래스 필요
		Connection conn = null;
		// 2. sql
		Statement stmt = null;
		// 3-1 결과를 받은 클래스 (select )
		ResultSet rs = null;
		// 3-2 결과를 받은 변수 ( select X)
		int result = 0;
		try {
			//4. jdbc driver loading : oracle, MySQL, mariaDB all different
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			//5. 오라클과 연결하기 위한 정보
			String url ="jdbc:oracle:thin:@localhost:1521:xe";
			String user = "c##bomv";
			String password = "1111";
			
			//6. connect to oracle
			conn = DriverManager.getConnection(url, user, password);
			
			//7.writing sql
			String sql = "select * from customer";
			
			//8. sql 보내기 위해 구분 만들기
			stmt = conn.createStatement();
			
			//9. 보내서 결과 받기
			//9-1 select 
			 rs = stmt.executeQuery(sql);
			 
			 //9-2 insert, update, delete
			 //result = stmt.executeUpdate(sql)
			 //rs.getXX (index = 1부터) XX자료형
			 while(rs.next()) {
				 System.out.print(rs.getInt(1)+"\t");
				 System.out.print(rs.getString(2)+"\t");
				 System.out.print(rs.getString(3)+"\t");
				 System.out.print(rs.getString(4)+"\n");
			
			 }
			
		} catch (Exception e) {
			// TODO: handle exception
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
