package com.dev.spring.mvc.dto;

public class Person {

	private int userid;
	private String name;
	private long phonenumber;
	private String mail;
	public int getUserid() {
		return userid;
	}
	public void setUserid(int userid) {
		this.userid = userid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getPhonenumber() {
		return phonenumber;
	}
	public void setPhonenumber(long phonenumber) {
		this.phonenumber = phonenumber;
	}
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	@Override
	public String toString() {
		return "Person [userid=" + userid + ", name=" + name + ", phonenumber=" + phonenumber + ", mail=" + mail + "]";
	}
	
	
	
}
