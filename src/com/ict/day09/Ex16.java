package com.ict.day09;

public class Ex16 {
public static void main(String[] args) {
	
	Ex15 t= new Ex15();
	String name = t.play01("kim");
	System.out.println(name);
	System.out.println(t.name);
	
	int k = t.play02(80, 90, 100);	
	System.out.println(k);
	System.out.println(t.sum);
	
	int k2 = t.play03(80, 90, 100);
	System.out.println(k2);
	System.out.println(t.sum);
}
}
