package com.ict.day05;

public class Ex02 {
	public static void main(String[] args) {
		// for 정해진 규칙에 다라 실행문을 반복처리
		// 조건식이참일때, 거짓이면 실행 x
		// for(초기식,조건식, 증감식) {참일때 실행할 문장};

//	1.for문 만나면 초기식에간다
//	2/ 초기식 가지고 조건식간다
//	3/ 조건식 참이면 실행 거짓이면 실행 안함
//	4.참일때 실행하다가 포문 끝만나면 다시 증감식으로
//	5.증감식에서 증가/감소 후 다시 조건식
//	6. 조건식 참이면 실행 아니면 실행 안함
//	자바에서는 블록안에서 변수만들고 선언하면 해당 블록에서만 사용가능
//	해당 블록을 벗어나면 변수 사라짐
//	포문의 초기식에서 변수를 만들어 사용
//	초기식에서 만든 변수는 포문 벗어나면 사용못함

//	for (int i=0; i<10;i++) {
//		System.out.println(i);
//	System.out.println("hi");
//	System.out.println("안녕하세ㅇㅛ");
//	}
		int k1;
//	for (k1=0;k1<10;k1++) {
//		System.out.println("hi");
//	}
//	System.out.println(k1);

//10-20 
		for (k1 = 10; k1 < 20; k1++) {
			System.out.println("hi");
		}
		System.out.println(k1);

		// 10-20 even

		for (int i = 0; i < 21; i = i + 2) {
			System.out.println(i);
		}

		// 10-20 odd
//	
//	for(int i=11;i<20;i=i+2) {	
//		System.out.println(i);}
		////////////////////////////////////////////
		// 10-20 even
//		for(int i=0;i<21;i++) {
//			if(i%2==0) {System.out.println(i);
//		}
		// 5k
//	for(i=0;i<20;i++) {	
//		System.out.println("5*"+i+"="+(i*5)); 
//	}	
		for (int i = 1; i < 5; i++) {
			System.out.println("0 0 0 0");
		}
		/////////////////////////////////////////////
		// 4의배수일때
//	if(i%4==0) {
//		System.out.println();
//	}
//	
		////////////////////////////////////////////////////
		// 0- 10 합계
		int sum = 0; // 이전값을 기억시키는 변수
		for (int i = 0; i < 11; i++) {
			sum = sum + i; // 기억값 = 이전기억값 +현재값
		}
		System.out.println(sum);

//홀수 짝수 각각 합계
	
		int even = 0;
		int odd= 0;
		for (int i = 0; i < 11; i++) {
			if (i%2 == 0) {
				even=even+i;
			} else if (i % 2 == 1) {
				odd=odd+i;
			}
		}
		System.out.println("짝수합" + even);
		System.out.println("홀수합" + odd);
		
		// 7!
		int sum4 = 1;
		for (int i = 7; i > 0; i--) {
			sum4 = sum4 * i;
		}
		System.out.println("7!" + sum4);
		int even1 = 0;
		int odd1 = 0;
		//1-2+3-4.............. >100
		for(int i=1;even+odd>=100;i++) {
			if(i%2==1) {odd1=odd1+i;}
			else if(i%2==2) {even=even-i;}
			sum = even+odd;
			System.out.println(sum);
		}
	}
}
