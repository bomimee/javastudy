package com.ict.mybatis2;

import java.util.List;
import java.util.Scanner;


public class Ex02_Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<Ex02_VO> list = Ex02_DAO.getList();
		prn(list);

		System.out.println("선택하세요");
		System.out.println("1.특정데이터보기");
		System.out.println("2.데이터삽입");
		System.out.println("3.데이터삭제");
		System.out.println("4.데이터update");
		System.out.print(">>>>>>>>>>>>>> ");

		int ans = sc.nextInt();
		switch (ans) {
		case 1: // 하나만보기
			System.out.print("보고싶은 idk :");
			String idk = sc.next();
			Ex02_VO vo = Ex02_DAO.getOne(idk);
			prn(vo);

			break;
		case 2: // insert
			System.out.print("idk :");
			String idk2 = sc.next();
			System.out.print("id :");
			String id = sc.next();
			System.out.print("pw :");
			String pw = sc.next();
			System.out.print("name :");
			String name = sc.next();
			System.out.print("age :");
			String age = sc.next();
			System.out.print("today's date :");
			String date = sc.next();
			Ex02_VO vo2 = new Ex02_VO(idk2, id, pw, name, age, date);
			int res = Ex02_DAO.getInsert(vo2);
			if (res > 0) {
				List<Ex02_VO> list2 = Ex02_DAO.getList();
				prn(list2);
			} else {
				System.out.println("fail");
			}
			break;
		case 3: // delete
			System.out.print("삭제할 idk :");
			String idk3 = sc.next();
			Ex02_VO vo3 = new Ex02_VO();
			vo3.setIdx(idk3);
			int res2 = Ex02_DAO.getDelete(vo3);
			if (res2 > 0) {
				List<Ex02_VO> list2 = Ex02_DAO.getList();
				prn(list2);
			} else {
				System.out.println("fail");
			}
			break;
		case 4: // update
			System.out.print("업데이트 할 idk :");
			String idk4 = sc.next();
			System.out.print("id :");
			String id2 = sc.next();
			System.out.print("pw :");
			String pw2 = sc.next();
			System.out.print("name :");
			String name2 = sc.next();
			System.out.print("age :");
			String age2 = sc.next();
			System.out.print("today's date :");
			String date2 = sc.next();
			Ex02_VO vo4 = new Ex02_VO();
			vo4.setIdx(idk4);
			vo4.setId(id2);
			vo4.setPw(pw2);
			vo4.setName(name2);
			vo4.setAge(age2);
			vo4.setRegdate(date2);
			int res3 = Ex02_DAO.getUpdate(vo4);
			if (res3 > 0) {
				List<Ex02_VO> list2 = Ex02_DAO.getList();
				prn(list2);
			} else {
				System.out.println("fail");
			}
			break;

		}

	}

	public static void prn(List<Ex02_VO> list) {
		System.out.println("번호\t아이디\t비밀번호\t이름\t나이\t등록일");
		for (Ex02_VO k : list) {
			System.out.print(k.getIdk() + "\t");
			System.out.print(k.getId() + "\t");
			System.out.print(k.getPw() + "\t");
			System.out.print(k.getName() + "\t");
			System.out.print(k.getAge() + "\t");
			System.out.print(k.getRegdate() + "\n");
		}
	}

	public static void prn(Ex02_VO vo) {
		System.out.println("번호\t아이디\t비밀번호\t이름\t나이\t등록일");

		System.out.print(vo.getIdk() + "\t");
		System.out.print(vo.getId() + "\t");
		System.out.print(vo.getPw() + "\t");
		System.out.print(vo.getName() + "\t");
		System.out.print(vo.getAge() + "\t");
		System.out.print(vo.getRegdate() + "\n");
	}
}