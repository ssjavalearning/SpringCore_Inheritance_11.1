package com.suraj.spring.test;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.suraj.spring.beans.Employee;

public class InhertanceTest {

	public static void main(String[] args) {

		AbstractApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		Employee employee = context.getBean("employee", Employee.class);
		System.out.println(employee.getId()+"\t"+employee.getName()+"\t"+employee.getGender()+"\t"+employee.getPanNum());
		context.close();
	}

}
