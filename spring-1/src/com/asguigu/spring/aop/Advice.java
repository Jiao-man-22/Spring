package com.asguigu.spring.aop;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
@Aspect
@Component
public class Advice {
	/*
	 * pointcut�Ķ���
	 * Pointcut��������һ��������ʽ
	 */
	
	@After("execution(public void com.asguigu.dao.impl.UserManagerImpl.addUser() )")
	public void allAddMethod() {
		System.out.print("����ǰ��֪ͨ");
	};
	
	
	
	

}
