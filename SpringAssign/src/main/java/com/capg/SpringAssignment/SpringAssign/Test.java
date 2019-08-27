package com.capg.SpringAssignment.SpringAssign;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.capg.SpringAssignment.Address.Customer;

import org.springframework.context.ApplicationContext;
public class Test {

	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("Bean.xml");
		Customer cust=(Customer)context.getBean("customer");
		System.out.println(cust);

	}

}
