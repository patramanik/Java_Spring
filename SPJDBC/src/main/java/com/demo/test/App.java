package com.demo.test;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.demo.dao.EmployeeDao;
import com.demo.dao.EmployeeDaoImpl;
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
        
        EmployeeDao empdao = context.getBean("employeeDao", EmployeeDaoImpl.class);
        
//        Employee emp = new Employee();
//        
//        emp.setId(2);
//        emp.setName("suman");
//        emp.setCity("pune");
//
//        int insert = empdao.insert(emp);
//        
//        System.out.println(insert);
        
//        
//        Employee emp = new Employee();
//        
//        emp.setId(2);
//        emp.setName("suman");
//        
//        int update = empdao.update(emp);
//        
//        System.out.println(update);
        
//        Employee emp = new Employee();
//        
//        emp.setId(2);
//        
//        
//        int delete = empdao.delete(emp);
//        
//        System.out.println(delete);
        
        
        
//        Employee oneEmployee = empdao.getOneEmployee(1);
//        
//        System.out.println(oneEmployee);
        
        
        List<Employee> allEmployee = empdao.getAllEmployee();
        
        for(Employee e : allEmployee) System.out.println(e);
        
        

    }
}
