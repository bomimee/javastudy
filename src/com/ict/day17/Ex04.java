package com.ict.day17;

public class Ex04 implements Runnable {
// 두개의 스레드를 생성하여 첫번째 스레드 출력 1-100
//	두번째 수레드가 출력을 101-200 까지 출력(싱크로사용)
	@Override
	public synchronized void run() {
		int k = 0;

		for (int i = 1; i < 101; i++) {
			System.out.println(k++ + ": " + Thread.currentThread().getName());
		}

	}
}
