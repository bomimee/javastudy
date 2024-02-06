package com.ict.day03;

public class Ex04 {
public static void main(String[] args) {
	// || 주어진 조건중 하나라도 참이면 결과는 참, 참을 만나면 이후 연산을 하지않는다
	
	int su1 = 10;
	int su2 = 8;
			boolean res;
	// true = true || true
	res = (su1 >=7) || (su2 >=5);
	System.out.println(res);
	res = (su1 >=7) || (su2 <=5);
	System.out.println(res);
	res = (su1 <=7) || (su2 >=5);
	System.out.println(res);
	res = (su1 <=7) || (su2 <=5);
	System.out.println(res);
	
	su1 = 10;
	su2 = 7;
	res = ((su1 = su1 + 2) > su2 ) || (su2 == su2 + 5);
			System.out.println(res);
	
	// Not (! 논리부정)
}
}
