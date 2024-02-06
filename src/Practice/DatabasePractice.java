package Practice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class DatabasePractice {
	public static void main(String[] args) throws ClassNotFoundException {
        try (Scanner scan = new Scanner(System.in);
             Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "c##bomv", "1111")) {

            System.out.print("번호 :");
            int num = scan.nextInt();
            System.out.print("이름 :");
            String name = scan.next();
            System.out.print("주소 :");
            String address = scan.next();
            System.out.print("전화 :");
            String phone = scan.next();

            // Insert data
            String insertSql = "INSERT INTO customer VALUES (?, ?, ?, ?)";
            try (PreparedStatement psInsert = conn.prepareStatement(insertSql)) {
                psInsert.setInt(1, num);
                psInsert.setString(2, name);
                psInsert.setString(3, address);
                psInsert.setString(4, phone);
                psInsert.executeUpdate();
            }

            // Select data
            String selectSql = "SELECT * FROM customer";
            try (PreparedStatement psSelect = conn.prepareStatement(selectSql);
                 ResultSet rs = psSelect.executeQuery()) {

                // Print the results
                while (rs.next()) {
                    System.out.printf("%d\t%s\t%s\t%s\n", rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4));
                }
            }

        } catch (SQLException e) {
            System.out.println(e);
        }
    }

}
