package edu.learning.springcore.beanconfig;

import java.util.List;

public class Person {
	
	private int id;
	private String name;
	private String address;
	private Address subAddress;
	
	private List<String> names;
	
	private List<Address> allAddress;
	
	private Address importantPlace;
	
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
	
	public static Person getInstance(int id, String name) {
		System.out.println("Factory method! GetInstance");
		return new Person(id, name);
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



	public List<String> getNames() {
		return names;
	}

	public void setNames(List<String> names) {
		this.names = names;
	}

	
	
	public List<Address> getAllAddress() {
		return allAddress;
	}

	public void setAllAddress(List<Address> allAddress) {
		this.allAddress = allAddress;
	}
	
	

	public Address getImportantPlace() {
		return importantPlace;
	}

	public void setImportantPlace(Address importantPlace) {
		this.importantPlace = importantPlace;
	}

	


	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", address=" + address + ", subAddress=" + subAddress
				+ ", names=" + names + ", allAddress=" + allAddress + ", importantPlace=" + importantPlace + "]";
	}

	public void speak() {
		System.out.println("I am new Person !");
	}

}
