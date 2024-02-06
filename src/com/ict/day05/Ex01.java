package com.ict.day05;

public class Ex01 {
	public static void main(String[] args) {
		// switch case : multiple if ~else
		// if 조건식 boolean , 비교연산, 논리연산, boolean형
		// switch 인자값 int 이하 char, str 사용
		// long 실수형 사용불가
		// 형식 switch (인자값=int, char. string){
		// case 조건값1 인자값 조건값1 같을때 수행문장; break;
		// case 조건값2 인자값 조건값1 같을때 수행문장;
		// case 조건값2 인자값 조건값1 같을때 수행문장; break;
		// case 조건값3 인자값 조건값1 같을때 수행문장; break;

		// ** 주의사항 - 브레이크 없으면 브레이크 만날때까지 모든 실행문 실행
		// 브레이크 문의 역할은 현재 실행중인 범위를 벗어나는 역할
		// 디폴트생략가능
		int k1 = 3;
		String result = "";
		if (k1 == 1) {
			System.out.println("모카");
		} else if (k1 == 2) {
			System.out.println("라테");
		} else if (k1 == 3) {
			System.out.println("아메리카노");
		} else if (k1 == 4) {
			System.out.println("쥬스");
		}
		switch (k1) {
		case 1:
			System.out.println("모카");
			break;
		case 2:
			System.out.println("라테");
			break;
		case 3:
			System.out.println("아메리카노");
			break;
		case 4:
			System.out.println("쥬스");
			break;
		}

		////////////////////////////
		char k2 = 'A';
		String result2 = "";
		switch (k2) {
		case 'A':
			result2 = "아프리카";
			break;
		case 'B':
			result2 = "브라질";
			break;
		case 'C':
			result2 = "캐나다";
			break;
		default:
			result2 = "한국";
			break;
		}
		System.out.println(result2);

		char k3 = 'C';
		String result3 = "";
		switch (k3) {
		case 'A':
		case 'a':
			result2 = "아프리카";
			break;
		case 'B':
		case 'b':
			result2 = "브라질";
			break;
		case 'C':
		case 'c':
			result2 = "캐나다";
			break;
		default:
			result2 = "한국";
			break;
		}
		System.out.println("결과 : " + result2);

		String k5 = "일본";
		String res = "";

		switch (k5) {
		case "한국":
			res = "서울";
			break;
		case "중국":
			res = "베이징";
			break;
		case "일본":
			res = "도쿄";
			break;
		}
		System.out.println(res);

		///////////////////////////////////////////////
		int k6 = 93;
		String res6 = "";
		switch ((int) (k6 / 10)) {
		case 10:
		case 9:
			res6 = "A";
			break;
		case 8:
			res6 = "B";
			break;
		case 7:
			res6 = "C";
			break;
		default:
			res6 = "F";
			break;
		}
		System.out.println("결과: " + res6);
		 System.out.println(Math.random());
	}
	
	}
