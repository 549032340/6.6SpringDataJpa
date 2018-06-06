package com.spring.service;

import java.util.List;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.dao.UserDao;
import com.spring.entity.Org;
import com.spring.entity.User;

@Service
public class userServiceImpl implements UserService {

	@Autowired
	EntityManager em;
	
	@Autowired
	UserDao userDao;
	
	@Transactional//引入事务
	@Override
	public User findUser() {
		User user = em.find(User.class, 1);
		user.getRoles();
		System.out.println("*************");
		System.out.println(user.getRoles());
		System.out.println("*************");
		return user;
	}
	
	@Transactional
	@Override
	public User findOne(int id) {
		User user = em.find(User.class, id);
		user.getRoles();
		System.out.println("*************");
		System.out.println(user.getRoles());
		System.out.println("*************");
		return user;
	}

	@Transactional
	@Override
	public void saveUser(List<User> users) {
		// TODO Auto-generated method stub
		userDao.save(users);
//		em.persist(user);
	}
	
	@Transactional
	@Override
	public Org findOrg(int id) {
		Org org=em.find(Org.class, 1);
		System.out.println("====="+org);
		return org;
	}

	@Override
	public void saveOrg(User user) {
		// TODO Auto-generated method stub
		
	}

	@Transactional
	@Override
	public void delOrg(int id) {
		em.remove(em.find(Org.class, id));
		
	}

	@Transactional
	@Override
	public void delUser(int id) {
		userDao.delete(id);
		
	}

	@Override
	public List<User> findUser1(String userName) {
		// TODO Auto-generated method stub
		
		return userDao.findByUserName(userName);
	}

	@Override
	public List<User> findUser2(String userName, String password) {
		// TODO Auto-generated method stub
		return userDao.findByUserNameAndPassword(userName,password);
	}

	@Override
	public List<User> findUser3(String userName) {
		// TODO Auto-generated method stub
		return userDao.findByUserNameOrderByPasswordDesc(userName);
	}

	@Override
	public List<User> findBigOne(String orgName, String roleName) {
		// TODO Auto-generated method stub
		return userDao.findByOrgAndRole(orgName, roleName);
	}

	
	

	

}
