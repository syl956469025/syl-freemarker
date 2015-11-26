package com.syl.freemarker;

public class Animal extends Object{
	
	
	private String name;
	private String address;
	private String age;
	private String detail;
	
	
	public Animal(){}
	
	
	
	
	public Animal(String name, String address, String age, String detail) {
		super();
		this.name = name;
		this.address = address;
		this.age = age;
		this.detail = detail;
	}




	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public String getDetail() {
		return detail;
	}
	public void setDetail(String detail) {
		this.detail = detail;
	}
	
	
	
	

}
