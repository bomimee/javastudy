package com.ict.day03;

public class Ex07 {
//2 시간 40분 30초를 초로 환산해라 (몇 초일까?)
	public static void main(String[] args) {
		int hour = 2;
		int min = 40;
		int sec = 30;
		int res = (hour * 60 * 60) + (min * 60) + sec;
		
		System.out.println(res+"초");
	}
	
	
	}


