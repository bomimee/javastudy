package com.ict.day02;

public class Ex06 {
public static void main(String[] args) {
	//형 변환 : 자동형변환. 강제형변환
	//자동형변환 = 프로모션: 작은 자료형이 큰자료형으로 변환하는것(저장하는것)
	int s1 = 10;
	long s2 = s1;
	
	long s3 = 10;
	
	//강제형변환 = 디모션 : 큰자료형이 작은 자료형으로 변환할때 오류가 발생하여 강제로 변경시키는 방법
	//(데이터 손실 가능성있다)
	
	double d1 = 35.14;
	int d2 = (int) d1;
	System.out.println(d2);
	
	float f1 = (float)(5426.142);
	System.out.println(f1);
	
	// 자동형 변환
	int k1 = 'a';
	System.out.println(k1);
	
	//char가 0~65,535 사이 값은 받을 수 있다
	char k2 = 105;
	
	int k3 = 105;
	char k4 = (char)(k3);
	System.out.println(k4);
}
}
