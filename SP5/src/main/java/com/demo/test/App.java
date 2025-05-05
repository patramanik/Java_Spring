package com.demo.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.demo.bein.Person;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
        ApplicationContext  context = new ClassPathXmlApplicationContext("config.xml");
        
       Person p1 = (Person) context.getBean("person1");
       
       System.out.println(p1);
    }
}
