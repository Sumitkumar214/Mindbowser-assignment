package com.mb.assignment;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Manager {
	
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
	private String email;
	private String firstname;
	private String lastname;
	private String password;
	private String address;
	private String dob;
	private String company;
	
	
	
	public Manager() {
		
	}
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
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

	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
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
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	
	
	
	public Manager(String email, String firstname, String lastname, String password, String address,
			String dob, String company) {
		super();
		this.id = id;
		this.email = email;
		this.firstname = firstname;
		this.lastname = lastname;
		this.password = password;
		this.address = address;
		this.dob = dob;
		this.company = company;
	}

	@Override
	public String toString() {
		return "Manager [id=" + id + ", email=" + email + ", firstname=" + firstname + ", lastname=" + lastname
				+ ", password=" + password + ", address=" + address + ", dob=" + dob + ", company=" + company
				+ ", getId()=" + getId() + ", getEmail()=" + getEmail() + ", getFirstname()=" + getFirstname()
				+ ", getLastname()=" + getLastname() + ", getPassword()=" + getPassword() + ", getAddress()="
				+ getAddress() + ", getDob()=" + getDob() + ", getCompany()=" + getCompany() + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}

	
	
	

}
