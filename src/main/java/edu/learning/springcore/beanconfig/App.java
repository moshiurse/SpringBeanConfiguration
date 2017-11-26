package edu.learning.springcore.beanconfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        HelloWorld helloWorld = new HelloWorld();
        helloWorld.hello();
        
        ApplicationContext context = new FileSystemXmlApplicationContext("beans.xml");
        Person person = (Person) context.getBean("person");
        person.speak();
        
        ((FileSystemXmlApplicationContext)context).close();
    }
}
