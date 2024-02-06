package com.ict.day09;
import java.util.Scanner;

public class Ex21 {



	public static void main(String[] args) {
		int t = 0; // 무승부 카운트
		int w = 0; // 승리 카운트
		int l = 0; // 무승부 카운트
		int count = 0; // 게임횟수 카운트

		esc: while (true) {

			int ran = (int) (Math.random() * 3); // 0이상 2미만 값
			System.out.println("randonm(int):" + ran);

			// 컴퓨터의 가위바위보 난수로 결정
			char com = 'd'; // 컴퓨터의 가위바위보 변수 초기화
			if (ran == 0) {
				com = 'R';
			} else if (ran == 1) {
				com = 'P';
			} else if (ran == 2) {
				com = 'S';
			}
			System.out.println("com:" + com);

			// 나의 가위바위보결정
			System.out.print("(선택:1.가위 2.바위 3.보)?");
			Scanner scan = new Scanner(System.in);
			int input = scan.nextInt(); // 나의 입력값 입력할 변수 초기화
			if (input == 1) {
				input = 'S';
			} else if (input == 2) {
				input = 'R';
			} else if (input == 3) {
				input = 'P';
			}
			System.out.println("input:" + (char) input);

			// 컴퓨터가 이겼는지 내가 이겼는지 결정
			String result = "";
			if (com == 'S') {
				if (input == 'S') {
					result = "비김";
				} else if (input == 'R') {
					result = "승";
				} else if (input == 'P') {
					result = "패";
				}
			} else if (com == 'R') {
				if (input == 'R') {
					result = "비김";
				} else if (input == 'S') {
					result = "패";
				} else if (input == 'P') {
					result = "승";
				}
			} else if (com == 'P') {
				if (input == 'P') {
					result = "비김";
				} else if (input == 'R') {
					result = "패";
				} else if (input == 'S') {
					result = "승";
				}
			}

			System.out.println(result);
			count++; // 시행수 카운트
			// 무,승,패 카운트
			if (result == "비김") {
				t++;
			} else if (result == "승") {
				w++;
			} else if (result == "패") {
				l++;
			}

			while (true) {
				System.out.print("계속할까요?(y/n)");
				String input2 = scan.next();
				if (input2.equalsIgnoreCase("y")) {
					continue esc;
				}
				if (input2.equalsIgnoreCase("n")) {
					break esc;
				}
				System.out.println("제대로 입력하세요");
			}//안while
		} //바깥while

		System.out.println("시행회수:" + count + "회" + w + "승" + t + "무" + l + "패");
		
		double rate = (int)(w*1.0/count*10000.0)/100.0;
		System.out.println("승률:" + rate+"%");

	// main
}// class

}
