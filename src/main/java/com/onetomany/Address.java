package com.onetomany;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Address 
{
	@Id
	private int id;
	private String addresType;
	private String address;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getAddresType() {
		return addresType;
	}
	public void setAddresType(String addresType) {
		this.addresType = addresType;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Address(int id, String addresType, String address) {
		super();
		this.id = id;
		this.addresType = addresType;
		this.address = address;
	}
	
	

}
