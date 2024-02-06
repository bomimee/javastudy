package com.ict.day19;

import java.util.stream.IntStream;

public class Ex04 {
	public static void main(String[] args) {
		// 직접처리
		IntStream.range(0, 10).forEach(i -> System.out.print(i));
		System.out.println();

		// 병렬처리
		IntStream.range(0, 10).parallel().forEach(i -> System.out.print(i)); // Thread처럼 생각해도된다. 무작위로 출력
		System.out.println();

		int sum = IntStream.rangeClosed(0, 10).sum();
		System.out.println(sum);
		
		int sum2 =IntStream.rangeClosed(0, 10).parallel().sum();
		System.out.println(sum2);
	}
}
