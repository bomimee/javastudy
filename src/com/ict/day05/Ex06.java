package com.ict.day05;

import java.util.Scanner;

public class Ex06 {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	while(true) {
	System.out.print("숫자 입력 : ");
	int su = scan.nextInt();
	String result ="";
	if(su%2==0) {result = "even";}
	else{result = "odd";}
	System.out.println(su + "는 "+ result);
	System.out.print("계속할까요? (1.네, 2.아니오)>>");
	int res = scan.nextInt();
	if(res==2) break;
	}
}
}
