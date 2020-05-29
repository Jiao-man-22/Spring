package com.asguigu.spring.aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.asguigu.dao.Usersmanger;
import com.asguigu.dao.impl.UserManagerImpl;

public class test {
	public static void main(String[] args) {
		// 创建ioc容器
		ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		// 获得该bean对象
		// UserManagerImpl bean = (UserManagerImpl) ctx.getBean("targetObj");
		// bean.addUser("123"); 
		//不能使用 实现类  
		Usersmanger um = (Usersmanger) ctx.getBean("usermanager");
		um.addUser();
	}

}
