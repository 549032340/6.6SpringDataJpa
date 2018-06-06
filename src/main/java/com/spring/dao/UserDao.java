package com.spring.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.spring.entity.User;

public interface UserDao extends JpaRepository<User, Integer> {//主键的类型

	List<User> findByUserName(String userName);
	List<User> findByUserNameAndPassword(String userName,String password);
	List<User> findByUserNameOrderByPasswordDesc(String userName);
//	@Query("select u from User u left join u.org o left join u.roles r where r.roleName=:roleName and o.name=:orgName")
	@Query(nativeQuery=true,value="select u.* from user u LEFT JOIN org o on u.org_id=o.id" + 
			"                               LEFT JOIN mid m on m.user_id=u.id" + 
			"                               LEFT JOIN role r ON r.id=m.role_id" + 
			" where o.org_name=:orgName and r.role_name=:roleName")
	List<User> findByOrgAndRole(@Param("orgName") String orgName,@Param("roleName") String roleName);
	
	
}
