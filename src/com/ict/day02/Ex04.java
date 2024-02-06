package com.ict.day02;

public class Ex04 {
	public static void main(String[] args) {
		// 실수 : 소수점이 있는 수
		// float < double(기본)
		// float는 숫자 뒤에 반드시 F/f 붙인다
		
		//  줄단위 복사 : 해당위치에서 ctrl + alt + 아래방향키
		//줄이동 : 해당 위치에서 alt+위,아래 방향키
		float f1 = 3.14F;
		System.out.println(f1);
		float f2 = -25.0f;
		System.out.println(f2);
	
		double d1 = 3.14;
		System.out.println(d1);
		
		//중요) float 나 double 은 부동소숫점으로 값을 표현하므로 소수점
		//이하의 값이 정확하게 표현이 안되는 오류 바생
		// 현재는 소수점 이하 몇자리 버림, 올림, 반올림 이용하자
		
	}
}
