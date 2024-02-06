package com.ict.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/*
 * DAO Data Access Object ; 데이터베이스의 데이터에 접근하기 위한 객체 
 *                         데이터베이스에 접근하기 위한 로직을 분리하기 위해 사용
 *                         직접 디비에 접근하여 데이타를 삽입, 삭제, 수정, 검색을 조작할수 잇는 
 *                         기능을 가진 클래스
 * 디비에 접속해서 SQL 각종 처리하는 클래스 
 */
public class Ex11_DAO {
	Connection conn = null;
	PreparedStatement pstmt = null;
	ResultSet rs = null;
	int result = 0;
	// 싱글턴 패턴 - 소프트웨어 디자인 패턴 중 하나이다
	// 생성자가 여러차례 호출되더라도 실제 생성되는 객체는 하나이고,
	// 최초생성이후에는 호출된 생성자는 최초 생성자가 생성한 객체를 리턴한다
	// 스트링은 기본적으로 싱글턴 패턴 사용
	private static Ex11_DAO dao = new Ex11_DAO();

	public static Ex11_DAO getInstance() {
		return dao;
	}

	// DB 접속 method
	public Connection getConnection() {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");

			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String user = "c##bomv";
			String password = "1111";

			conn = DriverManager.getConnection(url, user, password);
			return conn;

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	// 나머지 메서드들은 사용자의 요구에따라 맞는 메서드를 만들어서 DB 처리한다
	// 전체보기
	public void getSelectAll() {
		try {
			conn = getConnection();
			String sql = "select * from customer";
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery(sql);
			System.out.println("번호\t이름\t주소\t\t전화번호");
			while (rs.next()) {
				System.out.print(rs.getInt(1) + "\t");
				System.out.print(rs.getString(2) + "\t");
				System.out.print(rs.getString(3) + "\t\t");
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

	public int getInsert(int custid, String name, String addr, String phone) {
		try {
			conn = getConnection();
			String sql = "insert into customer values(?,?,?,?)";
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, custid);
			pstmt.setString(2, name);
			pstmt.setString(3, addr);
			pstmt.setString(4, phone);
			result = pstmt.executeUpdate();

		} catch (Exception e) {
			System.out.println(e);
		} finally {
			try {
				rs.close();
				pstmt.close();
				conn.close();

			} catch (Exception e2) {
			}
			return result;
		}
	}

	public void getUpdate(int custid, String name, String addr, String phone) {
		try {
			conn = getConnection();
			String sql = "update customer set=?, address=?, phone=? where custid=?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, name);
			pstmt.setString(2, addr);
			pstmt.setString(3, phone);
			pstmt.setInt(4, custid);
			result = pstmt.executeUpdate();
			if (result > 0)
				getSelectAll();
			else
				System.out.println("fail");
		} catch (Exception e) {
			System.out.println(e);
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

	// 검색 custid를 받자
	public void getSelectOne(int custid) {
		try {
			conn = getConnection();
			String sql = "select * from customer where custid =?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, custid);
			rs = pstmt.executeQuery(sql);
			System.out.println("번호\t이름\t주소\t\t전화번호");
			while (rs.next()) {
				System.out.print(rs.getInt(1) + "\t");
				System.out.print(rs.getString(2) + "\t");
				System.out.print(rs.getString(3) + "\t\t");
				System.out.print(rs.getString(4) + "\n");

			}

		} catch (Exception e) {
			System.out.println(e);
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

	public void getDelete(int custid) {
		try {
			conn = getConnection();
			String sql = "delete from customer where custid =?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, custid);
			result = pstmt.executeUpdate();
			if (result > 0)
				getSelectAll();
			else
				System.out.println("fail");
		} catch (Exception e) {
			System.out.println(e);
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
