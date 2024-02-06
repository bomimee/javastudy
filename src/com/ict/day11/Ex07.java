package com.ict.day11;

public class Ex07 {
	String name = "";
	int kor = 0;
	int eng = 0;
	int math = 0;

	int sum = 0;
	double avg = 0.0;
	String hak = "";
	int rank = 1;
	
	public Ex07() {
		// TODO Auto-generated constructor stub
	}
	public Ex07(String name, int kor, int eng, int math) {
		//super();
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		// 생성자는 다른 메서드 호출할수있다
		process();
	}

	public void process() {

		sum = kor + eng + math;
		avg = (int) ((sum) / 3.0 * 10) / 10.0;
		if (avg >= 90) {
			hak = "A학점";
		} else if (avg >= 80) {
			hak = "B학점";
		} else if (avg >= 70) {
			hak = "C학점";
		} else {
			hak = "F학점";
		}
	}

}
