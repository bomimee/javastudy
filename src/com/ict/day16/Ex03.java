package com.ict.day16;

import java.util.Iterator;
import java.util.LinkedList;

public class Ex03 {
	public static void main(String[] args) {
		LinkedList<String> linkedList = new LinkedList<String>();
		linkedList.add("고길동");
		linkedList.offer("도우너");
		linkedList.addFirst("둘리");
		linkedList.offerFirst("공실이");
		linkedList.addLast("고길동");
		linkedList.add(2, "마이콜");
		System.out.println(linkedList);

		if (linkedList.contains("마이콜")) {
			System.out.println(linkedList.indexOf("마이콜"));
			System.out.println(linkedList.get(2));
			System.out.println(linkedList.getFirst());
			System.out.println(linkedList.getLast());
		}
		// 제일 처음 고길동만 바꿔줌
		if (linkedList.contains("고길동")) {
			linkedList.set(linkedList.indexOf("고길동"), "도우너");
			System.out.println(linkedList);
		}
		for (String str : linkedList) {
			System.out.println(str + "!!");
		}
		System.out.println();
		Iterator<String> str2 = linkedList.iterator();
		while (str2.hasNext()) {
			String string = (String) str2.next();
			System.out.println(string + "^^");
		}
	}
}
