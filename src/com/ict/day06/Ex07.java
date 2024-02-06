package com.ict.day06;

import java.util.Scanner;

public class Ex07 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// odd /even
		esc:while (true) {
		System.out.print("숫자를 넣으세요");
		int num = scan.nextInt();
		String res = "";
		if (num % 2 == 0) {
			res = "짝수";
		} else {
			res = "홀수";
			}
		
			System.out.println(num + "는" + res + "입니다.");	
			
			while(true) {
			System.out.println("계속할까요? (1.네 2 아니오)>>");		
		int result = scan.nextInt();
		if(result == 2) break esc;
		if(result == 1) continue esc;
		System.out.println("제대로 입력하세요");
			} // inside while
	}//outside while
	}
}