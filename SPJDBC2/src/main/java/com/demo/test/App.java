package com.demo.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.demo.entity.College;
import com.demo.entity.CollegeConfig;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        ApplicationContext context = new AnnotationConfigApplicationContext(CollegeConfig.class);
        
        College college = context.getBean("getCollege" ,College.class);
        
        college.collegeInfo();
    }
}
