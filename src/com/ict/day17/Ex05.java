package com.ict.day17;

public class Ex05 implements Runnable {
//두개 스레드 생성 1: 1-50
	// 2: 51-100
	// 1: 101-150
	// 2:151-200

	@Override
	public void run() {
		synchronized (this) {

			int k = 0;

			for (int i = 1; i < 101; i++) {
				System.out.println(k++ + ": " + Thread.currentThread().getName());
				if (k % 50 == 0) {
					try {
						wait();
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				} else
					notify();
			}
		}
	}

}
