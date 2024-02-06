package com.ict.day11;

public class Ex01 {
//생성자: 클래스를 객체로 만들때 한번 호출된다 
	// 클래스이름 참조변수 = new 생성자() -> 인자가 있을수도있고 없을수도있다
	// 생성자의 목적: 멤버필드(변수,상수) 의 초기값지정
	// 특징: 클래스이름 = 저장이름 = 생성자 이름
	// 반환형이 없는 메서드와 같다
	// 메서드처럼 기능, 동작 할수 있다
	// 클래스의 생성자가 없으면 기본생성자로 객체를 생성한다
	// 기본생성자란 인자가 없는 생성자를 말한다
	// 생성자도 오버로딩 가능(여러개 생성자 만들 수 있다_)

	private String name = "일지매";
	private int age = 24;
	private String addr = "충청도";

//	public Ex01() {
//		System.out.println("Ex01 생성자");
//		name = "희동이";
//		//멤버필드의 값을 지정(초기값)
//		//메서드 처럼 다른 기능을 만들수도있다
//		//메서드 처럼 다른 메서드를 호출할수있다.
//		//다른 생성자를 호출할수있다 (메서드는 생성자 호출못함)
	
//	}
//	
//	public Ex01(String name) {
//		//super();
//		this.name = name;
//	}
	public Ex01(String name, int age) {
		//super();
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getAddr() {
		return addr;
	}

	public void setAddr(String addr) {
		this.addr = addr;
	}

}
