package com.ict.day11;

public class Ex15 {
//static 초기화
	/*
	 * static { 초기화 내용 ; }
	 */

	int s1 = 100;
	private int p1 = 300;
	static int s2;
	static int s3;

	public static int k2 = 300;
	static int k3 = 300;
	private static int k4 = 5000;

	static int m2 ;
	static int j2 = 400;
	static {
		k2 = 20000;
		s2 = 50000;
		j2 = 40000;
	} //초기화 블록
}
