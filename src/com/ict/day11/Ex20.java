package com.ict.day11;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class Ex20 {
public static void main(String[] args) {
	// java version 8.0 
	LocalDate cDate = LocalDate.now();
	System.out.println(cDate);
	
	LocalDate cDate2 = LocalDate.of(2023,12,28);
	System.out.println(cDate2);
	
	//날짜비교
	System.out.println(ChronoUnit.YEARS.between(cDate,cDate2));
	System.out.println(ChronoUnit.MONTHS.between(cDate,cDate2));
	System.out.println(ChronoUnit.DAYS.between(cDate,cDate2));
	
	
	//시간정보만
	LocalTime cTime = LocalTime.now();
	System.out.println(cTime);
	
	LocalTime cTime2 = LocalTime.of(9, 00);
	System.out.println(cTime2);
	
	
	// 날짜 시간 모두
	LocalDateTime cdt = LocalDateTime.now();
	System.out.println(cdt);
	
	LocalDateTime cdt2 = LocalDateTime.of(cDate2, cTime2);
	System.out.println(cdt2);
	
	// + => plus**() // - => minus**()
	System.out.println(cdt.plusYears(7));
	System.out.println(cdt.plusMonths(7));
	System.out.println(cdt.plusDays(7));
	System.out.println(cdt.plusHours(7));
	
}
}
