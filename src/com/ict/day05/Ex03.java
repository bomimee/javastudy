package com.ict.day05;

public class Ex03 {
public static void main(String[] args) {
	for(int i=0;i<4;i++) {
		System.out.println("명령문1");
		for(int j=0;j<6;j++) {
			System.out.println("i=" +i +", j=" +j);
		}
		System.out.println("명령문");
	}
	for(int i=2;i<10;i++) {
		System.out.println(i+"단");
		for(int j=1; j<10;j++) {
			System.out.println(i+"*"+j+"="+i*j);				
		}
	}
	////////////////////구구단2
	for(int i=2;i<10;i++) {
		for(int j=1; j<10;j++) {
			 System.out.print(i+"*"+j+"="+(i*j) +"  ");
			 }	
		System.out.println();
		}
	/////////구구단3
	for(int i=1;i<10;i++) {
		for(int j=2; j<10;j++) {
			System.out.print(j+"*"+i+"="+(i*j) +"  ");
		}	
		System.out.println();
	}
		for(int i=0;i<4;i++) {
			for(int j=0;j<4;j++) {
				System.out.print("0");
			}
			System.out.println();
		}
		////////////////////////////////////////////
		for(int i=1;i<5;i++) {
			for(int j=0;j<4;j++) {
				System.out.print(i==j+1? "1" : "0");
			}
			System.out.println();
		}
	}
}

