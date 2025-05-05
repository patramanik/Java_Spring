package com.demo.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.demo.entity.Student;
import com.demo.entity.Teacher;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
        //this is using xml
		/*
		 * ApplicationContext context = new
		 * ClassPathXmlApplicationContext("config.xml");
		 * 
		 * Student student = (Student) context.getBean("student");
		 * 
		 * System.out.println(student); System.out.println(student.hashCode());
		 * 
		 * 
		 * 
		 * Student student1 = (Student) context.getBean("student");
		 * 
		 * System.out.println(student1); System.out.println(student1.hashCode());
		 */
        
        
        //this is using annotation
        
        ApplicationContext context = new ClassPathXmlApplicationContext("com/demo/entity/config.xml");
        
       Teacher teacher =  (Teacher) context.getBean("teacher");
       
       System.out.println(teacher);
       System.out.println(teacher.hashCode());
       
       
       Teacher teacher1 =  (Teacher) context.getBean("teacher");
       
       System.out.println(teacher1);
       System.out.println(teacher1.hashCode());
        
    }
}
