package com.SpringApp.Api;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;


@Entity
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String Name;
	private String cty;
	private String status;

	public User(int id, String name, String cty, String status) {
		super();
		this.id = id;
		Name = name;
		this.cty = cty;
		this.status = status;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", Name=" + Name + ", cty=" + cty + ", status=" + status + "]";
	}

	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getCty() {
		return cty;
	}

	public void setCty(String cty) {
		this.cty = cty;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

}
