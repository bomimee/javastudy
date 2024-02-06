package com.ict.day11;

import java.util.Random;

public class Ex17 {
	public static void main(String[] args) {
		// random 처리
		// 1.Math.random(), Random Class
		// Math전체 메서드사 static 이므로 객체 생성없음
		// Math.random(); 0.0 ~ 1.0미만

		System.out.println(Math.random());

		// 특정범위 ;: (int)(Math.random() * 숫자)
		System.out.println((int) (Math.random() * 5));

		Random ran = new Random();
		
		// 각종 자료형의 난수 발생 : 자료형 범위 안에서 난수 발생
		System.out.println("boolean형 : " + ran.nextBoolean());
		System.out.println("int형 : " + ran.nextInt());
		System.out.println("long형 : " + ran.nextLong());
		
		//0.0 ~ 1.0 미만
		System.out.println("float형 : " + ran.nextFloat());
		System.out.println("double형 : "  + ran.nextDouble());
		
		//특정 범위 안에서 난수 발생 : 0 ~ 범위 전까지 난수 발생(정수)
		//1. nextInt(범위) : 0~ 범위 전까지 난수 발생
		//2. (int)(nextDouble () * 범위) ; 0~ 범위 전까지 난수 발생
		System.out.println(ran.nextInt(7));
		System.out.println((int)(ran.nextDouble()*7)); //0~ 6

	}
}
