package ict.com.day13;
// class 와 이름 만드는 방법이 동일하다 enum, interface.. 
enum Type{
	WALKING, RUNNING, TRACKING, HICKING, 
}
public class Ex13 {
	
	String name;
	int size;
	Type type; 
	
public static void main(String[] args) {
	Ex13 shose = new Ex13();
	shose.name = "nike";
	shose.size = 230;
	shose.type = Type.WALKING;
	
	System.out.println(shose.name);
	System.out.println(shose.size);
	System.out.println(shose.type);
}
}
