package com.eos.spa.model.security;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class test {
	@Id
	private int id;
	private String name;
	private String department;
	
	public test() {
		
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}

}
