package com.ict.day10;

public class Ex01 {
	// 메서드 인자를 기본자료형의 값을 인자로 전달 하면 값 호출 (call by value)
	// 원본 값은 변하지 않는다. 
public int add (int k) {
	++k;
	return k;
}
//메서드의 인자를 배열이나 객체를 인자로 전달하면 참조호출 (call by reference)
public void add2(int[]k) {
	for (int i = 0; i < k.length; i++) {
		k[i] =k[i] +10; 
	}
}
}
