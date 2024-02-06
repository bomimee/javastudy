package com.ict.day17;

public class Ex11_Main {
	public static void main(String[] args) {
		Ex11 t = s -> System.out.println(s);
		t.showString("Hello lamda1");
		showMyString(t);
		
		//자바식
		showMyString(new Ex11() {
			
			@Override
			public void showString(String str) {
				System.out.println("Hello, lamda3");
				
			}
		});

	}

	public static void showMyString(Ex11 k) {
		k.showString("Hello, lamda2");
	}

}
