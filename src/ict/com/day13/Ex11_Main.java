package ict.com.day13;

public class Ex11_Main {
public static void main(String[] args) {
play2("홍길동");

//Ex11_Soccer soccer = new Ex11_Soccer();
//play(soccer);
//Ex11_BaseGuitar baseGuitar = new Ex11_BaseGuitar();
//play(baseGuitar);

Ex11_IBehavior soccer = new Ex11_Soccer();
Ex11_IBehavior baseGuitar = new Ex11_BaseGuitar();
play(baseGuitar);
System.out.println();

play(new Ex11_Soccer());
}
public static void play(Ex11_IBehavior ib) {
	ib.play();
}
public static void play2(String str) {
	System.out.println(str +" 님성공");
}
}
