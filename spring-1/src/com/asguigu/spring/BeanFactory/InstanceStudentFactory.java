package com.asguigu.spring.BeanFactory;
/**
 * ʹ��ʵ����������ʵ�������������е�������bean�ķǾ�̬������������bean��
 * Ҫʹ�����ֻ��ƣ���class���Ա���Ϊ�գ�����factory-bean������ָ����ǰ(�򸸻�)������bean�����ƣ�
 * ����������Ҫ���������������ʵ��������ʹ��factory-method�������ù���������������ơ�
 * ���������չʾ�������������һ��bean:
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
