package com.neelu.day_3;

public class User {

	private int Userid;
	private String name;
	public User(int userid, String name) {
		super();
		Userid = userid;
		this.name = name;
	}
	public int getUserid() {
		return Userid;
	}
	public void setUserid(int userid) {
		Userid = userid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "User [Userid=" + Userid + ", name=" + name + "]";
	}
	
	
}
