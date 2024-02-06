package com.ict.homework;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class LibraryTest {
public static void main(String[] args) {
	List<Book> bookList = new ArrayList<>();
	
	bookList.add(new Book("자바", 25000));
	bookList.add(new Book("파이썬", 15000));
	bookList.add(new Book("안드로이드", 30000));
	
	//스트림생성하고 출력
	
	Stream<Book> stream = bookList.stream();
	
	int total = stream.mapToInt(i->i.getPrice()).sum();
	System.out.println("total: " + total);
	
	bookList.stream().filter(i->i.getPrice()>=20000).map(i->i.getName()).
	sorted().forEach(i->System.out.println(i));
	
	
}
}
