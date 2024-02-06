package com.ict.day09;

public class Ex08 {
String name = "";
int sum = 0;
double avg = 0.0;
String hak = "";


// 이름받기
// 외부 데이터는 메서드의 인자를 통해 받는다. 
//메서드이름(인자){실행내용}
//인자- 자료형 변수
public void play01(String k1) {
	name = k1;
}
// sum
public void play02(int k4, int k2, int k3) {
	sum = k4 + k2 + k3;
	
}
// avg
public void play03() {
	avg = (int)(sum/3.0 * 10) / 10.0;
}
// hak
public void play04() {
	if(avg>=90) {
		hak="A학점";		
	}
	else if(avg>=80) {
		hak="B학점";		
	}
	else if(avg>=70) {
		hak="C학점";		
	} else { hak ="F학점";
}
	//print
	}
public void play05() {
	System.out.println("name: "+name);
	System.out.println("sum: "+sum);
	System.out.println("avg: "+avg);
	System.out.println("hak: "+hak);
}}
