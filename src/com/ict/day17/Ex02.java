package com.ict.day17;

public class Ex02 implements Runnable {

	int x = 0 ;
	// dog, cat, tiger, lion  thread 같이 사용하는 영역(임계영역)
	//임계영역은 일처리를 제대로 하기 전에 다른 스레드에게 제어권을 빼앗길수 있는 문제점이 있다
	//이런 문제점을 해결한 것이 동기화
	//동기화란 먼저 차지한 스레드가 끝날때까지 다른 스레드가 제어권을 빼앗을 수 없게 락 걸어버린다
	//동기화 방법은 해당 메소드 반환형 앞에 싱크로나이즈드 예약어 사용
	@Override
	public void run() {
		for (int i = 0; i < 50; i++) {
			System.out.println(x++ +":" + Thread.currentThread().getName());
		}
		
	}

}
