package com.ict.day09;

import java.util.Scanner;

public class Ex14 {
public static void main(String[] args) {
	Ex12 t = new Ex12();
	t.play02("hong",39,30,30);
		Ex13 t1 = new Ex13();
		t1.play02("lee", 30, 20, 10);
	
		Scanner scan = new Scanner(System.in);
		System.out.print("name : ");
		String k1 = scan.next();
		System.out.print("kor : ");
		int kor = scan.nextInt();
		System.out.print("eng : ");
		int eng = scan.nextInt();
		System.out.print("math : ");
		int math = scan.nextInt();
		
		t1.play02(k1, kor, eng, math);
		
}
}
