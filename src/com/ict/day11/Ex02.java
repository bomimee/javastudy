package com.ict.day11;

public class Ex02 {
public static void main(String[] args) {
	//Ex01 객체생성
	Ex01 ex01 = new Ex01("도우너", 11);
	//이름 나이 주소 출력
	System.out.println("이름 : " + ex01.getName());
	System.out.println("나이 : " + ex01.getAge());
	System.out.println("주소 : " + ex01.getAddr());
	System.out.println();
	// 임꺽정, 나이 34 함경도
	ex01.setName("임꺽정");
	ex01.setAge(34);
	ex01.setAddr("함경도");

	System.out.println("이름 : " + ex01.getName());
	System.out.println("나이 : " + ex01.getAge());
	System.out.println("주소 : " + ex01.getAddr());

	//Ex01 ex012 = Ex01();
}
}
