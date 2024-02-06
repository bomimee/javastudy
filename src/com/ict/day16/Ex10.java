package com.ict.day16;

public class Ex10 implements Runnable{

	@Override
	public void run() {
		while(true) {
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("11111111111");
		}
	}

	

}
