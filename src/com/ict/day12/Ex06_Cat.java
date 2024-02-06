package com.ict.day12;

public class Ex06_Cat extends Ex06_Animal{
public void play() {
	age = age+ 10;
	System.out.println(age);
}
public void play2() {
	//month = month + 10; 상수는 변경X 
	age = month +10 ; // 사용 가능
	System.out.println(age);
}
	
	@Override
	public void sound() {
		
		System.out.println("야옹 야옹");
		//super.sound();
}
	//부모 클레스 슬립에 파이널이 있으므로 오버라이딩 안됨
//	@Override
//	public final void sleep() {
//		
//		System.out.println("15시간 이상잠을잔다");
//		
//	}
}
