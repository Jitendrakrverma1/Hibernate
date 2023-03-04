package com.hibernate;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

@Entity
@Table(name="emp_details")
public class Emp 
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column( length = 50, name="ename")
	private String empName;
	private String email;
	private double salary;
	@Transient
	private String token;
	private boolean status;
	@Temporal(TemporalType.TIMESTAMP)
	private Date joiningDate;
	
	public Emp(int id, String empName, String email, double salary, String token, boolean status, Date joiningDate) {
		super();
		this.id = id;
		this.empName = empName;
		this.email = email;
		this.salary = salary;
		this.token = token;
		this.status = status;
		this.joiningDate = joiningDate;
	}
	public Emp() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public String getToken() {
		return token;
	}
	public void setToken(String token) {
		this.token = token;
	}
	public boolean isStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}
	public Date getJoiningDate() {
		return joiningDate;
	}
	public void setJoiningDate(Date joiningDate) {
		this.joiningDate = joiningDate;
	}
	@Override
	public String toString() {
		return "Emp [id=" + id + ", empName=" + empName + ", email=" + email + ", salary=" + salary + ", token=" + token
				+ ", status=" + status + ", joiningDate=" + joiningDate + "]";
	}
	
}
