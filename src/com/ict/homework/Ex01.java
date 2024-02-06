package com.ict.homework;

public class Ex01 {
// 1+ -2 + 3 -4 + ......얼마나 더해야 총합이 100이상이 되는지 

	public static void main(String[] args) {
		int sum = 0;
		int cnt = 0;
		for (int i = 1; sum <= 99; i++) {
			if (i % 2 == 0) {
				sum = sum - i;
			} else {
				sum = sum + i;
			}
			cnt = i;
		}

		System.out.println(cnt);
	}
}