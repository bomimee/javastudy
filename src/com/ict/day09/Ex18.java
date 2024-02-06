package com.ict.day09;

import java.util.Scanner;

public class Ex18 {
	public static void main(String[] args) {
		Ex17 t = new Ex17();
		Scanner scan = new Scanner(System.in);

		// first num
		System.out.print("number 1 : ");
		int k1 = scan.nextInt();

		// second num

		System.out.print("number 2 : ");
		int k2 = scan.nextInt();

		// +-*/
		System.out.print("+, -, *, /");
		String str = scan.next();

		switch (str) {
		case "+":
			t.plus(k1, k2);
			System.out.println("(number1)" + k1 + " + (number2)" + k2 + "=" + t.res);
			break;
		case "-":
			t.sub(k1, k2);
			System.out.println("(number1)" + k1 + " - (number2)" + k2 + "=" + t.res);
			break;
		case "*":
			int k = t.mul(k1, k2);
			System.out.println("(number1)" + k1 + " * (number2)" + k2 + "=" + k);
			break;
		case "/":
			double s = t.div(k1, k2);
			System.out.println("(number1)" + k1 + " / (number2)" + k2 + "=" + s);

			break;

		}

		// print

		// result

	}
}
