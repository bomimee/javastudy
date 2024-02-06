package com.ict.day12;

public class Ex01_Main {
	public static void main(String[] args) {
		Ex01_Sub t = new Ex01_Sub();

		System.out.println(t);
		System.out.println();

		t.play();
		// 부모 클래스의 멤버필드가 private 아니면 접근 가능
		System.out.println(t.addr);
		System.out.println(t.age);

		// static 객체,. 상속 등과 상관없이 그냥 호출가능
		// 클래스 이름, 멤버필드, 클래스 이름.멤버메서드

		System.out.println(Ex01_Sup.car);

		System.out.println(Ex01_Sup.GENDER);
	}
}
