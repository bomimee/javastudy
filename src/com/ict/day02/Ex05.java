package com.ict.day02;

public class Ex05 {
public static void main(String[] args) {
	//크기 비교 (boolean제외)
	//  byte, short,char, int, long, float, double
	
	//큰자료형은 작은 자료형을 저장할수 있다.
	// 작은 자료형은 큰 자료형을 저장할수 없다
	
	//data 100 -> int s1
	int s1 = 100;
	
	// s1 (data100) -> long s2
	long s2 = s1;
	
	// s1 (data 100) -> double s3
	double s3 = s1;
	System.out.println(s1);
	System.out.println(s2);
	System.out.println(s3);
	
	char s4 = 'a';
	 int s5 = 'a';
	 
	 System.out.println(s4);
	 System.out.println(s5);
}
}
