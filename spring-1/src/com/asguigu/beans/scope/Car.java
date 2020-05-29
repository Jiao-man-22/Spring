package com.asguigu.beans.scope;

public class Car {
	private String brand;
	private double price;
	private Students student=null;
	/**
	 * @return the brand
	 */
	public String getBrand() {
		return brand;
	}
	/**
	 * @param brand the brand to set
	 */
	public void setBrand(String brand) {
		this.brand = brand;
	}
	/**
	 * @return the price
	 */
	public double getPrice() {
		return price;
	}
	public Car() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public Car(String brand, double price,Students student) {
		super();
		this.brand = brand;
		this.price = price;
		this.student=student;
	}
	/**
	 * @param price the price to set
	 */
	public void setPrice(double price) {
		this.price = price;
	}
	public void init() {
		System.out.println("init-------------------------");
	}
	public void destory() {
		System.out.println("destory-------------------------");
	}
	/**
	 * @return the student
	 */
	public Students getStudent() {
		return student;
	}
	/**
	 * @param student the student to set
	 */
	public void setStudent(Students student) {
		this.student = student;
	}
	
}
