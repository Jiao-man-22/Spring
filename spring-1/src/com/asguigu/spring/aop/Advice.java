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
	 * pointcut的定义
	 * Pointcut的内容是一个具体表达式
	 */
	
	@After("execution(public void com.asguigu.dao.impl.UserManagerImpl.addUser() )")
	public void allAddMethod() {
		System.out.print("来自前置通知");
	};
	
	
	
	

}
