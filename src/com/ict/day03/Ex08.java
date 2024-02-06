package com.ict.day03;

public class Ex08 {
//3989초 몇시간, 몇분, 몇초 일까 ?
	public static void main(String[] args) {
		int num = 3989;
		int min = (num / 60) % 60;
		int sec = num % 60;
		int hour = (num / 60) / 60;

		System.out.println(hour + "hour" + min + "minutes" + sec + "seconds");
	}
}
