package com.ict.day08;

public class Ex02 {
public static void main(String[] args) {
	//선언과 생성 하나로
	//자료형[][] 이름 = new 자료형 [1차원배열수][1차원 배열이 참조하는 배열수]
	System.out.println("고정길이 일때만 사용");
	char[][] ch = new char[3][2];
	ch[0][0] ='a';
	ch[0][1] = 'A';
	ch[1][0] ='b';
	ch[1][1] = 'B';
	ch[2][0] ='c';
	ch[2][1] = 'C';
	for (int i = 0; i < ch.length; i++) {
		for (int j = 0; j < ch[i].length; j++) {
			System.out.println(ch[i][j]);
		}
	}
	System.out.println();
	System.out.println("고정,가변길이모두사용");
	int [][] su = new int[3][2];
	
	int[]k1 = {10,20};
	int[]k2 = {100,200};
	int[]k3 = {1000,2000};
	
	su[0] =k1;
	su[1] =k2;
	su[2] =k3;
	 
	for (int i = 0; i < su.length; i++) {
		for (int j = 0; j < su[i].length; j++) {
			System.out.println(su[i][j]);
		}
	}
	//선언고 ㅏ생성., 데이터 저장 한번에
	//int [] num ={100,200,300}
	int[][]num = {{1,2},{10,20},{100,200}};
	
	for (int i = 0; i < num.length; i++) {
		for (int j = 0; j < num[i].length; j++) {
			System.out.println(num[i][j]);
		}
		
	}
}
}

