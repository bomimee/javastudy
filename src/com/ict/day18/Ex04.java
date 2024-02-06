package com.ict.day18;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Ex04 {
	public static void main(String[] args) {
// map, peek , flatMap
		// map: stream요소들을 변경한 새로운 스트림을 반환
		// 단일 스트림의 원소를 매핑한후 매핑한 값을 다시 스트림으로 변환하는 중간연산
		// 객체에서 원하는 원소를 추출해내는 역할을 함

		Stream<String> stream = Stream.of("Java", "jsp", "spring", "jqeury");
		stream.map(i -> i.toUpperCase()).forEach(i -> System.out.print(i + " "));
		System.out.println();
		//////////////////////////////////////////////////////////////////////////
		////////////////////////////////////////////////////////////////////////////
		List<Ex04> list = Arrays.asList(new Ex04("park", 20), new Ex04("kyung", 35), new Ex04("seok", 67),
				new Ex04("test man", 10), new Ex04("test women", 45));
		// 이름만 추출
		Stream<Ex04> stream2 = list.stream();
		stream2.map(i -> i.getName()).forEach(i -> System.out.print(i + " "));
		System.out.println();
		Stream<Ex04> stream3 = list.stream();
		Stream<String> nameList = stream3.map(i -> i.getName());
		nameList.forEach(i -> System.out.print(i + " "));

		// flatMap : 입력한 원소를 가장 작은 단위의 단일 스트림으로 반환
		List<String> list2 = Arrays.asList("사과3팩", "멜론2팩", "딸기3팩");
		Stream<String> stream4 = list2.stream();
		List<String> list3 = stream4.flatMap(i -> {
			String s = i.substring(0, 2);
			int n = Integer.parseInt(i.substring(2, 3));
			String[] arr = new String[n];
			Arrays.fill(arr, s);
			return Stream.of(arr);
		}).collect(Collectors.toList()); // 새로운 리스트에 저장
		System.out.println();
		System.out.println(list3);

		String[][] arr2 = new String[][] { { "a", "b" }, { "c", "d" }, { "e", "d" }, { "a", "h" }, { "i", "j" } };
		Stream<String[]> stream5 = Arrays.stream(arr2); // *****String[]******
		// 배열주소 5개 만 보인다. 배열안에 배열이 있기때문에
		// stream5.forEach(i -> System.out.print(i + " "));
		stream5.map(i -> Arrays.toString(i)).forEach(i -> System.out.print("결과 :" + i + "  ")); // ??toString을 왜쓰는지
																								// 잘모르겠음
		System.out.println();
		Stream<String[]> stream6 = Arrays.stream(arr2);
		stream6.flatMap(i -> Arrays.stream(i)).forEach(i -> System.out.print(i + " "));
		Stream<String[]> stream7 = Arrays.stream(arr2);
		System.out.println();
		List<String> list4 = stream7.flatMap(i -> Arrays.stream(i)).collect(Collectors.toList());
		System.out.println(list4);
		System.out.println();
		//
		// peek: loop 인데 중간처리
		// 중간에 체크할때쓴다 
		Stream<String> stream8 = Stream.of("Java", "jsp", "spring", "jqeury");
		stream8.map(i -> i.toUpperCase()).peek(i -> System.out.print(i + "배우기 "))
				.forEach(i -> System.out.println(i + " ~ "));
		;
	}

	/////////////////////////////////////////////////
	/////////////////////////////////////////////////////
	// VO (Value Object), DTO(Data Transfer Object)
	private String name;
	private int age;

	public Ex04() {
	}

	public Ex04(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
}