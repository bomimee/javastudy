package com.ict.day06;

public class Ex02 {
	public static void main(String[] args) {
		// break / continue
//	break: for while switch 탈출
//	continue: continue 이하 수행문 포기 다음회차로 진행하는 예약
//	for 문 경우 증감식으로 이동 while 문 경우 조건식으로 이동
//	보통 if 문고 ㅏ같이 사용
//	
//	1-10
		for (int i = 1; i < 11; i++) {
			System.out.print(i + "\t");
		}
		System.out.println();
		// 1-10 , 6 break
		for (int i = 1; i < 11; i++) {
			if (i == 6)
				break;
			System.out.print(i + " ");
		}
		System.out.println();

		for (int i = 1; i < 11; i++) {
			System.out.print(i + " ");
			if (i == 6)
				break;
		}
		System.out.println();

		// 1-10 . 6 continue
		for (int i = 1; i < 11; i++) {
			if (i == 6)
				continue;
			System.out.print(i + " ");
		}
		System.out.println();
		for (int i = 1; i < 11; i++) {
			System.out.print(i + " ");
			if (i == 6)
				continue;
		}
		System.out.println();
		//1-10 even
		for (int i=1;i<11;i++) {
			if(i%2==1) continue;
			System.out.print(i + " ");		
		}
			System.out.println();

	}
}
