package com.ict.day11;

public class Ex06 {
	private String name = "";
	private int price = 0;

	public Ex06(String name, int price) {
		//super();
		this.name = name;
		this.price = price;
	}

	// 변수 접근제한자 private - 외부에서 접근 불가
	// 내부에서는 접근 가능하므로
	// 매서드 만들어서 접근해서 데이터 삽입하거나 가져올수 있다.
	// - getter/setter
	
	public void sName(String k) {
		name = k;
	}

	public void sPrice(int k) {
		price = k;
	}

	public String gName() {
		return name;
	}

	public int sPrice() {
		return price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

}
