package com.asguigu.spring.beans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		//创建 spring ioc容器 
		//ClassPathXmlApplicationContext是 ApplicationContext接口的实现类
	ApplicationContext ctx=new ClassPathXmlApplicationContext("application.xml");
	//得到ioc中的bean，利用id定位ioc容器中的bean
	//HelloWorld he=(HelloWorld) ctx.getBean("hellWorld");
	//不适用于多个实例，避免了造型，通过类型定位bean
	//HelloWorld he=ctx.getBean(HelloWorld.class);
	//System.out.println(he);
	//获取Car
	//		Car car=ctx.getBean(Car.class);
	//		System.out.println(car);	
	//		Car car=(Car) ctx.getBean("car");
	//		System.out.println(car);
	Person p=(Person) ctx.getBean("person2");
	System.out.println(p);
	}

}
