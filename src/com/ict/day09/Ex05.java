package com.ict.day09;

public class Ex05 {
public static void main(String[] args) {
//	Ex04 클래스를 객체로 만들어야 Ex04 사용가능
//	Ex04 가 가지고 있는 필드와 메서드를 사용할 수 있다
//	Ex04 클래스를 객체로 만들기
	Ex04 t = new Ex04();
	
	System.out.println(t.name);
	
//	Ex04 play01 call
//	play01 -void no data
	System.out.println(1);
	t.play01();
	System.out.println(4);
	t.play02();
	//System.out.println(t.sum);
	int k = t.play03();
	System.out.println(k);
}
}
