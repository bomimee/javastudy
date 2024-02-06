package com.ict.day04;

public class Ex06 {
public static void main(String[] args) {
	//int k1 score > =90 A, >=80 B, >=70 c, rest F
	int k1 = 70 ;
	String res ="" ;
	if(k1>= 90) { 
		res = "A";}else if(k1>=80){res="B";}
	else if(k1>=70) {res = "C";}
	else {res="F";
	System.out.println(res);
	}
	//char k2 upper or lower or etc
	char k2 ='a';
	if(k2>='A' && k2<='Z') {res= "UPPERCASE";}
else if(k2>='a' && k2<='z') { res="lowercase";}
else if(k2>='0' && k2<='9') { res="number";}
else {res="etc";}
 System.out.println(res);
	//char k3 A, a => africa, B,b => brazil, C,c = canada
	//    rest korea
	char k3 = 'a';
	if(k3=='A' ||k3 =='a') {res = "Africa";}
	else if(k3=='B'|| k3=='b') {res = "Brazil";}
	else if(k3=='C'|| k3=='c') {res = "Canada";}
	else {res="Korea";}
	System.out.println(res);
	//menu =1 mk 3500, 2 latte 4000, 3 am 3000, 4  juice 3500
	// order 2 -> 10000. change? ( vat 10%, same bv)\
	int menu=4;
	int money = 10000;
	int price = 0;
	int total = 0;
	int order = 2;
	String drink = "";
	int vat =0 ;
	int change = 0 ;
	if(menu==1) {
		drink ="mocka";
		price =3500;
	}
	else if(menu==2) {
		drink ="latte";
		price =4000;
	}
	else if(menu==3) {
		drink="americano";
		price =3000;}
	
	else if(menu==4) {
		drink="fruit juice";
		price =3500;
	}
	total = price * order;
	vat = (int)(total * 0.1);
			change = money - total - vat ;
		System.out.println("menu: "+ drink);
		System.out.println("amount of money paid: "+ money);
		System.out.println("price: "+ price);
		System.out.println("order: "+ order);
		System.out.println("total: "+ total);
		System.out.println("vat: "+ vat);
		System.out.println("change: "+ change);
}
}
