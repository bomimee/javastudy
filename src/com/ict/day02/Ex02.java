package com.ict.day02;

public class Ex02 {
public static void main(String[] args) {
	//문자형 : char 0-65535 의 숫자로 저장된다(연산이 가능)
	//  그러나 우리는 숫자 대신에 홑다옴표를 사용('a','A','가'...)
	//선언
	//char 변수이름;(선언)
	char ch1;
	ch1 = 'a';
	System.out.println(ch1);
	
	ch1 = 'A';
	System.out.println(ch1);
	ch1 = 100;
	System.out.println(ch1);
	ch1 = 100-32;
	System.out.println(ch1);
	System.out.println(ch1+32);
	
}
}
