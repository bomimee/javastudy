package ict.com.day14;

//local 
public class Ex03 {

	String name = "둘리";
	private int age = 3;

	public Ex03() {
		System.out.println("외부 : " + this);
	}

	public void sound() {
		String str = " 호이 호이";
		System.out.println(str);
	}

//내부클래스를 가지고 있는 메서드
	public void play() {
		int age = 149;
		int cnt = 10;

		class Inner02 {
			String addr = "서울";

			public Inner02() {
				System.out.println("내부 : " + this);
			}

			public void like() {
				System.out.println(name);
				System.out.println(age);
				System.out.println(addr);

				// 내부클래스의 this 외부 클래스의 this 가 다르다
				// System.out.println(this.age);

				// 외부클래스 메서드 사용가능
				sound();
			} //내부 메서드 끝
			public void setA(int k) {
				System.out.println(k);
			}
			// 외부클래스 메서드 사용불가
			// sound();
			}// 내부클래스 끝
			Inner02 inner02 = new Inner02();
			System.out.println(name);
			System.out.println(this.age); //3
			inner02.like();
			System.out.println("==================");
		    inner02.setA(this.age);
		
		}// 외부메서드끝
	}// 외부 클래스끝

