package com.asguigu.dao.impl;


import org.springframework.stereotype.Component;

import com.asguigu.dao.Usersmanger;
//Ŀ�������
@Component(value = "usermanager")
public class UserManagerImpl implements Usersmanger {

	public void addUser() {
		System.out.println("����㷽��" );
		
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
