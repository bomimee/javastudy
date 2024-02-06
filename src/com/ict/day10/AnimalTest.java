package com.ict.day10;

public class AnimalTest {
public static void main(String[] args) {
	Animal t = new Animal();
	
	System.out.println("이름: " + t.getName());
	System.out.println("나이: " + t.getAge());
	if(t.isLive()) {
		System.out.println("살아있음");
	}else {
	System.out.println("죽어있음");}
	
	System.out.println();
	
	 t.setName("펭귄");
	 t.setAge(1);
	 t.setLive(true);
	 System.out.println(t.getAge());
	 System.out.println(t.getName());
	 System.out.println(t.isLive());
	 
	 Animal t2 = new Animal();
	 System.out.println();
}
}
