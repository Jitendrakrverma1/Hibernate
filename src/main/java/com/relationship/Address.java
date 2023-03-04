package com.relationship;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Address 
 {
	@Id
	private int id;
	private String address;
	
	@OneToOne(mappedBy = "address")
	private EmpDetails empDetails;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public EmpDetails getEmpDetails() {
		return empDetails;
	}

	public void setEmpDetails(EmpDetails empDetails) {
		this.empDetails = empDetails;
	}

	
}
