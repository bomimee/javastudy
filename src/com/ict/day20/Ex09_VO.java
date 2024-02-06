package com.ict.day20;

import java.io.Serializable;
//ObjectInputStream : 객체 입력스트림
//readobject() 역직렬화

// 객체의 정보를 담을 수 있는 멤버변수로구성
//1.Serializable interface (abstract method X)
// 멤버필드 모두 객체 직렬화 대상이 된다
//직렬화 대상에서 제외 시키려면 멤버 앞에 transient 예약어 사용
//transient 사용하면 객체나 String => null, int =0, double=0.0, boolean=false 
public class Ex09_VO implements Serializable {
private String name;
private int age;
transient private double weight;
transient private boolean gender;

public Ex09_VO() {
	// TODO Auto-generated constructor stub
}

public Ex09_VO(String name, int age, double weight, boolean gender) {
	super();
	this.name = name;
	this.age = age;
	this.weight = weight;
	this.gender = gender;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public int getAge() {
	return age;
}

public void setAge(int age) {
	this.age = age;
}

public double getWeight() {
	return weight;
}

public void setWeight(double weight) {
	this.weight = weight;
}

public boolean isGender() {
	return gender;
}

public void setGender(boolean gender) {
	this.gender = gender;
}

}
