package com.ict.day16;

public class Ex08_TestA extends Thread {
	
//	@Override
//		public void start() {
//		for (int i = 0; i < 100; i++) {
//			System.out.println("bbb : "+ i + Thread.currentThread().getName());
//		}
//	} // main이 찍히므로 싱글thread
 @Override
public void run() {
	for (int i = 0; i < 100; i++) {
		System.out.println("aaa : "+ i + Thread.currentThread().getName());
	}
}
}
