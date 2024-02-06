package com.ict.day09;

public class Ex06 {
	String name = "hong";
	static int kor = 80;
	static int eng = 95;
	static int math = 95;
	int total = 0;
	
	//static method
	public static void play01() {
		// static method 가 전역변수 사용하려면 전역변수 static
		int sum = kor + eng + math;
		//System.out.println(name);
		System.out.println(kor);
	}
	
	public static int play02() {
		int sum = kor + eng + math;
		return sum;
	}
}
