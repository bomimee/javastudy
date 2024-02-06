package ict.com.day14;

import java.util.InputMismatchException;
import java.util.Scanner;

//e다중캐치문 : 예외가 한개가 아니라는 것
            //주의사항 : 상위클래스 익셉션은 반드시 가장 아래쪽 캐치문에 사용
//형식 -   try{
//           예외 발생 가능문장}
//          catch (예외 객채 e) {
//                예외 발생시 처리하는 문장;}
//          catch (예외 객채 e) {
//                예외 발생시 처리하는 문장;}
//          catch (예외 객채 e) {
//                예외 발생시 처리하는 문장;}
public class Ex09 {
 public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	while(true) {
	try {
	int su1 = 25;
	System.out.println("정수입력:");
	int su2 = scan.nextInt()
;	System.out.println("정답:" + (su1/su2));
	}
	catch (InputMismatchException e) {
		System.out.println("문자가 입력되었습니다");
		scan.nextLine();   //앞에 오류났던것 지워주는역할
	}catch (ArithmeticException e) {
		System.out.println("0으로는 나눌 수 없습니다");
		scan.nextLine(); 
	}
	}
	
	//System.out.println("수고");
}
}
