package com.ict.day04;

import java.util.Scanner;

public class Ex07 {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	
	System.out.println("메뉴");
	
	System.out.println("1.모카 3500");
	System.out.println("2.라테 4000");
	System.out.println("3.아메리카노 3000");
	System.out.println("4.쥬스 4000");	
	System.out.print("메뉴 선택");
	int menu = scan.nextInt();
	System.out.print("몇잔?");
	int order = scan.nextInt();
	System.out.print("입금");
	int money = scan.nextInt();
	System.out.print("잔돈");
	int change = 0;
	String drink = "";
	int total = 0;
	int vat = 0;
	int price = 0;
	
	if(menu==1) { drink = "mocka"; price = 3500; }
	else if (menu==2) {drink = "latte"; price = 4000; }
	else if (menu==3) {drink = "americano"; price = 3000; }
	else if (menu==4) {drink = "juice"; price = 4500; }
	total = price * order;
	vat=(int)(total * 0.1);
	change = money - total - vat;
	System.out.println(change);
	
}
}
