package com.ict.day06;

public class Ex06 {
	public static void main(String[] args) {
		// continue & continue label
		// continue : 증감식이동
		// 컨티뉴 라벨: 컨티뉴 이하 수행문 포기, 레이블 있는 반복문의 증감식으로 이동
		// 1-`0
		for (int i = 1; i < 11; i++) {

			System.out.println(i + " ");

		}
		System.out.println();

		///////////////////////// continue
		for (int i = 1; i < 11; i++) {
			if (i == 6)
				continue;
			System.out.println(i + " ");

		} /////////////////////// continue label
		System.out.println();
		esc: for (int i = 1; i < 11; i++) {
			if (i == 6)
				continue esc;
			System.out.println(i + " ");

		}
		System.out.println();
		System.out.println("다중 포문 컨티뉴 라벨사용");
		for (int i = 1; i < 4; i++) {
			for (int j = 1; j < 6; j++) {
				
				System.out.println("i+" + i + ", j+" + j);
			}
		}
		///////////////////////////////////continue
		System.out.println();
		for (int i = 1; i < 4; i++) {
			for (int j = 1; j < 6; j++) {
				if(i==2) continue;
				
				System.out.println("i+" + i + ", j+" + j);
			}
		}
		System.out.println();
		//////////////////////////////////////continue label
		con:for (int i = 1; i < 4; i++) {
			for (int j = 1; j < 6; j++) {
				if(i==2) continue con;
				
				System.out.println("i+" + i + ", j+" + j);
			}
		}
		System.out.println();


	}
}
