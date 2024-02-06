package com.ict.day18;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Ex02 {
	public static void main(String[] args) {
		// Stream 생성 : 기본자료형 배열로부터 스트림생성 IntStream, DoubleStream, LongStream
		// Stream<T> Stream.of(int... values) -> 가변인자
		// Stream<T> Stream.of(int[])
		// IntStream<T> Arrays.stream(int[])
		// IntStream<T> Arrays.stream(int[], 시작index, 끝index(포함x))

		Integer[] integerArr = { 1, 2, 3, 4, 5 };
		Stream<Integer> stream01 = Arrays.stream(integerArr);
		// stream01.forEach(System.out::print); 이렇게도 사용가능
		stream01.forEach(i -> System.out.print(i + "님"));
		System.out.println();
		// System.out.println(stream01.count()); -> 오류, forEach를 최종으로 썼기때문에 사용불가
		// 하고싶으면 스트림 재생성
		Stream<Integer> stream02 = Arrays.stream(integerArr);
		System.out.println(stream02.count() + "개");
		
		// System.out.println(stream03.sum()//average()); => 존재 X
//////////////////////////////////////////////////////////////////////////////////////
		/////////////////////////////////////////////////////////////
		//////////////////////////////////////////////////////////
		// ***********기본자료형 배열을 스트림으로 (쓸수 있는 메서드가 훨씬 많다)*************************
		////////////////////////////////////////////////////////////////////////
		int[] intArr = { 10, 20, 30, 40, 50 };

		IntStream intStream1 = IntStream.of(60, 70, 80, 90);
		IntStream intStream2 = IntStream.of(intArr);
		IntStream intStream3 = Arrays.stream(intArr);
		IntStream intStream4 = Arrays.stream(intArr, 2, 5);

		System.out.println("=========================");
		intStream1.forEach(i -> System.out.print(i + ","));
		System.out.println();
		System.out.println("total :" + intStream2.count());
		System.out.println("total sum :" + intStream3.sum());
		System.out.println("total ave :" + intStream4.average());
		
		//////////////////////////////////////////////////////////
		/////////////////////////////////////////////////////////////
		int[] arr = { 1, 2, 3, 4, 5, 1, 2, 3, 4, 5, 1, 2, 3 };
		IntStream intstream1 = IntStream.of(arr);
		intstream1.forEach(i -> System.out.print(i + " "));
		System.out.println();

		// distinct : 중복제거
		IntStream intstream2 = IntStream.of(arr);
		intstream2.distinct().forEach(i -> System.out.print(i + " "));
		System.out.println();

		// range : 마지막 포함안함
		IntStream intstream3 = IntStream.range(0, 10);
		intstream3.forEach(i -> System.out.print(i + " "));
		System.out.println();

		// rangeClosed : 마지막 포함
		IntStream intstream4 = IntStream.rangeClosed(0, 10);
		intstream4.forEach(i -> System.out.print(i + " "));
		System.out.println();

		// filter
		IntStream intstream5 = IntStream.rangeClosed(0, 10);
		intstream5.filter(i -> i % 2 == 0).forEach(i -> System.out.print(i + " "));
		System.out.println();
		
		//limit : 원하는 수만큼 잘라내기
		IntStream intstream6 = IntStream.rangeClosed(0, 10);
		intstream6.limit(5).forEach(i -> System.out.print(i + " "));
		System.out.println();
		
		//skip : 수만큼 건너뛴다
		IntStream intstream7 = IntStream.rangeClosed(0, 10);
		intstream7.skip(3).forEach(i -> System.out.print(i + " "));
		System.out.println();

	}
}
