package com.ict.day16;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Vector;

public class Ex02 {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		Vector<String> vector = new Vector<String>();

		list.add("손흥민");
		list.add("이강인");
		list.add("김민재");
		list.add(1, "둘리");
		vector.add("손흥민");
		vector.add("이강인");
		vector.add("김민재");
		vector.add(2, "둘리");

		System.out.println(list);
		System.out.println(vector);

		// 검색
		if (list.contains("이강인")) {
			System.out.println(list.indexOf("이강인"));
			System.out.println(list.get(list.indexOf("이강인")));
// 둘리를 박지성으로 
			list.set(list.indexOf("둘리"), "박지성");
		}
		System.out.println(list);
		if (vector.contains("이강인")) {
			System.out.println(vector.indexOf("이강인"));
			System.out.println(vector.get(vector.indexOf("이강인")));
// 둘리를 박지성으로 
			vector.set(vector.indexOf("둘리"), "박지성");
		}
		System.out.println(vector);
		System.out.println(vector.firstElement());
		System.out.println(vector.lastElement());
		
		for (String k : list) {
			System.out.println(k + "골");
		}
		Iterator<String> str  = vector.iterator();
		while (str.hasNext()) {
			 String k= str.next();
			 System.out.println(k + "어시스트");
			
		}
	}
}
