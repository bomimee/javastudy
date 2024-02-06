package ict.com.day14;
//finally : 예외처리와 상관없이 반드시 실행해야 되는 문장을 처리할때 사용
//           주로 데이터베이스, 입출력, 네트워크에서 사용 (보통 닫을 때 사용)

import java.util.InputMismatchException;
import java.util.Scanner;

//형식 -   try{
//예외 발생 가능문장}
//catch (예외 객채 e) {
//   예외 발생시 처리하는 문장;}
//catch (예외 객채 e) {
//   예외 발생시 처리하는 문장;}
//catch (예외 객채 e) {
//   예외 발생시 처리하는 문장;}
//finally {
// 반드시 실행해야되는 문장
//}
public class Ex10 {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);

	try {
	int su1 = 25;
	System.out.println("정수입력:");
	int su2 = scan.nextInt()
;	System.out.println("정답:" + (su1/su2));
	}
	catch (InputMismatchException e) {
		System.out.println("문자가 입력되었습니다");
		scan.nextLine();   //앞에 오류났던것 지워주는역할
		return;
	}catch (ArithmeticException e) {
		System.out.println("0으로는 나눌 수 없습니다");
		scan.nextLine(); 
		return;
	} finally {
		scan.close(); // finally  에 들어오는게 맞다
		System.out.println("수고");
		
	}
	
	
}
}
