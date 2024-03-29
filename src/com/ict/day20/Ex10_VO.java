package com.ict.day20;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

// 객체 정보를 담을 수 있는 멤버 변수로 구성
// Externalizable 인터페이스 추상메서드 
public class Ex10_VO implements Externalizable{
	private String name;
	private int age;
	private double weight;
	private boolean gender;

	public Ex10_VO() {
		// TODO Auto-generated constructor stub
	}
	
	
	public Ex10_VO(String name, int age, double weight, boolean gender) {
		
		this.name = name;
		this.age = age;
		this.weight = weight;
		this.gender = gender;
	}


	//직렬화 출력
	//직렬화 대상 넣기
	@Override
	public void writeExternal(ObjectOutput out) throws IOException {
		// TODO Auto-generated method stub
		out.writeObject(name);
		out.writeObject(age);
		out.writeObject(weight);
		out.writeObject(gender);
	}
	
	//역직렬화 입력
// 역직렬화 대상 넣기 
	@Override
	public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
		// TODO Auto-generated method stub
		//순서 같게 
		name = (String) in.readObject();
		age = (int) in.readObject();
		weight = (double) in.readObject();
		gender = (boolean) in.readObject();
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
