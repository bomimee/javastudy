package com.ict.day07;

public class Ex02 {
	public static void main(String[] args) {
//	배열 : 같은 자료형의 데이터를 한곳에 모아둔 묶음
//	** 같은 자료형
//	생성할때 크기 지정 (지정안하면 생성안됨)
//	한번 지정한 크기 변경안됨
//	배열 안에 데이터 가져오기 위해서는 일반적으로 포문사용
//	배열 생성 순서 = 선언 -생성-초기화(데이터저장)
//	1. 선언 : 자료형 이름[] 또는 자료형[]이름

		int su[]; // int[] su

		// 2. 생성 ; 이름 = new 자료형[배열크기 = 갯수]
		// new 예약어: 메모리에 데이터 저장할 공간 만들어달라 => 인스턴스, 객체생성
		su = new int[4];
		
		//3. data 저장: 이름[index=위치값 = 0부터시작]
		//데이터는 같은 자료형 (프로모션 가능: 작은 자료형이 큰자료형으로 변경)
		
		su[0] = 100;
		su[1]= 'a'; // 프로모션 
		su[2] = (int)(3.14); //디모션  - 강제 형변환
		//su[2] = 3.14; 
		su[3] = 100;
		//배열 크기보다 크면 
		//su[4] =107 // 실행하면 오류발생
		//배열 호출하면 주소 출력 - 생성 ID
		System.out.println(su);
		System.out.println(su[0]);
		System.out.println(su[1]);
		System.out.println(su[2]);
		System.out.println(su[3]);
		
		//
	}
}
