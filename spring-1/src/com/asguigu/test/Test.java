package com.asguigu.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.asguigu.dao.impl.UserManagerImpl;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//创建IOC容器
		ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext.xml");
	//获得该bean对象
		UserManagerImpl umi=ctx.getBean(UserManagerImpl.class);
	//使用Bean
		umi.addUser();
		
	}

}
