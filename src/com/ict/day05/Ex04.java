package com.ict.day05;

public class Ex04 {
public static void main(String[] args) {
//	while문 
//	형식1 
//	초기식 또는 현재변수
//	while(조건식) {
//		조건식 참일때 실행
//		증감식		
//	}
//	*while 끝만나면 조건식이동
	int k1=0;
	while(k1<11) {
		k1++;
		System.out.println(k1);
	}
	//////////////////////////짝수출력 10-20
	int k2=10;
	while(k2<21) {
		if(k2%2==0) {
		System.out.println(k2);
		}
		k2++;
	}
	int k3 =1;
	while (k3 <10) {
		System.out.println("7 *"+k3+"="+(7*k3));
		k3++;
	}
}
}
