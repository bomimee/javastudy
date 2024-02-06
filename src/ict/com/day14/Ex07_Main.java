package ict.com.day14;

public class Ex07_Main {
	public static void main(String[] args) {
		Ex07_Land t1 = new Ex07_Land();

		// 인자를 Ex07 이라는 인터ㅠㅔ이스를 가지고있다. - 이벤트 처리할때 많이씀
		t1.autoPlay(new Ex07() {

			@Override
			public void play() {
				System.out.println("회전목마");
			}
		});
		System.out.println("==========");

		// Ex07을 상속받은 Ex07_Car, Ex07_Baseball 중
		// 하나를 생성
		t1.autoPlay(new Ex07_Baseball());
		t1.autoPlay(new Ex07_Car());

		// int k 가 1이면 운전하기. 2면 야구하기 출력과 비슷
		int k = 1;
		if (k == 1) {
			t1.autoPlay(new Ex07_Car());
		} else if (k == 2) {
			t1.autoPlay(new Ex07_Baseball());
		}

		if (k == 1) {
			t1.autoPlay(new Ex07() {

				@Override
				public void play() {
					System.out.println("운전하기2");

				}

			});
		} else if (k == 2) {
			t1.autoPlay(new Ex07() {

				@Override
				public void play() {
					System.out.println("야구하기2");

				}

			});
		}
		System.out.println("====================");
		Ex07 ex07 = null;
		if (k == 1) {
			ex07 = new Ex07_Car();
		} else if (k == 2) {
			ex07 = new Ex07_Baseball();
		}
		ex07.play();
	}
}