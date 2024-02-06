package ict.com.day13;

enum Type2 {
	WALK("워킹화", 250), RUN("런닝화", 255), TRACK("트래킹화", 260), HIK("하이킹화", 260);

	private final String name;
	private final int size;

	// getter 만 생성 (final 이라서 setter는 필요없음)
	public String getName() {
		return name;
	}

	public int getSize() {
		return size;
	}

	// 생성자 역할을 하는놈
	private Type2(String name, int size) {
		this.name = name;
		this.size = size;
	}
}
	public class Ex14 {
		public static void main(String[] args) {
			Type2[] arr = Type2.values(); // 값만 얻어온다 [배열]

			for (int i = 0; i < arr.length; i++) {
				System.out.println(arr[i].getName() + ":" + arr[i].getSize());
			}
		}
	}
