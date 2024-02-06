package com.ict.day04;

public class Ex01 {
public static void main(String[] args) {
	//삼항연산자
	//형식) 자료형 변수 = (조건식) ? 참일때 실행할 문장 : 거짓일때 실행할 문장
	// int k1 이 홀수 / 짝수 판별
	// 힌트 어떤 수를 2 나눈 나머지가 0이면짝수, 1이면 홀수
	
	int k1 = 7;
	int res =  k1 % 2 ;
	
	String result = (res == 0) ? "even" : "odd";
	System.out.println(k1 + " : " + result);
	
	result = (k1 % 2 == 0) ? "even" : "odd";
	System.out.println(k1 + " : " + result);
	
	// int k2 > 60 in or out
	int k2 = 70;
	result = (k2 >= 60) ? " in " : " out";	
		System.out.println(k2 + " : " + result);
		
		//k3 =1 (10% discount) 
		int k3 = 2;
		int price = 1000;
		int result3 = (k3 ==1) ? price -(int)(price * 0.1) : price;
		int result4 = (k3 ==1) ? (int)(price * 0.9): price;
		int result5 = (k3 ==1) ?price - (price /10) : price;
		System.out.println(result4);
	
	// char k4 = uppercase or rowercase?
		char k4 = 'Q';
	    String res2 =(k4 >='A' && k4<='Z') ? "uppercase" : " lowercase";
		System.out.println("result : " + res2);
	
		// 근무시간 8시간까지 시간당9860
		//초과한 시간만큼 1.5배
		// 현재 근무시간 10
		// 얼마받나
		
		int time = 10;
		double overTime = 1.5;
		int pay = 9860;
		int res3 = (time > 8) ? (int)((time-8)*pay*overTime+(8*pay)) : pay*time;
		System.out.println(res3);
				
		
		
	
}
}
