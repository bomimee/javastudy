package com.ict.day03;

public class Ex02 {
public static void main(String[] args) {
	// 비교연산자 : > <>= <= == !=
// 비교연산자를 사용할 수 있는 기본 자료형 : 문자형, 정수형, 실수형
	// 비교연산 결과는 무조건 논리형
	//논리형은 기본적으로 조건식에 사용
	
	 int su1 = 90;
	 int su2 = 80;
	 boolean result = su1 > su2;
	 System.out.println(result);
	 
	 double su3 = 98.3;
	 double su4 = 89.0;
	 result = su3 > su4;
	 System.out.println(result);
	 
	 char su5 = 'a';
	 char su6 = 'A';
	 
	 result = su5 > su6;
	 System.out.println(result);
			
}
}
