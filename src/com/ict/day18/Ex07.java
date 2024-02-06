package com.ict.day18;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class Ex07 {
public static void main(String[] args) {
	List<String> str = Arrays.asList("딸기","바나나","멜론","수박");
	Optional<String> o_min = str.stream().min(Comparator.naturalOrder()); //기본정렬을 뜻한다
	Optional<String> o_max = str.stream().max(Comparator.naturalOrder()); //기본정렬을 뜻한다
	System.out.println(o_min.get() +" "+o_max.get());
	Optional<String> o_findAny = str.stream().findAny();
	Optional<String> o_findFirst = str.stream().findFirst();
	System.out.println(o_findAny.get() + " " + o_findFirst.get()); //출력앞에 붙은 옵셔널제거 .get()

	
	
	List<Integer> num = Arrays.asList(1,5,6,78,4,2,3);
	Optional<Integer> n_min = num.stream().min(Comparator.naturalOrder()); //기본정렬을 뜻한다
	Optional<Integer> n_max = num.stream().max(Comparator.naturalOrder()); //기본정렬을 뜻한다
	System.out.println(n_min.get() + " " + n_max.get());
	Optional<Integer> n_findAny = num.stream().findAny();
	Optional<Integer> n_findFirst = num.stream().findFirst();
	System.out.println(n_findAny.get()+ " "+ n_findFirst.get());
}
}
