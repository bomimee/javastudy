package com.ict.day06;

public class Ex04 {
	public static void main(
			
			String[] args) {
		
//break & break label
		//break:  현재 위치 블록탈출
		//break label: 레이블 지정블럭 탈출
		// 레이블 : 반복문 앞에 이름 붙이기
		//1-10 
		for (int i=1; i<11; i++) {
			System.out.print("i"+i+" ");
		}
		System.out.println();
		//1-10 break
		for (int i=1; i<11; i++) {
			if(i==6) break;
			System.out.print("i"+i+" ");
		}
		System.out.println();
		//1-10 break label
		//반복문앞에 label 붙이고 :
		//for문에는 할필요없다
		exit:for (int i=1; i<11; i++) {
			if(i==6) break exit;
			System.out.print("i"+i+" ");
		}
		System.out.println();
	///////////////////////////////////////////////
		System.out.println("다중 포문 브레이크 라벨 사용하기");
	for(int i=1;i<4;i++) {
		for(int j=1;j<6;j++) {
			if(i==2) break;
			System.out.println("i="+i+", j="+j);
		}
	}
	exit:for(int i=1;i<4;i++) {
		for(int j=1;j<6;j++) {
			if(i==2) break exit;
			System.out.println("i="+i+", j="+j);
		}
	}
		
		
	}

 
}
