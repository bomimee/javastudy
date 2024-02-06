package com.ict.day18;

import java.util.Arrays;
import java.util.stream.Stream;

public class Ex05_Main {
	public static void main(String[] args) {
		// reduce (초기값,수행할기능)
		// reduce(T identity, BinaryOperator<T> accumulator)
		String[] greetings = { "안녕하세요~~~", "hello", "Good morning", "반갑습니다.^^" };
		Stream<String> stream = Arrays.stream(greetings);
		String str = stream.reduce(new Ex05()).get();
		System.out.println(str);
		
	}
}
