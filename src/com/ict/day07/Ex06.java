package com.ict.day07;

import java.util.Arrays;

public class Ex06 {
	public static void main(String[] args) {
		// array 정렬
		int[] su = { 3, 4, 5, 8, 9, 7, 1, 2, 10, 6 };
		Arrays.sort(su);
		
		for (int i = 0; i < su.length; i++) {
			
			System.out.println(su[i]);
		}
		
		int temp = 0;
		for (int i = 0; i < su.length - 1; i++) {
			for (int j = i + 1; j < su.length; j++) {
				if (su[i] > su[j]) {
					temp = su[i];
					su[i] = su[j];
					su[j] = temp;
				}
			}
		}
		for (int i = 0; i < su.length; i++) {

			System.out.println(su[i]);
		}
	
}}
