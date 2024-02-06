
package com.ict.day18;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Ex01 {
	/*
	 * Stream : Collection (arrays) 의 저장 요소를 하나씩 참조, 람다식으로 처리할 수 있는 클래스. 컬렉션,배열, 데이터
	 * 소스를 표준화된 방법으로 다루기 위한것 스트림 생성 -> 중간처리 -> 최종처리 filter, map.. forEach 1.스트림생성-
	 * 컬렉션 배열을 스트림 변환시킴 2. 중간처리 - 여러번 반복사용가능, 결과가 스트림 (filter(조건식), distinct:중복제거,
	 * sorted:정렬, limit(갯수):갯수만큼자르기, skip(갯수):갯수만큼 건너뛰기, peek:작업사이에 넣어서 중간결과를 받을대
	 * 주로사용-looping, map:요소변환, flatMap: 요소변환)
	 * 
	 * 3.최종처리 - 한번만 실행가능, 스트림요소가 소모, 스트림이 닫기되어 스트림 재호출불가. 결과가 스트림이 아님 (forEach:
	 * looping, count, max, min, findAny: 아무거나 하나 반환, findFirst, --> find... 보통
	 * filter와 같이 사용 allMatch(조건식), anyMatch(조건식), noneMatch(조건식), toArray: 스트림요소
	 * 배열로 반환, reduce:스트림요소를 하나씩줄여가면서 계산 collect: 스트림요소 수집)
	 * 
	 */
	public static void main(String[] args) {
		// 스트림생성: 컬렉션이나 배열을 스트림으로 반환
		// 객체, 배열로 부터 스트림만들기
		// Stream<T> Stream.of(T... values) -> 가변인자
		// Stream<T> Stream.of(T[])
		// Stream<T> Arrays.stream(T[])
		// Stream<T> Arrays.stream(T[], 시작index, 끝index(포함x))
		List<String> list = Arrays.asList("홍길동", "고길동", "이길동", "박길동", "나길동"); // 객체
		Stream<List<String>> stream05 = Stream.of(list);
		stream05.forEach(i-> System.out.print(i + "님 "));   //-> [] 출력
		Stream<String> stream06 = list.stream();
		System.out.println();
		stream06.forEach(i-> System.out.print(i + "씨 "));
		
		String[] arr = { "홍길동", "고길동", "이길동", "박길동", "나길동" }; // 베열
		Stream<String> stream01 = Stream.of("홍길동", "고자바", "이자바", "박자바", "나자바");
		Stream<String> stream02 = Stream.of(arr);
		Stream<String> stream03 = Arrays.stream(arr);
		Stream<String> stream04 = Arrays.stream(arr, 1, 4);
		stream01.forEach(i -> System.out.print(i + "님 "));
		System.out.println();
		stream02.forEach(i -> System.out.print(i + "님 "));
		System.out.println();
		stream03.forEach(i -> System.out.print(i + "님 "));
		System.out.println();
		stream04.forEach(i -> System.out.print(i + "님 "));
	}
}
