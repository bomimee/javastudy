package com.ict.day16;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Ex06 {
	public static void main(String[] args) {
		// 대한민국 캐나다 영국 스위스의 수도가 각각 해쉬맵에 저장
		// 원하는 나라 키값 입력되어 화면에서 나라 물어보면 수도가 출력되는 ㄴ프로그램
		Scanner scan = new Scanner(System.in);
		Map<String, String> map = new HashMap<String, String>();
		map.put("한국", "서울");
		map.put("캐나다", "오타와");
		map.put("영국", "런던");
		map.put("스위스", "취리히");

		Set<String> keys = map.keySet();

		esc: while (true) {
			System.out.print("Country: ");

			String user = scan.next();
			if (map.containsKey(user)) {
				String res = map.get(user);
				System.out.println(user + " 수도는 " + res);

			} else {
				System.out.println("해당국가는 지원하지않습니다. ");

			}

			while (true) {
				System.out.print("계속? >> y/n");
				String asw = scan.next();
				if (asw.equalsIgnoreCase("y"))
					continue esc;
				else if (asw.equalsIgnoreCase("n"))
					break esc;
				else
					continue;
			}

		} // while

	}
}
