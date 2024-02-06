package com.ict.day03;

public class Ex06 {
 public static void main(String[] args) {
	//   이름이 홍길동인 사람의 점수가
	 // 국어 90 영어 80 수학 80
	 // 총점과 평균
	 // 출력을 이름, 총점. 평균 출력( 소수점 첫째자리 까지 구하자
	 
 String name = "홍길동"; 
 int ko = 90 ;
 int en = 80 ;
 int math = 80;
 int total = ko + en + math;
 double av = (int)(total / 3.0 * 10)/10.0;
 double av2 = (int)(total / 3.0 * 100)/100.00;
 System.out.println(av2);
 
 int k1 = (198745 /10) * 10;
 int k2 = (198745 /100) * 100;
		 System.out.println(k1);
		 System.out.println(k2);
 
 System.out.println(name + ": 총점 = " + total + ", 평균 = " + av);
	
 }
}
