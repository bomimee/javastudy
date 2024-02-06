package com.ict.day10;

import java.util.Iterator;
import java.util.Scanner;

public class Ex06 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("number of students?");
		int su = scan.nextInt();
		// Ex05 클래스로 만든객체를 배열에 자료형으로 사용
		// 해당 배열안에는 Ex05로 만든객체의 주소만 존재
		Ex05[] arr = new Ex05[su];
		// 학생수만큼 배열에 넣자

		// 해당 배열안에는 클래스가 들어간다.
		for (int i = 0; i < arr.length; i++) {
			System.out.print("이름: ");
			String name = scan.next();
			System.out.print("국어 : ");
			int kor = scan.nextInt();
			System.out.print("영어: ");
			int eng = scan.nextInt();
			System.out.print("수학: ");
			int math = scan.nextInt();

			Ex05 p = new Ex05();
			p.process(name, kor, eng, math);

			arr[i] = p;
		}
		// rank
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				if (i == j)
					continue;
				if (arr[i].sum > arr[j].sum) {
					arr[j].rank++;
				}
			}
		}
		// order
		Ex05 tmp = new Ex05();
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i].rank > arr[j].rank) {
					tmp = arr[i];
					arr[i] = arr[j];
					arr[j] = tmp;

				}
			}
		}
		// print
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i].name);
			System.out.println(arr[i].sum);
			System.out.println(arr[i].avg);
			System.out.println(arr[i].hak);
			System.out.println(arr[i].rank);
		}
	}

}
