package com.asguigu.spring.beans.collections;

import java.util.Map;

import com.asguigu.spring.beans.Car;

public class NewPerson {
	private String name;
	private int age;
	//Map 集合 键值对的形式 前面的是键 ，后面的值为传入的类型
	Map<String, Car>cars;
	
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the age
	 */
	public int getAge() {
		return age;
	}
	/**
	 * @param age the age to set
	 */
	public void setAge(int age) {
		this.age = age;
	}
	/**
	 * @return the cars
	 */
	public Map<String, Car> getCars() {
		return cars;
	}
	/**
	 * @param cars the cars to set
	 */
	public void setCars(Map<String, Car> cars) {
		this.cars = cars;
	}
	@Override
	public String toString() {
		return "NewPerson [name=" + name + ", age=" + age + ", cars=" + cars + "]";
	}
}
