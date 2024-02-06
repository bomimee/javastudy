package com.ict.day16;

public class Ex09_Main {
	public static void main(String[] args) {
		Ex09_TestA a = new Ex09_TestA();
		// a.run(); main

		// 1. Runnable 상속받은 클래스를 인자로 넣는다
		Thread t1 = new Thread(a);
		t1.start(); // thread

		Ex09_TestB b = new Ex09_TestB();

		// 2. 익명
		new Thread(b).start();

		// 3. 익명 : android
		new Thread(new Runnable() {

			@Override
			public void run() {
				for (int i = 0; i < 100; i++) {
					System.out.println("111 : " + i + Thread.currentThread().getName());
				}
			}
		}).start();

		System.out.println("ㅅㄱ");
	}
}
