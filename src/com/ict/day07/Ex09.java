package com.ict.day07;

import java.util.Scanner;

public class Ex09 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String[] name = new String[5];
		int[] korArr = new int[5];
		int[] engArr = new int[5];
		int[] mathArr = new int[5];

		int[] sum = new int[5];
		double[] avg = new double[5];
		String[] grade = new String[5];
		int[] rank = new int[5];
		while (true) {
			for (int i = 0; i < mathArr.length; i++) {

				System.out.print("이름: ");
				name[i] = scan.next();
				System.out.print("수학점수: ");
				mathArr[i] = scan.nextInt();
				System.out.print("국어점수: ");
				korArr[i] = scan.nextInt();
				System.out.print("영어점수: ");
				engArr[i] = scan.nextInt();
				System.out.println(mathArr[i]);

				sum[i] = korArr[i] + engArr[i] + mathArr[i];
				avg[i] = (int) ((sum[i] / 3.0) * 10) * 10.0;

				if (avg[i] >= 90) {
					grade[i] = "A";
				} else if (avg[i] >= 80) {
					grade[i] = "B";
				} else if (avg[i] >= 70) {
					grade[i] = "C";
				} else {
					grade[i] = "F";
				}
			}
			for (int i = 0; i < rank.length; i++) {

				for (int j = 0; j < rank.length; j++) {
					if (sum[i] == sum[j])
						continue;
					if (sum[i] > sum[j])
						rank[i]++;

				}
			}
			// 출력
			System.out.println("이 름\t총 점\t평 균\t학 점\t순 위");
			for (int j = 0; j < rank.length; j++) {

				System.out.print(rank[j] + "\t");
				System.out.print(name[j] + "\t");
				System.out.print(sum[j] + "\t");
				System.out.print(avg[j] + "\t");
				System.out.print(grade[j]);
			}
		}
	}
}
