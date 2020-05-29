package com.asguigu.dao;

public interface Usersmanger {
	public void addUser();
	public void deleteUser(int id);
	public void modifyUser(int id,String username,String password);
	public String findUserById(int id);
}
