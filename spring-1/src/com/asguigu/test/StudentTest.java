package com.asguigu.test;


import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StudentTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("beans-scope.xml");
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("applications.xml");
		//使用静态工厂方式
		//System.out.println(ctx.getBean("student"));
		//测试构造注入
		//Object student_2= ctx.getBean("student2");
		//System.out.println(student_2);
		//测试set注入
		//Object student_3 = ctx.getBean("student3");
		//System.out.println(student_3);
		Object  student_2= ctx.getBean("student2");
		Object car_2 = ctx.getBean("bwm");
		System.out.println(student_2+" "+car_2);
		
	}

}
