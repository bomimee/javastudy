package com.ict.day07;

public class Ex07 {
public static void main(String[] args) {
	//순위구하기
	
	int[] su = {80, 90, 70, 65, 75, 85, 95};
	int[]rank = {1, 1, 1, 1, 1, 1, 1};
	for (int i = 0; i < rank.length; i++) {
		for (int j = 0; j < rank.length; j++) {
			if(su[i]==su[j]) continue;
			if(su[i]< su[j]) {
				rank[i]++;
			}
		}
	}
	for (int i = 0; i < rank.length; i++) {
		System.out.println(rank[i]);
	}
System.out.println();
}
}
