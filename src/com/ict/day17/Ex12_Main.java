package com.ict.day17;

public class Ex12_Main {
	public static void main(String[] args) {

		// 반환값으로쓰는 람다식
		Ex12 t = returnString();
		t.showString("Hello");

		//매개변수로 전달하는 람다식
		Ex12 t2 = s -> System.out.println(s);
		showMyString(t2);
//////////////////////////////////////////////
		showMyString(new Ex12() {
//자바식 1 
			@Override
			public void showString(String str) {
				System.out.println(str + "님 방가");
			}
		});
//자바식 2
		Ex12 t3 = returnString2();
		t3.showString("Lamda");
	}//Main
	
///////////////////////////////////////////////////
	// 매개변수로 전달하는 람다식
	public static void showMyString(Ex12 k) {
		k.showString("world");
	}

	// 반환값으로쓰는 람다식
	public static Ex12 returnString() {
		return s -> System.out.println(s + "님 환영");
	}
	
	//////////////////////////////////////////////
///////////////////////////////////////////////////
	// 자바식 2
	public static Ex12 returnString2() {
		return new Ex12() {
			@Override
			public void showString(String str) {
				// TODO Auto-generated method stub
				System.out.println(str + "님 hi");
			}
		};
	}

}