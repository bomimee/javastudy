package com.ict.day02;

public class Ex01 {
	public static void main(String[] args) {
//주석: 컴파일러는 해당 줄을 무시하고 사람에게는 보이는 줄 (해당코딩의 설명글을 표시하는 줄)
		// 논리형: boolean - true / false

		// 변수, 상수는 데이터 하나를 저장하는 영역
		// 가장 최신의 데이터만 남는다.
		// 변수에 10이 저장되어있다가, 20을 저장하면 10을 지우고 20 저장
		// 변수 앞에 어떤 데이터를 저장할 수 있는지 맨 처음에 표시 (선언)
		// 논리형을 변수에 기억 시키는 방법
		// 1.boolean 변수이름 ; (선언)
		// 데이터가 변수에 저장된다 라는 뜻
		// boolean형에서 사용할 수 있는 데이터 true/ false
		//
		// 2.변수 이름 = 데이터 (표현범위)

		boolean b1;
		b1 = true;

		// 변수를 호출하면 변수 안에 있는 데이터가 나온다
		System.out.println(b1);

		// false 를 다시 b1에 저장
		b1 = false;
		System.out.println(b1);
		
		// b2
		//자료형(boolean) 변수 이름 =데이터
		boolean b2 = true;
		// 내용보기
		System.out.println(b2);
		// 데이터 변경
		b2 = false;
		System.out.println(b2);
			
		//boolean 은 true/false외 오류 발생
		
		
	}
}
