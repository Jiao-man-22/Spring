package com.asguigu.spring.aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.asguigu.dao.Usersmanger;
import com.asguigu.dao.impl.UserManagerImpl;

public class test {
	public static void main(String[] args) {
		// ����ioc����
		ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		// ��ø�bean����
		// UserManagerImpl bean = (UserManagerImpl) ctx.getBean("targetObj");
		// bean.addUser("123"); 
		//����ʹ�� ʵ����  
		Usersmanger um = (Usersmanger) ctx.getBean("usermanager");
		um.addUser();
	}

}
