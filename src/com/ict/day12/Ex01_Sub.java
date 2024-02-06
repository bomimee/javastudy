package com.ict.day12;

//상속관계 (is a 관계) :자식 클래스가 부모 클래스의 멤버필드와 멤버메서드를 
//                마음대로 사용할 수 있는 클래스들 간의 관계
//    형식 : 자식클래스 extends 부모클래스 
//    특징 : 모든 클래스는 하나의 부모클래스를 갖는다.
//          없으면 Object 가 부모클래스
//          모든 클래스는 Object 를 부모로 가지고있다
//          다중상속을 지원하지 않는다( 부모클래스 하나만존재)

//자식클래스
public class Ex01_Sub extends Ex01_Sup{
	 String name = "홍반장";
	 int age = 13;
	 double weight = 81.9;
	 
	 public Ex01_Sub() {
		System.out.println("자식 생성자 :" + this);
	}
	 public void play() {
		 //변수 우선순위 
		 // 지역변수 > 전역변수(this) > 부모변수(super)
		 String name = "홍두깨";
		 System.out.println(name);
		 System.out.println(this.name);
		 System.out.println(super.name);
		 
		 System.out.println(age);
		 System.out.println(this.age);
		 
		 System.out.println(addr);
		 System.out.println(this.addr);
		 System.out.println(super.addr);
		 
		 //자기 자신의 private 접근가능
		 System.out.println(weight);
		 
		 //부모의 private 접근 불가
		 
	 }
}
