package com.cognizant.ormlearn.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Country {
	
	@Id
	@Column(name="co_code")
	private String code;
	@Column(name="co_name")
	private String name;
	
	@Override
	public String toString() {
		return String.format("%-15s%-30s",code,name);
	}
	public Country() {
		
	}
	public Country(String code, String name) {
		super();
		this.code = code;
		this.name = name;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	

}
