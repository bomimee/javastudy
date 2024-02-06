package ict.com.day13;

class Ex11_Guitar {
	public void like(String str) {
		System.out.println(str + "like ");
	}

	public void sound(String str) {
		System.out.println(str + "sound ");
	}
}

class Ex11_BaseGuitar extends Ex11_Guitar implements Ex11_IBehavior{

	@Override
	public void play() {
		System.out.println("베이스 기타연주 시작");
		
	}

}