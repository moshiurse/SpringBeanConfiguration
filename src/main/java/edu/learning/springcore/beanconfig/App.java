package edu.learning.springcore.beanconfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		HelloWorld helloWorld = new HelloWorld();
		helloWorld.hello();

		ApplicationContext context = new FileSystemXmlApplicationContext("beans.xml");
		Person person = (Person) context.getBean("person");
		person.speak();
		System.out.println(person);

		ApplicationContext applicationContext = new ClassPathXmlApplicationContext(
				"edu/learning/springcore/beanconfig/beans/bean.xml");
		Student student = (Student) applicationContext.getBean("student");
		student.speak();

		Address sAddress = (Address) context.getBean("saddress");
		Address sAddress2 = (Address) context.getBean("saddress2");
		
		for(String name:person.getNames()) {
			System.out.println(name);
		}
		
		System.out.println(sAddress);
		System.out.println(sAddress2);
		System.out.println(person);

		((FileSystemXmlApplicationContext) context).close();
		((ClassPathXmlApplicationContext) applicationContext).close();
	}
}
