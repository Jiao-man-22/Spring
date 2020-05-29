package com.asguigu.spring.BeanFactory;
/**
 * 使用实例工厂方法实例化将从容器中调用现有bean的非静态方法来创建新bean。
 * 要使用这种机制，将class属性保留为空，并在factory-bean属性中指定当前(或父或父)容器中bean的名称，
 * 该容器包含要调用来创建对象的实例方法。使用factory-method属性设置工厂方法本身的名称。
 * 下面的例子展示了如何配置这样一个bean:
 * */

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.asguigu.beans.scope.Students;

public class InstanceStudentFactory {
	Students student=new Students();
	public Students createInstanceStudent() {
		return student;
	}
	@Test
    public void test2(){
        ApplicationContext context = new ClassPathXmlApplicationContext("applications.xml");
        Object user = context.getBean("student1");
        Object s = context.getBean("student");
        System.out.println(s);   //User(name=null, age=0)
	

}
}
