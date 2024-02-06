package com.ict.day07;

import java.util.Arrays;
import java.util.Collections;

public class Ex04 {
	public static void main(String[] args) {
		// Arrays class
		int[] arr = new int[100];
		// 초기화
		for (int i = 0; i < arr.length; i++) {
			arr[i] = i + 1;
			System.out.println("arr[" + i + "] = " + (i + 1));
		}
		Arrays.binarySearch(arr, 0); // 0이있는 위치값반환
		System.out.println(Arrays.binarySearch(arr, 1));
//
		int[] arr1 = { 1, 2, 3, 4, 5 };
		int[] arr2 = Arrays.copyOf(arr1, 3);
		int[] arr3 = Arrays.copyOf(arr1, 7);
		for (int i = 0; i < arr3.length; i++) {

			// System.out.println(arr2[i]);
			System.out.println(arr3[i]);
		}
// copyOfRange(arr, 시작위치, 끝위치(포함안함))
		int[] arr4 = Arrays.copyOfRange(arr1, 2, 4);
		System.out.println(arr4.length);
		int[] arr5 = new int[10];
		Arrays.fill(arr5, 3);
		for (int i = 0; i < arr5.length; i++) {
			System.out.println(arr5[i]);

		}
		// 오름차순
		int[] arr6 = { 7, 4, 3, 1, 5, 6, 2 };
		Arrays.sort(arr6);
		for (int i = 0; i < arr6.length; i++) {
			System.out.println(arr6[i]);
		}
		System.out.println("오름차순을 내림차순으로 출력");
		// 오름 차순 후 끝에서 부터 가져오기
		for (int i = arr6.length-1;i>=0; i--) {
			System.out.println(arr6[i]);
		}
	
		System.out.println("collection 사용해서 내림차순으로 만듦");
				
		//** int=> Integer class 로 바꿔야 내림차순 가능
		Integer [] arr7 = {7,4,3,1,5,6,2};
		Arrays.sort(arr7, Collections.reverseOrder());
		for (int i = 0; i < arr7.length; i++) {
			System.out.println(arr7[i]);
		}
		//숫자.기호. 대문자. 소문자.한글
		String[] arr8 = {"mango","Apple","apple","Mango",
				"1","8","banana","Banana","@","가나다","하바사"};
		Arrays.sort(arr8);
		for (int i = 0; i < arr8.length; i++) {
			System.out.println(arr8[i]);
			
			//Arrays.asList() ; 배열을 리스트라는 컬렉션으로 변경할때 사용
			// List toArray() ; list 배열로 변경
		}
	}


	}

