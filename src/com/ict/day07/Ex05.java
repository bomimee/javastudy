package com.ict.day07;

public class Ex05 {
	public static void main(String[] args) {
		// string class
//	1.String.getBytes():byte[]
//			해당문자열을 byte[]변환
//			보통 입출력에 사용(대문자,소문자,숫자,영어 만가능)
		String s1 = "java 대한 JAVA";
		byte[] b1 = s1.getBytes();
		for (int i = 0; i < b1.length; i++) {
			System.out.println(b1[i]);
		}
		System.out.println();
		char[] c1 = s1.toCharArray();
		for (int i = 0; i < c1.length; i++) {
			System.out.println(c1[i]);
		}
		// 2. split
		String s2 = "사과, 딸기 망고, 오렌지, 두리안 용과";
		String[] s3 = s2.split(",");
		for (int j = 0; j < s3.length; j++) {
			System.out.println(s3[j]);

		}
		//공간이 모자라면 나머지 한 공간에 모두 들어간다
		String[] s4 = s2.split(" ", 3);
		for (int j = 0; j < s4.length; j++) {
			System.out.println(s4[j]);
		}
		// 공간이 남으면 최대한 사용한고 나머지 공간은 없다
		String[] s5 = s2.split(" ", 15);
		for (int j = 0; j < s5.length; j++) {
			System.out.println(s5[j]);
		}
	}
}
