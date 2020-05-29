package com.asguigu.test;

import com.asguigu.beans.scope.Car;
import com.asguigu.beans.scope.Students;
//Instantiation with a Static Factory Method 使用静态工厂方法实例化
/**
 * 在定义使用静态工厂方法创建的bean时，
 * 使用class属性指定包含静态工厂方法的类
*使用factory-method属性指定工厂方法本身的名称。
*您应该能够调用这个方法(带有可选参数，如后面所述)并返回一个活动对象，
 * 该对象随后被视为是通过构造函数创建的。这种bean定义的一个用途是在遗留代码中调用静态工厂。
 * */
public class beanFactory {
public static Students getStudentBean() {
	System.out.println("进入静态方法");
	Students student=new Students(1,"xiaoming",new Car());
	System.out.println(student);
	return student;
}
}
