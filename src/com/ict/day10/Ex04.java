package com.ict.day10;

public class Ex04 {
	public static void main(String[] args) {
		
		Ex03 ex03 = new Ex03();
		double k1 = ex03.plus(10,12);
		System.out.println(k1);
		k1 = ex03.plus(10.4,15.8);
		System.out.println(k1);
		k1 = ex03.plus("10.5","15.8");
		System.out.println(k1);
	}

}
