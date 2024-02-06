package ict.com.day14;

// member inner class
public class Ex02 {
 String name = "hong";
 private int age = 24;
 static boolean gender = true;
 
 //constructor
 public Ex02() {
	System.out.println(this);
}
 
 // outer class method
 public void sound() {
	 char[] addr;
	 // can call outer class members 
	 // cannot call inner class members
	 //System.out.println(addr);
	 System.out.println("outer class method");
 }
 // inner class
 public class Inner01 {
	 String  addr = "Seoul";
	 int room = 5;
		public Inner01() {
			System.out.println("inner " + this);
		}
		
		public void play() { 
			System.out.println(addr);
			System.out.println(room);
			
			// possible to use outer class members( even private)
			System.out.println(name);
			System.out.println(age);
			System.out.println(gender);
			
			//outer class method
			sound();
		}
	 
 }
}
