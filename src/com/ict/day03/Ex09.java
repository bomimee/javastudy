package com.ict.day03;

public class Ex09 {
public static void main(String[] args) {
	// 카페 모카 6500원
	// 친구와 둘이서 15000원을 내고 주문
	// 잔돈? ( 부가세 10% 포함)
	
	int bv = 6500;
	int order = 2;
	int money = 15000;
	int total = bv * order;
	double vat = 0.1;
	
	double sum = total * (vat+1);
	
	double ch = money - sum;
	System.out.println(Math.round(ch)+"원");
	
	
}
}
