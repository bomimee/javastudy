package com.ict.day07;

public class Ex03 {
public static void main(String[] args) {
	// 선언
	//char[] ch];
	//생성
	//ch = new char[4]
	// 선언 생성 같이
	char[] ch = new char[4];
	ch[0] = 'J';
	ch[1] = 'A';
	ch[2] = 'V';
	ch[3] = 65; //0 - 65535 까지 가능
	for(int i=0;i<ch.length;i++) {
		System.out.println(ch[i]);
	}
	// 선언과 생성과 초기값 넣기를 한번ㅇ
	 char[] ch2 = {'j','a','v','a',97};
	 int[] k2 = {100,200,300,'a'};
	 double[] d2 = {7.15,7.16,7.0,7};
	 //자료형 클래스 - 참조자료형 배열 (객체형배열)
	 String[] s1 = {"홍길동","이길동","고길동","백길동"} ;
	 for (int i = 0; i < k2.length; i++) {
		System.out.println(ch2[i]);
		System.out.println(k2[i]);
		System.out.println(d2[i]);
	}
	
}
}
