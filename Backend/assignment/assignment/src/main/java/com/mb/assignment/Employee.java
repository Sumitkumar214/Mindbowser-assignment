package com.mb.assignment;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Employee {
	
	@Id
	private long empid;
	private String firstname;
	private String lastname;
	private String address;
	private String dob;
	private long mobile;
	private String city;
	
	
	public Employee(){
		
	}
	
	public long getEmpid() {
		return empid;
	}
	public void setEmpid(long empid) {
		this.empid = empid;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public long getMobile() {
		return mobile;
	}
	public void setMobile(long mobile) {
		this.mobile = mobile;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public Employee(long empid, String firstname, String lastname, String address, String dob, long mobile,
			String city) {
		super();
		this.empid = empid;
		this.firstname = firstname;
		this.lastname = lastname;
		this.address = address;
		this.dob = dob;
		this.mobile = mobile;
		this.city = city;
	}
	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", firstname=" + firstname + ", lastname=" + lastname + ", address="
				+ address + ", dob=" + dob + ", mobile=" + mobile + ", city=" + city + ", getEmpid()=" + getEmpid()
				+ ", getFirstname()=" + getFirstname() + ", getLastname()=" + getLastname() + ", getAddress()="
				+ getAddress() + ", getDob()=" + getDob() + ", getMobile()=" + getMobile() + ", getCity()=" + getCity()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}
	
	
	
	
	
}