package com.ict.day19;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Ex05 {
public static void main(String[] args) {
	List<String> list= Arrays.asList("김","이","박","나","최");
	//순차처리, 직접처리
	Stream<String> stream =list.stream();
	stream.forEach(i-> prn(i));
	
	//병렬처리 : thread 처럼 동시에 나눠서 처리
	Stream<String> stream2 = list.parallelStream();
	stream2.forEach(i->prn(i));
}
public static void prn(String str) {
	try {
		Thread.sleep(1000);
		System.out.println(str+":"+Thread.currentThread().getName());
	} catch (Exception e) {
		
	}
}
}
//바이트 영어 한글자 = 1바이트
//비트 정보를저장하는 최소단위 8비트(binary digit)=1바이트