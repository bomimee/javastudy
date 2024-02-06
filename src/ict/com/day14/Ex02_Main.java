package ict.com.day14;

public class Ex02_Main {
public static void main(String[] args) {
	// 멤버 내부클래스는 별도로 객체생성안됨
	//Inner01 t1 = new Inner01()
	
	//외부클래스 통해서 내부클래스 객체생성
			Ex02 t1 = new Ex02();
			//티투 주소에 반드시 달러가 존재한다. 
	Ex02.Inner01 t2 = t1.new Inner01();
	System.out.println();
	t2.play();
}
}
