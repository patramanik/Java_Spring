package com.demo.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.demo.dao.StudentDaoImpl;
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
        StudentDaoImpl studentDao = context.getBean("getStudentDao",StudentDaoImpl.class);
        
        Student s1 = new Student();
        s1.setId(4);
        s1.setName("manik");
        s1.setCity("pune");
        
        int insert = studentDao.insert(s1);
        
        System.out.println(insert);
        
        
        
    }
}
