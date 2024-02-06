package com.ict.day16;

/*
 * threads
 * 현재실행중인 프로그램내에서 실행되는 세부작업단위 
 * 싱글 : 하나 threads
 * 멀티 : 여러개 threads
 * 생성: start() => run()
 * 1.Thread Class inheritance : start(), run() method...
 * 2. Runnable interface inheritance ; run() method (abstract method)
 * 
 * thread constructor ; Thread() Thread(Runnable interface inherited object)
 *                      Thread(thread name), Thread(Runnable interface inherited object, thread name)
 */
public class Ex07 {
	public void play() {
		System.out.println("2: " + Thread.currentThread().getName() );
	}
	public void start() {
		System.out.println("4: " + Thread.currentThread().getName() );
	}
	
	public static void main(String[] args) {
		//
		System.out.println("1: " + Thread.currentThread().getName());
		
		Ex07 test = new Ex07();
		test.play();
		
		System.out.println("3: " + Thread.currentThread().getName());
		test.start();
		
		System.out.println("5: " + Thread.currentThread().getName());
		System.out.println("수고");
		
	}
}
