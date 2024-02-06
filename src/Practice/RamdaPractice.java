package Practice;

public class RamdaPractice {
public static void main(String[] args) {
	//1
	RamdaInterface ri = s -> System.out.println(s);	
	mySayHi(ri);
	
	
//2 
	RamdaInterface ri2 = mySayBye();
	ri2.myString("Bye");
} //main

public static void mySayHi(RamdaInterface r) {
	r.myString("hey");
}

public static RamdaInterface mySayBye() {
	return s -> System.out.println(s);
}
}
