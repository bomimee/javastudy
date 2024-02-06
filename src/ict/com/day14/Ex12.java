package ict.com.day14;

import java.util.Scanner;

public class Ex12 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		esc:while(true) {
			try {
				System.out.print("number : ");
				
				String su = scan.next();
				int s1 = Integer.parseInt(su);
				String res = "";
				if(s1%2==0) {
					res = "짝수";
				}else {res = "홀수";
				
				}System.out.println(su +"는"+res +"입니다");
				
			} catch (NumberFormatException e) {
				System.out.println("제대로입력하세요");
				
			}
			while(true) {
				System.out.println("continue? (y/n)");
				String msg = scan.next();
				//equals() : 대소문자 구별
				//equalsIgnoreCase()
				if(msg.equalsIgnoreCase("y")) {
					continue esc;
				}if(msg.equalsIgnoreCase("n")) {
					break esc;
				}
				System.out.println("제대로입력하세요");
			}
		} System.out.println("수고하셨습니다.");
	}
}
