package com.ict.day18;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class Ex03 {
	public static void main(String[] args) {
		///////////////////////////////////////////////
		/////////////////////////////////////////////////////
		// 정수배열을 스트림으로 활용하기
		int[] arr = { 1, 2, 3, 4, 5 };
		int sumVal = Arrays.stream(arr).sum();
		int count = (int) Arrays.stream(arr).count(); // count 의 반환형 = long 이라서 형변환
		System.out.println(sumVal + ",");
		System.out.println(count + "개");

		////////////////////////////////////////////////
		/////////////////////////////////////////////
		// ArrayList 를 스트림으로 활용하기
		List<String> sList = new ArrayList<String>();
		sList.add("Tomas");
		sList.add("Edward");
		sList.add("Jack");

		Stream<String> stream = sList.stream();
		stream.forEach(i -> System.out.print(i + " "));
		System.out.println();
		// ------ 중간처리하기 : 정렬 sorted() : 오름차순------------//
		Stream<String> stream2 = sList.stream();
		stream2.sorted().forEach(i -> System.out.print(i + " "));
		System.out.println();
		// sList.stream().sorted();

		// ------ 중간처리하기 : 정렬 sorted(Comparator.reverseOrder()) : 내림차순------------//
		Stream<String> stream3 = sList.stream();
		stream3.sorted(Comparator.reverseOrder()).forEach(i -> System.out.print(i + " "));
		System.out.println();

		// ------ 중간처리하기 : 정렬 sorted() : 오름차순 --> 숫자, 대문자,소문자 순 ------------//
		Stream<String> stream5 = Stream.of(new String[] { "bb", "a", "CC", "3", "dd", "BB", "aaa" });
		stream5.sorted().forEach(i -> System.out.print(i + " "));
		System.out.println();
		// ------ 중간처리하기 : 정렬 sorted() : 내림차순 ------------//
		Stream<String> stream4 = Stream.of(new String[] { "bb", "a", "CC", "dd", "BB", "aaa" });
		stream4.sorted(Comparator.reverseOrder()).forEach(i -> System.out.print(i + " "));
		System.out.println();
// 알파벳 순 : 대소문자가 같을때에는 앞에 있는 것(먼저생성) 이 먼저나온다. 
		Stream<String> stream6 = Stream.of(new String[] { "bb", "a", "CC", "가", "3", "dd", "BB", "AAAA", "aaa" });
		stream6.sorted(String.CASE_INSENSITIVE_ORDER).forEach(i -> System.out.print(i + " "));
		System.out.println();
//알파벳 역순 : 대소문자가 같을때에는 앞에 있는 것(먼저생성) 이 먼저나온다. 
		Stream<String> stream7 = Stream.of(new String[] { "bb", "a", "CC", "가", "3", "dd", "BB", "AAAA", "aaa" });
		stream7.sorted(String.CASE_INSENSITIVE_ORDER.reversed()).forEach(i -> System.out.print(i + " "));
		System.out.println();

	}
}