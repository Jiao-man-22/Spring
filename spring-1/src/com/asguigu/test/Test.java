package com.asguigu.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.asguigu.dao.impl.UserManagerImpl;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//����IOC����
		ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext.xml");
	//��ø�bean����
		UserManagerImpl umi=ctx.getBean(UserManagerImpl.class);
	//ʹ��Bean
		umi.addUser();
		
	}

}
