package com.ict.day04;

public class Ex04 {
public static void main(String[] args) {
	int k1 =59;
	String result = "초기값";
	
	if (k1>=60) { result = "합격";
	}
	if (k1<60) { result = "불합격";
	}

	System.out.println("결과 : " + result);
	
	int k2 =49;
	String result2 = "불합격";
	
	if (k1>=60) { result2 = "합격";
	}
	
	System.out.println("결과 : " + result2);
}
}
