package com.demo.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.demo.entity.Person;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Objext Creation" );
        
//        ApplicationContext context  = new ClassPathXmlApplicationContext("config.xml");
//        
//        Person person1 = (Person) context.getBean("person1");
//        
//        System.out.println(person1);
        
        
        AbstractApplicationContext context1  = new ClassPathXmlApplicationContext("config.xml");
        
        Person person1 = (Person) context1.getBean("person1");
        System.out.println(person1);
        
        context1.registerShutdownHook();
        
        
        
        
    }
}
