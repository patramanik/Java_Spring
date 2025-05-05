package com.demo.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.demo.entity.Employee;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
        ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
       Employee emp = (Employee) context.getBean("employee1");
        System.out.println(emp);
        Employee emp2 = (Employee) context.getBean("employee2");
        System.out.println(emp2);
        
        Employee emp3 = (Employee) context.getBean("employee3");
        System.out.println(emp3);
    }
    
}
