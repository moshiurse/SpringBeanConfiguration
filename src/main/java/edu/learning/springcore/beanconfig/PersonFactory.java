package edu.learning.springcore.beanconfig;

public class PersonFactory {

	public Person createPerson(int id, String name) {
		System.out.println("Factory Class! Create Person");
		
		return new Person(id, name);
	}
}
