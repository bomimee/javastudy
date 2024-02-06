package com.ict.day19;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Ex01_Main {
	public static void main(String[] args) {
		Ex01 p1 = new Ex01("이순신", 40, 100);
		Ex01 p2 = new Ex01("김유신", 20, 100);
		Ex01 p3 = new Ex01("홍길동", 13, 50);

		List<Ex01> list = new ArrayList<Ex01>();
		list.add(p1);
		list.add(p2);
		list.add(p3);
		List<String> names = new ArrayList<>();
		// 컬렉션 처리
		System.out.println("(컬렉션)===고객명단 순서대로 출력===");
		int su = 0;
		String str;

		Iterator<Ex01> it = list.iterator();
		while (it.hasNext()) {
			Ex01 ex01 = (Ex01) it.next();
			System.out.println(ex01.getName());

		}
		System.out.println();
		System.out.println("(컬렉션)나이가 20이상인 고객의 명단 출력(입력순)");
		for (Ex01 ex01 : list) {
			su += ex01.getPrice();

			if (ex01.getAge() >= 20)
				System.out.println(ex01.getName()); 
		}

		System.out.println("총비용은 " + su + " 입니다.");

	
		for (Ex01 i: list) {
			if(i.getAge() >= 20)
			names.add(i.getName());		
		}
		Collections.sort(names);
		System.out.println("===나이가 20이상인 고객의 명단 출력(이름 오름차순)" );
		Iterator<String> iter = names.iterator();
		while (iter.hasNext()) {
			String st =  iter.next();
			System.out.println(st);
		}
		

		System.out.println("===========================================");
		// 스트림 처리
		System.out.println("===고객명단 순서대로 출력===");
		Stream<Ex01> stream = list.stream();
		stream.map(i -> i.getName()).forEach(i -> System.out.println(i + "고객"));
		System.out.println("총비용은 ~~ 입니다.");
		int sum = list.stream().mapToInt(i -> i.getPrice()).sum(); // **mapToInt
		System.out.println(sum);

		System.out.println("===나이가 20이상인 고객의 명단 출력(입력순)");
		list.stream().filter(i -> (i.getAge() >= 20)).map(i -> i.getName()).forEach(i -> System.out.println(i));
		System.out.println("===나이가 20이상인 고객의 명단 출력(이름 오름차순)");
		list.stream().filter(i -> (i.getAge() >= 20)).map(i -> i.getName()).sorted()
				.forEach(i -> System.out.println(i));

	}

}
