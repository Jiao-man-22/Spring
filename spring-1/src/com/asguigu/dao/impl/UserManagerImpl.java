package com.asguigu.dao.impl;


import org.springframework.stereotype.Component;

import com.asguigu.dao.Usersmanger;
//目标对象类
@Component(value = "usermanager")
public class UserManagerImpl implements Usersmanger {

	public void addUser() {
		System.out.println("切入点方法" );
		
	}

	public void deleteUser(int id) {
		// TODO Auto-generated method stub
		
	}

	public void modifyUser(int id, String username, String password) {
		// TODO Auto-generated method stub
		
	}

	public String findUserById(int id) {
		// TODO Auto-generated method stub
		return null;
	}



}
