package com.spring.service;

import java.util.List;

import com.spring.entity.Org;
import com.spring.entity.User;

public interface UserService {

	public User findUser();
	public User findOne(int id);
	public Org findOrg(int id);
	public void saveUser(List<User> users);
	public void saveOrg(User user);
	public void delOrg(int id);
	public void delUser(int id);
//	
	public List<User> findUser1(String userName);
	public List<User> findUser2(String userName,String password);
	public List<User> findUser3(String userName);
	public List<User> findBigOne(String orgName,String roleName);
}
