package com.ict.jdbc;

import java.util.Scanner;

public class Ex11_Main {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("선택하세요");
		System.out.println("1.전체데이터보기");
		System.out.println("2.특정데이터보기");
		System.out.println("3.데이터삽입");
		System.out.println("4.데이터삭제");
		System.out.println("5.데이터update");
		System.out.print(">>>>>>>>>>>>>> ");
		int menu = scan.nextInt();
		switch (menu) {
		case 1:
			Ex11_DAO.getInstance().getSelectAll();

			break;
		case 2:
			System.out.print("custid : ");
			int custid = scan.nextInt();
			Ex11_DAO.getInstance().getSelectOne(custid);
			break;
		case 3:
			System.out.println("삽입정보입력");
			System.out.print("번호 : ");
			int custid2 = scan.nextInt();
			System.out.print("이름 : ");
			String name = scan.next();
			System.out.print("주소 : ");
			String addr = scan.next();
			System.out.print("연락처 : ");
			String phone = scan.next();

			int result = Ex11_DAO.getInstance().getInsert(custid2, name, addr, phone);
			if (result > 0) {
				Ex11_DAO.getInstance().getSelectAll();
			} else {
				System.out.println("fail");
			}
			break;
		case 4:
			System.out.print("custid : ");
			int custid3 = scan.nextInt();
			Ex11_DAO.getInstance().getDelete(custid3);
			break;
		case 5:
			System.out.println("삽입정보입력");
			System.out.print("번호 : ");
			int custid4 = scan.nextInt();
			System.out.print("이름 : ");
			String name2 = scan.next();
			System.out.print("주소 : ");
			String addr2 = scan.next();
			System.out.print("연락처 : ");
			String phone2 = scan.next();

			Ex11_DAO.getInstance().getUpdate(custid4, name2, addr2, phone2);

			break;

		}
	}
}
