package com.ict.day03;

public class Ex03 {
public static void main(String[] args) {
	// 논리연산자 : &&(논리곱,교집합) ||(논리합,합집합) !(논리부정)
	// 논리연산자 대상은 boolean(비교연산, 논리연산자, 논리형)
	// 논리연산자의 결과는 boolean
	// && 주어진 조건들이 모두 참일때 결과는 참(거짓있으면 결과는 거짓)
	// 거짓 이후에 연산 하지 않는다
	// and 조건 이요하면 범위 지정할수 있다
	// a>=10 && a<=20
	
	int su1 = 10;
	int su2 = 7;
	boolean res ;
	// true && true = true
	res = (su1>=7) && (su2>=5);
	System.out.println(res);
	// true && false 
	res = (su1>=7) && (su2<=5);
	System.out.println(res);
	// false && true
	res = (su1<=7) && (su2>=5);
	System.out.println(res);
	// false && false
	res = (su1<=7) && (su2<=5);
	System.out.println(res);
	
	// int su1 = 10, int su2 = 7
	res = ((su1 = su1 +2) < su2) && (su1 == (su2=su2+5));
	System.out.println("result : " + res);
	System.out.println("su1 : " + res);
	System.out.println("su2 : " + res);
	
	int su3 = 34;
	res = su3 >=20 && su3 <=30;
	System.out.println(res);
	
	res = su3 >=30 && su3 <=40;
	System.out.println(res);
	
	// char c1 이 소문자?
	char c1 = 'G';
	res = c1 >='a' && c1 <='z';
			System.out.println(res);
	
	c1 = 'm';
	res = c1 >='a' && c1 <='z';
			System.out.println(res);
}
}
