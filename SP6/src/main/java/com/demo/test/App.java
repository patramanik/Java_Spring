package com.demo.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.demo.entity.Student;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
        ApplicationContext context =new ClassPathXmlApplicationContext("config.xml");
        
        Student stu = (Student) context.getBean("student1");
        
        System.out.println(stu);
        System.out.println(stu.getName());
        System.out.println(stu.getAddress());
        System.out.println(stu.getPhone());
        System.out.println(stu.getMarks());
        
    }
}
