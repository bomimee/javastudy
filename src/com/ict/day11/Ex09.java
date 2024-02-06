package com.ict.day11;

public class Ex09 {
	private String name = "일지매";
	private int age = 24;
	private String addr = "충청도";

	public Ex09() {
	System.out.println("기본생성자 사용");
	name = "호돌이";
	addr = "LA";
		// TODO Auto-generated constructor stub
	}
	public Ex09(String name) {
		
		this.name = name;
	}

	public Ex09(String name, int age) {
		//생성자가 다른 생성자를 호출할때는 
		//생성자 맨 첫출에 this([인자])
		this();
		this.name = name;
		this.age = age;
	}

	public Ex09(String name, int age, String addr) {
		
		this.name = name;
		this.age = age;
		this.addr = addr;
	}

	// getter, setter
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
