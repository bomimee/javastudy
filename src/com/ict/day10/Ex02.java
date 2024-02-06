package com.ict.day10;

public class Ex02 {
public static void main(String[] args) {
	Ex01 t = new Ex01();
	int var1 = 100;
	int var2 = t.add(var1);
	
	System.out.println(var1); //100
	System.out.println(var2); //101
	
	int[] su = {1, 10,100,1000};
	//인자가 객체(배열도 포함) 자료형 : Call by reference
	//참조되는 값이 변할 수도 있다. 
	t.add2(su);
	//배열 안에 값이 변한다
	for (int i=0; i <su.length;i ++) {
		System.out.println(su[i]);
	}
}
}
