package com.asguigu.spring.beans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		//���� spring ioc���� 
		//ClassPathXmlApplicationContext�� ApplicationContext�ӿڵ�ʵ����
	ApplicationContext ctx=new ClassPathXmlApplicationContext("application.xml");
	//�õ�ioc�е�bean������id��λioc�����е�bean
	//HelloWorld he=(HelloWorld) ctx.getBean("hellWorld");
	//�������ڶ��ʵ�������������ͣ�ͨ�����Ͷ�λbean
	//HelloWorld he=ctx.getBean(HelloWorld.class);
	//System.out.println(he);
	//��ȡCar
	//		Car car=ctx.getBean(Car.class);
	//		System.out.println(car);	
	//		Car car=(Car) ctx.getBean("car");
	//		System.out.println(car);
	Person p=(Person) ctx.getBean("person2");
	System.out.println(p);
	}

}
