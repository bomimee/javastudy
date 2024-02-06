package com.ict.day07;

import java.util.Arrays;

public class Ex10 {
public static void main(String[] args) {
	int[] su = {-10, 0, 10, 25, -90, 95};
	
	//Array.sort 오름차순 정렬
	//인덱스 0이 가장 작은 것, 인덱스 값이 su.length-1 이 가장 큰값을 갖고있다.
	Arrays.sort(su);
	System.out.println("가장 작은 값: " +su[0]);
	System.out.println("가장 큰 값: " +su[su.length-1]);
	
}
}
