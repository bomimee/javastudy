package com.ict.day12;

public class Ex07_Cat extends Ex07_Animal{
int id = 124123;

public Ex07_Cat() {
	// super() ; 생략되어있다
	// super() ; 부모 클래스의 주소를 참조
	//super(인자) ; 부모클래스의 생성자
	super("짜오",3);
	System.out.println("자식생성자");
} 
//모든 자식 클래스는 부모 클래스의 생성자를 참조해야된다.
public Ex07_Cat(String name) {
	super(name, 7);
}
}
