package com.ict.day03;

import java.util.Scanner;

public class Ex11 {
public static void main(String[] args) {
//  이름, 국어 영어 수학 점수를 키보드로 입력받아
	 // 총점과 평균
	 // 출력을 이름, 총점. 평균 출력( 소수점 둘째자리 까지)
	Scanner scan = new Scanner(System.in);
			System.out.print("이름: ");
	String name = scan.next();

	
			System.out.print("국어점수: ");
	int ko = scan.nextInt();
	
			System.out.print("영어점수: ");
	int en = scan.nextInt();

			System.out.print("수학점수: ");
	int math = scan.nextInt();
	int totalScore = ko + en + math;
	double avg = (int)(((totalScore)/3.0) * 100);
	double avg2 = avg / 100 ;
	
	System.out.println("이름은" + name + "국어점수는" + ko + "영어점수는"+ en + "수학점수는"+ math + "총점은" + totalScore + "평균은" + avg2);
	
}
}
