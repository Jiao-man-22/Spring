package com.asguigu.test;

import com.asguigu.beans.scope.Car;
import com.asguigu.beans.scope.Students;
//Instantiation with a Static Factory Method ʹ�þ�̬��������ʵ����
/**
 * �ڶ���ʹ�þ�̬��������������beanʱ��
 * ʹ��class����ָ��������̬������������
*ʹ��factory-method����ָ������������������ơ�
*��Ӧ���ܹ������������(���п�ѡ���������������)������һ�������
 * �ö��������Ϊ��ͨ�����캯�������ġ�����bean�����һ����;�������������е��þ�̬������
 * */
public class beanFactory {
public static Students getStudentBean() {
	System.out.println("���뾲̬����");
	Students student=new Students(1,"xiaoming",new Car());
	System.out.println(student);
	return student;
}
}
