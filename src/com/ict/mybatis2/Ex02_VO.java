package com.ict.mybatis2;

public class Ex02_VO {
	private String idk, id, pw, name, age, regdate;

	public Ex02_VO() {

	}

	public Ex02_VO(String idk, String id, String pw, String name, String age, String regdate) {
		super();
		this.idk = idk;
		this.id = id;
		this.pw = pw;
		this.name = name;
		this.age = age;
		this.regdate = regdate;
	}

	public String getIdk() {
		return idk;
	}

	public void setIdx(String idk) {
		this.idk= idk;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPw() {
		return pw;
	}

	public void setPw(String pw) {
		this.pw = pw;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public String getRegdate() {
		return regdate;
	}

	public void setRegdate(String regdate) {
		this.regdate = regdate;
	}

}
