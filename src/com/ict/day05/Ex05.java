package com.ict.day05;

public class Ex05 {
public static void main(String[] args) {
//	while문 
//	형식2
//	초기식 또는 현재변수
//	while(true) {
//		if(condition) break; 
	//  실행
//		증감식		
//	}
//	*while 끝만나면 조건식이동
	int k1 =0;
	while (true) {
		if(k1>=11) break;
	System.out.println(k1);
	k1++;}
	// 10-20 even
	int k2=10;
	while(true) {
		if(k2>=21) break;
		if(k2%2==0) System.out.println(k2);
		k2++;
	}
	//a-h 
	char al ='a';
	while(true) {
		if(al=='i') break;
		System.out.println(al);
		al++;
	}
}
}
