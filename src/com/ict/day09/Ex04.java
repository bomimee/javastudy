package com.ict.day09;

public class Ex04 {
String name = "hong";
int kor = 80;
int eng = 95;
int math = 85;
int total = 0;

/*
 * method() : 기능 동작
 * 해당메서드를 호출하면 실행 후 호출한 곳으로 되돌아 간다.
 * 메서드형식 : [접근제한자] [메서드종류] 반환형 메서드 이름([인자]){실행할 내용
 *}
 *일반 메서드는 메서드 종류 생략
 *접근제한자 일반적으로 퍼블릭 사용
 *반환형 - 호출한 곳으로 되돌아갈때 가지고 가는 데이터의 자료형, 데이터가 없는 경우 보이드
 *라는 예약어 사용
 * 
 */
// 인스턴스 메서드
public void play01() {
	//System.out.println(2);
	total = kor + eng + math;
	//System.out.println(3);
	
}
public void play02() {
	int sum = kor + eng + math;}

public int play03() {
	int sum = kor + eng + math;
	return sum;

}
public int play04() {
	
	total = kor + eng + math;
	return 0;
	
}
}

