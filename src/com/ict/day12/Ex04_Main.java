package com.ict.day12;

public class Ex04_Main {
	public static void main(String[] args) {
		Ex04_Game t = new Ex04_Game();
		
		t.play();
		t.sound();
		t.call();
		t.sms();
		//t.picture();
		
		//우선순위는 가까운거순서대로 
		System.out.println(t.number);
		
	}
}
