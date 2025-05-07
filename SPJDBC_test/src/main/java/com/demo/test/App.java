package com.demo.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.demo.entity.Student;
import com.demo.entity.StudentConfig;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
        ApplicationContext context = new AnnotationConfigApplicationContext(StudentConfig.class);
        
        Student student = context.getBean("getStudent",Student.class);
        
        student.studentInfo();
        
        
    }
}
