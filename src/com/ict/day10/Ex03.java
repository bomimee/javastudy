package com.ict.day10;

public class Ex03 {
	//오버로딩 - 한 클래스 안에서 같은 이름 가진 메서드가 여러개 정의 되어있는것
		// 반드시 인자의 자료형이나 개수가 달라야 한다
		public double plus(int s1, int s2) {
			double sum = s1 + s2;
			return sum;
		}

		public double plus(double s1, int s2) {
			double sum = s1 + s2;
			return sum;
		}

		public double plus(int s1, double s2) {
			double sum = s1 + s2;
			return sum;
		}

		public double plus(double s1, double s2) {
			// 소숫점에 의해서 1차이가 날 수도 있다.

			double sum = (int) (s1 + s2);
			return sum;
		}

		public double plus(String s1, String s2) {
			double k1 = Double.parseDouble(s1);
			double k2 = Double.parseDouble(s2);

			double sum = k1 + k2;
			return sum;
		}

		public double plus(String s1, int s2) {
			double k1 = Double.parseDouble(s1);

			double sum = k1 + s2;
			return sum;
		}
		public double plus(int s1, String s2) {
			double k1 = Double.parseDouble(s2);
			//메서드에서 다른 메서드 호출
			double sum = plus(s1, k1);
			return sum;
		}
}
