package com.ict.day04;

public class Ex03 {
public static void main(String[] args) {
	// 중첩 삼항 연산자 : 삼항 연산자 안에 삼항 연산자가 존재
	// 형식) 자료형 변수 = (조건식1) ? ((조건식2) ? 참일때 : 거짓일때)
	//** 형식) 자료형 변수 = (조건식1) ? 참일때 : ((조건식2) ? 참일때 : 거짓일때);
	int k1 = 70 ;
	String res = (k1 >= 90) ? "A" : ((k1>= 80) ? "B" : "F");
	System.out.println(res);
	
	// char k2 ? upper or lower case
	char k2 = 'd';
	
	res = (k2 >='A' && k2 <='Z')? "uppercase" : ((k2 >= 'a' && k2 <='z') ? "lowercase" : "etc");
		System.out.println(res);	
		
		
	int k3 = 5;
	res = (k3 == 1 || k3 == 3 )? "male" : "female";
	System.out.println(res);
	
	int k4 = 1;
	res = (k4 ==1 || k4==3) ? ((k4==1)
			? "male born in 1990's" :"male born in 2000's" )
			: ((k4==2 || k4==4)? ((k4==2) ? "female born in 1990's" 
					: "female born in 2000's")
					: "not human") ;
	System.out.println(res);
	
	int su1 =4;
	int su2 = 9;
	int res2 = (su1>su2) ? su1 : su2;
	System.out.println(res2);
		
	int res3 = Math.max(su1,  su2);
	System.out.println(res3);
	int res4 = Math.min(su1,  su2);
	System.out.println(res4);
				
}
}