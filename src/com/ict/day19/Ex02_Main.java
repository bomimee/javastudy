package com.ict.day19;

import java.util.List;
import java.util.Map;
import java.util.OptionalDouble;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Ex02_Main {
public static void main(String[] args) {
	Stream<Ex02> stream = Ex02.visits_list.stream();
	double avg = stream.collect(Collectors.averagingInt(i->i.getVisits()));
	System.out.println("전체 방문한 사람 평균 횟수 : "+avg);
	
	stream = Ex02.visits_list.stream();
	OptionalDouble avg2 = stream.mapToInt(i->i.getVisits()).average();
	System.out.println("전체 방문한 사람 평균 횟수 : "+avg2.getAsDouble());
	
	//이름만 list 로 만들기
	stream = Ex02.visits_list.stream();
	List<String> str = stream.map(i->i.getName()).collect(Collectors.toList());
	
	
	System.out.println("회원이름 : " + str);
	
	stream = Ex02.visits_list.stream();
	Map<Type, Long> cnt = stream.collect(Collectors.groupingBy
			(i->i.getType(), Collectors.counting()));
	System.out.println("타입별 인원수 : " + cnt);
}
}
