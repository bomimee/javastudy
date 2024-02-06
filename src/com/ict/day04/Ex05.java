package com.ict.day04;

public class Ex05 {
public static void main(String[] args) {
	int k1=7;
	String result ;
	if(k1 %2 ==0) {
		result = "even";
	}else {
		result = "odd";
	}
	System.out.println("k1 :" + result );
	///////////////////////////////////////////////////////////////
	
	int k2 =70;
	if(k2>=60) {
		result = "success";
	}else { result = "fail";
	}
	System.out.println(result);
	///////////////////////////////////////////////
	int k3 =1;
	int price = 1000;
	int res2;
	if(k3==1) {
		res2= (int)(price*0.9);
	}else {res2 = price;}
	System.out.println(res2);
	////////////////////////////////////////////
	char k4='A';
	if(k4>='A'&& k4<='Z') {
		result = "uppercase";	
	}else {result = "lowercase";}
	System.out.println(result);
	//근무시간 8시간까지는 시간당 9860
	// 8시간 초과 시 1.5
	//현재근무 시간 10
	//얼마?
	int time = 10;
	int dan = 9860;
	int pay = time * dan; 
	int res;
	if( time<=8) { res = pay;
} else { res = pay + (int)((time-8)*dan*1.5);
}
	System.out.println(res);
}
}