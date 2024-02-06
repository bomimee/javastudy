package ict.com.day14;

public class Ex03_Main {
public static void main(String[] args) {
	//별도로 내부클래스를 생성할수없다.
	//Inner02 t1 = new Inner02();
	
	Ex03 t1 = new Ex03();
	
	//멤버내부클래스처럼 생성할수 없다.
	//Ex03.Inner02 t2 = t1.new Inner02();
	
	t1.play();
	
	
	}
}
