package com.ict.day17;

public class Ex03 implements Runnable{
	int x = 0;
	
	//동기화 방법을 하면 동기화 처리할때 현재 실행중인 스레드를 강제로 대기상태로 변경시키는 메소드가 wait다.
	//wait() 된 스레드를 풀어주는 예약어가 notify(). notifyAll()
	@Override
	public void run() {
		for (int i = 0; i < 50; i++) {
			System.out.println(x++ +":" + Thread.currentThread().getName());
		if(x==11)
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}else notify();
		}
		
	}

}
