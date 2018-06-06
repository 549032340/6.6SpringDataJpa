package com.spring;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.spring.entity.Org;
import com.spring.entity.User;
import com.spring.service.UserService;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringDataJpaApplicationTests {

	@Autowired
	UserService userService;
	
	@Test
	public void contextLoads() {
	}
//	@Test
//	public void find() {
//		User user=userService.findUser();
//	}
//	@Test
//	public void save() {
//		User user=new User();
//		user.setId(4);
//		user.setUserName("老李");
//		user.setPassword("123");
//		Org org=new Org();
//		org.setId(3);
//		org.setName("上海");
//		org.setLevel("T3");
////		org=userService.findOrg(2);
//		System.out.println("-----------"+org);
//		user.setOrg(org);
//		userService.saveUser(user);
//	}
//	@Test
//	public void delOrg() {
//		userService.delOrg(3);
//	}

//	@Test
//	public void save() {
//		List<User> users=new ArrayList<>();
//		for (int i = 5; i < 8; i++) {
//			User user=new User();
//			user.setId(i);
//			user.setUserName("老李");
//			user.setPassword("123");
//			users.add(user);
//		}
//		userService.saveUser(users);
//	}
//
//	@Test
//	public void delete() {
//		
//		userService.delUser(5);
//	}
	@Test
	public void find() {
		System.out.println(userService.findBigOne("北京市公安局", "超级无敌管理员"));
//		System.out.println(userService.findUser3("老李"));
	}
}
