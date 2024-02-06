package com.ict.day06;

import java.util.Scanner;

public class Ex08 {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	// 총 몇번 실행? 짝수 몇번 출력, % (소수점첫자리)
	int even=0;
	int count = 0;
	//double percent=1.0;
	

	esc:while(true) {
		count++;
		System.out.print("enter any number");
		int num = scan.nextInt();
		String res ="";
		if(num%2==0) {
			res="even";
			even++;	
			}
		if(num%2==1) {res="odd";}
		System.out.println(res);
		while(true) {
			System.out.print("continue?   1. yes 2. no>>>");
			int ans = scan.nextInt();
			if(ans==1) continue esc;
			if(ans==2) break esc;
			System.out.println("enter 1 or 2 only");
		}
	} 
	System.out.println(" 수고하셨습니다 ");
	double percent=(even/(count*1.0))*100;
	System.out.println("total: "+ count); 
	System.out.println("even:"+ even);
	System.out.println("percent: " + ((int)(percent*100)/100.0) +"%");
	
	}
}

