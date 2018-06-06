package com.spring.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the org database table.
 * 
 */
@Entity
@NamedQuery(name="Org.findAll", query="SELECT o FROM Org o")
public class Org implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int id;

	private String level;

	@Column(name="org_name")
	private String orgName;

	//bi-directional many-to-one association to User
	@OneToMany(mappedBy="org",cascade=CascadeType.REMOVE)
	private List<User> users;

	public Org() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getLevel() {
		return this.level;
	}

	public void setLevel(String level) {
		this.level = level;
	}

	public String getOrgName() {
		return orgName;
	}

	public void setOrgName(String orgName) {
		this.orgName = orgName;
	}

	public List<User> getUsers() {
		return this.users;
	}

	public void setUsers(List<User> users) {
		this.users = users;
	}

	public User addUser(User user) {
		getUsers().add(user);
		user.setOrg(this);

		return user;
	}

	public User removeUser(User user) {
		getUsers().remove(user);
		user.setOrg(null);

		return user;
	}

}