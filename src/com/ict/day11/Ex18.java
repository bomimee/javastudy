package com.ict.day11;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Ex18 {
	public static void main(String[] args) {
		/*
		 * 날짜 관련 클래스 1. Date (1.0) 2. Calender (5.0) 3. LocalDate (8.0)
		 * 
		 * 
		 * 1. Date Class
		 */
		Date data = new Date();
		System.out.println(data);

		// 기본 형태 변환
		SimpleDateFormat sf = new SimpleDateFormat("yyyy.MM.dd HH:mm:ss z");

		System.out.println(sf.format(data));

		SimpleDateFormat sf2 = new SimpleDateFormat("yy-M-d H:m:s");

		System.out.println(sf2.format(data));

		// 년 , 월, 일, 시, 분 , 초, 요일 => 시스템상의 년월일 시 분

		System.out.println(data.getYear()); // 현재 년도 - 1900 = 124
		System.out.println(data.getMonth() + 1 + "월"); // 0-11
		System.out.println(data.getDate() + "일");
		System.out.println(data.getHours() + "시");
		System.out.println(data.getMinutes() + "분");
		System.out.println(data.getSeconds() + "초");

		int k = data.getDay();
		switch (k) {
		case 0:
			System.out.println("일");
			break;
		case 1:
			System.out.println("월");
			break;
		case 2:
			System.out.println("화");
			break;
		case 3:
			System.out.println("수");
			break;
		case 4:
			System.out.println("목");
			break;
		case 5:
			System.out.println("금");
			break;
		case 6:
			System.out.println("토");
			break;

		}

	}

}
