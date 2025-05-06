package com.demo.test;

import java.util.List;

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
        
        // for insert student 
        
//        Student student = new Student();
//        student.setId(3);
//        student.setName("amit");
//        student.setCity("belda");
//        
//         int insert = dao.insert(student);
//        
//        System.out.println(insert);
        
        
        // for delete one student 
        
//        
//        Student student = new Student();
//        student.setId(2);
//       
//        
//        int result = dao.delete(student);
//        
//        System.out.println(result);
        
        
        // for get one Student
        
//         Student oneStudent = dao.getOneStudent(1);
//         
//         System.out.println(oneStudent);
        
        
        // for get All the Students
        
        List<Student> allStudent = dao.getAllStudent();
        
        for(Student s : allStudent) {
        	
        	System.out.println(s);
        }
        
        
        
    }
}
