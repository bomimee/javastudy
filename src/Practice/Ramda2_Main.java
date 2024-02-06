package Practice;

import java.util.ArrayList;


public class Ramda2_Main {
//1.
	public static void main(String[] args) {	
		Ramda2 ram = s -> System.out.println("Today's dinner is going to be..." + s);
		whatToEat(ram);
//2. 
		int k = (int)(Math.random()*10);
		ArrayList<String> list2 = new ArrayList<String>();
		list2.add("chinese noodle");
		list2.add("rice");
		list2.add("pancake");
		list2.add("salad");
		list2.add("pasta");
		list2.add("spicy rice cake");
		list2.add("gimbob");
		list2.add("noodle soup");
		list2.add("padthai");
		
		Ramda2 ram2 = whatToEat2();
		ram2.dinnerMenu(list2.get(k));
	}
	public static void whatToEat(Ramda2 r) {
		int k = (int)(Math.random()*10);
		ArrayList<String> list = new ArrayList<String>();
		list.add("chinese noodle");
		list.add("rice");
		list.add("pancake");
		list.add("salad");
		list.add("pasta");
		list.add("spicy rice cake");
		list.add("gimbob");
		list.add("noodle soup");
		list.add("padthai");

		r.dinnerMenu(list.get(k));
}
	public static Ramda2 whatToEat2() {
		
		return s -> System.out.println("Today's dinner is going to be..." + s);
	}
}