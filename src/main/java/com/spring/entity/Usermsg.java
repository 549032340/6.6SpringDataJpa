package com.spring.entity;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the usermsg database table.
 * 
 */
@Entity
@NamedQuery(name="Usermsg.findAll", query="SELECT u FROM Usermsg u")
public class Usermsg implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int id;

	private int age;

	private String hobby;

	private String sex;

	public Usermsg() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getAge() {
		return this.age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getHobby() {
		return this.hobby;
	}

	public void setHobby(String hobby) {
		this.hobby = hobby;
	}

	public String getSex() {
		return this.sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

}