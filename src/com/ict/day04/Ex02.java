
package com.ict.day04;

import java.util.Scanner;

public class Ex02 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("type number: ");
		int k1 = scan.nextInt();
		String result = (k1 % 2 == 0) ? "even" : "odd";
		System.out.println(k1 + ":" + result);
		
		System.out.print("type number(int): ");
		int k2 = scan.nextInt();
		String result2 = (k1 >= 60 ) ? "success" : "fail";
		System.out.println(k1 + ":" + result2);
		
		//System.out.print("practice ");
		//String sen = scan.next();
		//System.out.println("typing " + sen);
		//sen = scan.nextLine();
		//System.out.println("typing any " + sen);
		
	}

}

