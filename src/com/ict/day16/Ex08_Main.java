package com.ict.day16;

public class Ex08_Main {
public static void main(String[] args) {
	System.out.println("main: " + Thread.currentThread().getName() );
Ex08_TestA a = new Ex08_TestA();
Ex08_TestB b = new Ex08_TestB();
Ex08_TestC c = new Ex08_TestC();
a.start();
b.start();
c.start();
System.out.println("수고");
}
}
