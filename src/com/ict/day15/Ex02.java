package com.ict.day15;

import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

public class Ex02 {
public static void main(String[] args) {
	// Set interface implemented class ; HashSet, TreeSet
	// 특징; 중복불가. 특정기준으로 정렬안됨 (단, 트리셋은 항상 오름차순 유지) 주머니 구조라고 생각하자 
	//형식 : HashSet<generic =object type = class> reference variable = new HashSet<[Generic]>();
	//형식 : TreeSet<generic =object type = class> reference variable = new TreeSet<[Generic]>();
	       
	//1. collection 생성
	//HashSet<E> h1 = new HashSet<E>();  // <> 안에 기본자료형  X
	HashSet<Integer> h1 = new HashSet<>(); //  <>뒤에 는 생략가능 
	HashSet<Double> h2 = new HashSet<>();
	TreeSet<String> h3 = new TreeSet<>();
	// TreeSet<E>
	TreeSet<Character> h4 = new TreeSet<>();
	
	// 2.collection 객체넣기 add
	
	Integer k1 = new Integer(10);
	Integer k2 = new Integer(20);
	
	h1.add(k1);
	h1.add(k2);
	h1.add(new Integer(30));
	h1.add(new Integer(40));
	h1.add(50);   //autoboxing (int=>Integer):기본자료형을 객체로 변경
	                // unboxing ( wrapper class = > 기본자료형으로 )
	//h1.add("60");
	System.out.println(h1);
	
	//개선된 for 사용가능 -select and array 에만쓴다 
	//h1 은 i 가 없으니까 일반 for 사용불가
	for (Integer k : h1) {
		System.out.println(k + 1000);
	}
	System.out.println();
	Iterator<Integer> it = h1.iterator();	
	System.out.println(it); // 주소출력
	
 while (it.hasNext()) {
	int s = it.next();
	System.out.println(s+5000);
	
}
	h2.add(10.0);
	h2.add(21.5);
	//h2.add(10); error
	
	double d1 = 3.1;
	double d2 = 10;
	
	
	
}
}
