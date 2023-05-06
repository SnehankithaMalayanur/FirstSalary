package com.klef.jfsd.springboot.model;
import javax.persistence.Column;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="jobprofile_table")
public class JobProfile {

	 @Id
	 @GeneratedValue
	   private int id;
	  @Column(nullable = false,length = 200)
	   private String username;
	  @Column(nullable = false,length = 10)
	   private String gender;
	  @Column(nullable = false,length = 10)
	   private String skill1;
	  @Column(nullable = false,length = 200)
	  private String skill2;
	  @Column(nullable = false,length = 200)
	  private String sscpercentage;
	  @Column(nullable = false,length = 200)
	  private String interpercentage;
	  @Column(nullable = false,length = 200)
	  private String ugpercentage;
	  @Column(nullable = false,length = 200)
	  private String emailid;
	  @Column(nullable = false,length = 200)
	   private String resume;
	  @Column(nullable = false,length = 200)
	  private String location;
	  @Column(nullable = false,length = 200)
	  private String linkedinurl;
	  @Column(nullable = false,length = 200)
	  private String contactno;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}

	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getSkill1() {
		return skill1;
	}
	public void setSkill1(String skill1) {
		this.skill1 = skill1;
	}
	public String getSkill2() {
		return skill2;
	}
	public void setSkill2(String skill2) {
		this.skill2 = skill2;
	}
	public String getEmailid() {
		return emailid;
	}
	public void setEmailid(String emailid) {
		this.emailid = emailid;
	}
	public String getResume() {
		return resume;
	}
	public void setResume(String resume) {
		this.resume = resume;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getLinkedinurl() {
		return linkedinurl;
	}
	public void setLinkedinurl(String linkedinurl) {
		this.linkedinurl = linkedinurl;
	}
	public String getContactno() {
		return contactno;
	}
	public void setContactno(String contactno) {
		this.contactno = contactno;
	}
	public String getSscpercentage() {
		return sscpercentage;
	}
	public void setSscpercentage(String sscpercentage) {
		this.sscpercentage = sscpercentage;
	}
	public String getInterpercentage() {
		return interpercentage;
	}
	public void setInterpercentage(String interpercentage) {
		this.interpercentage = interpercentage;
	}
	public String getUgpercentage() {
		return ugpercentage;
	}
	public void setUgpercentage(String ugpercentage) {
		this.ugpercentage = ugpercentage;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
}
