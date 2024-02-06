package com.ict.day08;

import java.util.Scanner;

public class Ex05 {
	public static void main(String[] args) {
		// 학생수:
		Scanner scan = new Scanner(System.in);

		System.out.print("학생수: ");
		int arr = scan.nextInt();

		// 번호 국어 영어 수학

		double[][] students = new double[arr][];
		for (int i = 0; i < students.length; i++) {
			double[] p = new double[8];
			p[0] = i + 1;
			System.out.print("국어: ");
			p[1] = scan.nextInt();
			System.out.print("영어: ");
			p[2] = scan.nextInt();
			System.out.print("수학: ");
			p[3] = scan.nextInt();

			// 총점 평균 학점
			p[4] = p[1] + p[2] + p[3];
			p[5] = (int) (p[4] / 3.0 * 10) / 10.0;

			if (p[5] >= 90) {
				p[6] = 'A';
			} else if (p[5] >= 80) {
				p[6] = 'B';
			} else if (p[5] >= 70) {
				p[6] = 'C';
			} else {
				p[6] = 'F';

			}
			p[7] = 1;

			students[i] = p;

		}	

		//순위
		for (int i = 0; i < students.length; i++) {
			for (int j = 0; j < students.length; j++) {
				if(i==j)continue;
				if(students[i][4]>students[j][4]) {
					students[j][4]++;
				}
			}
		}
						
			// 정렬
double[] tmp = new double [8];
for (int i = 0; i < students.length; i++) {
	for (int j = i+1; j < students.length; j++) {
		if(students[i][7]> students[j][7]) {
			tmp = students[i];
			students[i] =students[j];
			students[j] = tmp;
		}
	}
}
			// 출력
		for (int i = 0; i < students.length; i++) {
			for (int j = 0; j < students[i].length; j++) {
				// 국어 영어 수학 출력에서 제외
				if(j==1||j==2||j==3) continue;
				//평균이므로 더블
				if(j==5) {System.out.println(students[i][j]+"\t");}
				//학점은 char
				if(j==6) {
					System.out.print((char)(students[i][j])+"\t");
				}else {
					System.out.print((int)(students[i][j])+"\t");
				}
			}
			System.out.println();
		}
	}

	}
	
