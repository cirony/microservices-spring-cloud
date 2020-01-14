package com.mswspringcloud.lab1.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Player {

	@Id @GeneratedValue
	private Long id;
	
	private String name;
	private Integer number;
	
	public Player() {
		super();
	}
	
	public Player(String name, Integer number) {
		this();
		this.name = name;
		this.number = number;
	}
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getNumber() {
		return number;
	}
	public void setNumber(Integer number) {
		this.number = number;
	}
	
	
}
