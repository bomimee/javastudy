package com.ict.day17;

import java.util.ArrayList;
import java.util.List;

public class Ex06_Car {
	private List<String> carList = null;

	//객체를 생성하면 카리스트 컬렉션이 만들어진다
	public Ex06_Car() {
		carList = new ArrayList<String>();
	}
//해당 매서드 실행하면 카네임반환
	public String getCar() {
		String carName = null;
		switch ((int) (Math.random() * 3)) {
		case 0:
			carName = "SM5";

			break;
		case 1:
			carName = "g80";

			break;
		case 2:
			carName = "g70";

			break;

		}
		return carName;

	}

	public synchronized String pop() {
		String carName = null;
		if (carList.size() == 0) {
			try {
				System.out.println("wait");
				this.wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		carName = (String) carList.remove(carList.size() - 1);
		System.out.println(carName + " is sold");
		return carName;
	}

	public synchronized void push(String car) {
		carList.add(car);
		System.out.println("new car : " + car);
		if (carList.size() == 5) {
			this.notify();
		}
	}

}
