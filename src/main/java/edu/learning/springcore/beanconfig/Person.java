package edu.learning.springcore.beanconfig;

public class Person {
	
	private int id;
	private String name;
	private String address;
	private Address subAddress;
	
	public Person() {
		
	}

	public Person(int id, String name) {
		this.id = id;
		this.name = name;
	}

	public void onCreate() {
		System.out.println("Person Created "+ this);
	}
	
	public void onDestroy() {
		System.out.println("Person Destroyed ");
	}
	
	public Address getSubAddress() {
		return subAddress;
	}



	public void setSubAddress(Address subAddress) {
		this.subAddress = subAddress;
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

	
	


	public String getAddress() {
		return address;
	}



	public void setAddress(String address) {
		this.address = address;
	}



	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", address=" + address + ", subAddress=" + subAddress + "]";
	}



	public void speak() {
		System.out.println("I am new Person !");
	}

}
