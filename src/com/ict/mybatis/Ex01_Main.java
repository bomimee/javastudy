package com.ict.mybatis;

import java.util.List;
import java.util.Scanner;

public class Ex01_Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		// 전체테이블보기
		List<Ex01_VO> list = Ex01_DAO.getList();
		prn(list);

		//
		System.out.println("선택하세요");
		System.out.println("2.특정데이터보기");
		System.out.println("3.데이터삽입");
		System.out.println("4.데이터삭제");
		System.out.println("5.데이터update");
		System.out.print(">>>>>>>>>>>>>> ");
		int menu = scan.nextInt();
		switch (menu) {
		case 2:
			System.out.print("number : ");
			String custid = scan.next();
			Ex01_VO vo = Ex01_DAO.getOne(custid);
			prn(vo);
			break;
		case 3: // insert
			System.out.print("number : ");
			String custid2 = scan.next();
			System.out.print("name : ");
			String name = scan.next();
			System.out.print("address : ");
			String address = scan.next();
			System.out.print("phone : ");
			String phone = scan.next();
			int result = Ex01_DAO.getIns(new Ex01_VO(custid2, name, address, phone));
			if (result > 0) {
				List<Ex01_VO> list2 = Ex01_DAO.getList();
				prn(list2);
			} else {
				System.out.println("fail");
			}
			break;
		case 4: // delete
			System.out.print("number : ");
			String custid3 = scan.next();
			Ex01_VO vo3 = new Ex01_VO();
			vo3.setCustid(custid3);
			int result2 = Ex01_DAO.getDelete(vo3);
			if (result2 > 0) {
				List<Ex01_VO> list3 = Ex01_DAO.getList();
				prn(list3);
			} else {
				System.out.println("fail");
			}
			break;
		case 5: // update
			System.out.print("update number : ");
			String custid4 = scan.next();
			System.out.print("name : ");
			String name2 = scan.next();
			System.out.print("address : ");
			String address2 = scan.next();
			System.out.print("phone : ");
			String phone2 = scan.next();
			Ex01_VO vo4 = new Ex01_VO();
			vo4.setCustid(custid4);
			vo4.setName(name2);
			vo4.setAddress(address2);
			vo4.setPhone(phone2);

			int result3 = Ex01_DAO.getUpdate(vo4);
			;
			if (result3 > 0) {
				List<Ex01_VO> list4 = Ex01_DAO.getList();
				prn(list4);
			} else {
				System.out.println("fail");
			}

			break;

		}
		// customer table
	}

	public static void prn(List<Ex01_VO> list) {
		System.out.println("번호\t이름\t주소\t\t전화번호");
		for (Ex01_VO k : list) {
			System.out.print(k.getCustid() + "\t");
			System.out.print(k.getName() + "\t");
			System.out.print(k.getAddress() + "\t\t");
			System.out.print(k.getPhone() + "\n");
		}
	}

	public static void prn(Ex01_VO vo) {
		System.out.println("번호\t이름\t주소\t\t전화번호");
		System.out.print(vo.getCustid() + "\t");
		System.out.print(vo.getName() + "\t");
		System.out.print(vo.getAddress() + "\t\t");
		System.out.print(vo.getPhone() + "\n");
	}
}
