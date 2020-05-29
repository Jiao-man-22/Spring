package com.asguigu.spring.beans.collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
	ApplicationContext	ctx=new ClassPathXmlApplicationContext("application.xml");
		NewPerson np=(NewPerson) ctx.getBean("newPerson4");
		System.out.println(np);
		
	
	
	}

}
