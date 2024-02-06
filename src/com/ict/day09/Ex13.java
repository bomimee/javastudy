package com.ict.day09;

public class Ex13 {
	String name = "";
	int sum = 0;
	double avg = 0.0;
	String hak = "";

	//메서드는 다른 메서드를 호출할수있다
	public void play02(String k1, int kor, int eng, int math) {
		name = k1;
		sum = kor + eng + math;
		play03();
		play04();
		play05();
		
	}	
		public void play03() {
			avg = (int)(sum/3.0 * 10) / 10.0;
			
		}
		// hak
		public void play04() {
			if(avg>=90) {
				hak="A학점";		
			}
			else if(avg>=80) {
				hak="B학점";		
			}
			else if(avg>=70) {
				hak="C학점";		
			} else { hak ="F학점";
		}
			
			}
		//print
		public void play05() {
			System.out.println("name: "+name);
			System.out.println("sum: "+sum);
			System.out.println("avg: "+avg);
			System.out.println("hak: "+hak);
}
}