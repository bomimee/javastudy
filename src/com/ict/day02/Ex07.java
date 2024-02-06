package com.ict.day02;

public class Ex07 {
	public static void main(String[] args) {
		// String : 문자열을 처리하기 위한 ㅡㅋㄹ래스
		// 기본자료형은 아니다. 참조자료형(클래스를 자료형으로 사용)이다
		// 기본자료형과 같은 사용법
		// 데이터에는 반드시 "내용"사용
		// String 이름 = "내용"

		// +연산자 사용할수있다
		// 실제로 더하는 것이 아니라 문자열 연결
		// + 연산하면 무조건 결과는 문자열이다

		String s1 = "Hello";
		// String s2 = 10;
		// String s3 = 3.14;
		// String s4 = 'a';
		String s5 = "a";

		System.out.println(s5);
		System.out.println(s1);

		String k1 = "1000";
		int k2 = 1000;
		System.out.println(k2 + 100);
		System.out.println(k1 + 100);

		//int k3 = 105 + "105";
		String k4 = 105 + "105";
		//System.out.println(k3);
		System.out.println(k4);
		
		int su1 = 20;
		int su2 = 4;
		System.out.println(su1+su2);
		System.out.println("합계: " + su1+su2);
		System.out.println("합계: " + (su1+su2));
	}
}
