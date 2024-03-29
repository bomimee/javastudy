package com.ict.day18;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Ex06 {
public static void main(String[] args) {
	//sum 
	List<Integer> numbers = Arrays.asList(10,20,30,40,50);
	Stream<Integer> stream1 = numbers.stream();
	//reduce(수행기능)
	Optional<Integer> sum= stream1.reduce((i,j)-> Integer.sum(i,j));
	System.out.println(sum);   // Optional[150]
	//sum 2
	int[] num = {10,20,30,40,50};
	IntStream intstream = IntStream.of(num);
	int sum2 = intstream.sum();
	System.out.println(sum2);  //150
	
	
	//reduce(초기값, 수행기능)
	Stream<Integer> stream2 = numbers.stream(); 
	int sum3 = stream2.reduce(1000,(i,j)-> Integer.sum(i,j));
	System.out.println(sum3);
	
	//누적합: sum = sum(이전합) + 현재값
	Stream<Integer> numbers2 = Stream.of(1,2,3,4,5,6,7,8,9,10); 
	Optional<Integer> total2= numbers2.reduce((x,y) -> x+y);
	System.out.println(total2);
}
}
