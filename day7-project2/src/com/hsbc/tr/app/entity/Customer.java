package com.hsbc.tr.app.entity;

public class Customer {

	private int id;
	private String name;
	private String city;
	
	public Customer() {
		// TODO Auto-generated constructor stub
	}
	
	public Customer(int id,String name,String  city) {
		this.id=id;
		this.name=name;
		this.city=city;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}
	
	@Override
	public boolean equals(Object o) {
		// TODO Auto-generated method stub
	Customer c=(Customer) o;
	
	if(c.getId()==this.getId()) {
		return true;
	}else {
		return false;
	}
}
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return this.getId();
	}
	
}
