package ict.com.day13;

//인터페이스 : 서비스를 제공하는 목록 
//	상수와 추상메서드로 구성되어있음
//	생성자가 없음 (객체생성 안됨)
//	**상속과 달리 인터페이스는 하나의 클래스가 둘 이상의 인터페이스를 동시에 구현 할 수 있다
// 인터페이스가 같다라는 뜻은 호환/대체가 가능하다는 뜻이다
//자바 8 버전부터 지원 ; 스태틱 메서드 추가, 디폴트 메서드(완전한 메서드) 추가
class Ex01 {

	int su1 = 10;
	static int su2 = 20;
	final int SU3 = 30;
	static final int SU4 = 40;

	// public abstract void sound();
	// public void play();
}

// 스테틱 파이널을 생략할 수있다. 자동으로 상수로 인식
interface Ex02 {
	// 원래는 변수명을 대문자 사용
	int su1 = 10;
	static int su2 = 20;
	final int su3 = 30;
	static final int su4 = 40;

	//일반메서드는 사용못함
	//public void like() {}
	
	//abstract 생략 가능
	public abstract void sound();
	public void play();
}