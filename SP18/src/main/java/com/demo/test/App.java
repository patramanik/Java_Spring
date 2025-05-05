package com.demo.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.demo.dao.StudentDao;
import com.demo.dao.StudentDaoImpl;
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
        
        ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
        
        StudentDao dao = context.getBean("studentDao", StudentDaoImpl.class);
        
        Student student = new Student();
        student.setId(2);
       
        
        int result = dao.delete(student);
        
        System.out.println(result);
        
        
    }
}
