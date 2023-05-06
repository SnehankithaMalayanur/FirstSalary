package com.klef.jfsd.springboot.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="jobseeker_table")
public class JobSeeker {
	 @Id
	 @GeneratedValue
	   private int id;
	  @Column(nullable = false,length = 200)
	   private String name;
	  @Column(nullable = false,length = 10)
	   private String gender;
	  @Column(nullable = false,length = 10)
	  private String workexperience;
	  @Column(nullable = false,length = 200)
	  private String educationalqualification;
	  @Column(nullable = false,length = 200)
	   private String keyskills;
	  @Column(nullable = false,length = 200)
	   private String currentlocation;	  
	  @Column(nullable = false,unique = true,length = 200)
	  private String emailid;
	  @Column(nullable = false,unique = true,length = 200)
	   private String username;
	  @Column(nullable = false,length = 200)
	   private String password;
	  @Column(nullable = false,length = 200)
	  private String contactno;
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
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getWorkexperience() {
		return workexperience;
	}
	public void setWorkexperience(String workexperience) {
		this.workexperience = workexperience;
	}
	public String getEducationalqualification() {
		return educationalqualification;
	}
	public void setEducationalqualification(String educationalqualification) {
		this.educationalqualification = educationalqualification;
	}
	public String getKeyskills() {
		return keyskills;
	}
	public void setKeyskills(String keyskills) {
		this.keyskills = keyskills;
	}
	public String getCurrentlocation() {
		return currentlocation;
	}
	public void setCurrentlocation(String currentlocation) {
		this.currentlocation = currentlocation;
	}
	public String getEmailid() {
		return emailid;
	}
	public void setEmailid(String emailid) {
		this.emailid = emailid;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getContactno() {
		return contactno;
	}
	public void setContactno(String contactno) {
		this.contactno = contactno;
	}
	@Override
	public String toString() {
		return "JobSeeker [id=" + id + ", name=" + name + ", gender=" + gender + ", workexperience=" + workexperience
				+ ", educationalqualification=" + educationalqualification + ", keyskills=" + keyskills
				+ ", currentlocation=" + currentlocation + ", emailid=" + emailid + ", username=" + username
				+ ", password=" + password + ", contactno=" + contactno + "]";
	}
}
