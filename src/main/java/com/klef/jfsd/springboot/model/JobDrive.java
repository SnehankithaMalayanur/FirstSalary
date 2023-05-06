package com.klef.jfsd.springboot.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="jobdrive_table")
public class JobDrive {
	@Id
	 @GeneratedValue
	   private int id;
	  @Column(nullable = false,length = 200)
	   private String company;
	  @Column(nullable = false,length = 10)
	   private String jobrole;
	  @Column(nullable = false,length = 10)
	   private String jobdesc;
	  @Column(nullable = false,length = 200)
	  private String ssc;
	  @Column(nullable = false,length = 200)
	  private String inter;
	  @Column(nullable = false,length = 200)
	   private String ug;
	  @Column(nullable = false,length = 200)
	  private String backlogs;
	  @Column(nullable = false,length = 200)
	  private String date;
	  @Column(nullable = false,length = 200)
	  private String location;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public String getJobrole() {
		return jobrole;
	}
	public void setJobrole(String jobrole) {
		this.jobrole = jobrole;
	}
	public String getJobdesc() {
		return jobdesc;
	}
	public void setJobdesc(String jobdesc) {
		this.jobdesc = jobdesc;
	}
	public String getSsc() {
		return ssc;
	}
	public void setSsc(String ssc) {
		this.ssc = ssc;
	}
	public String getInter() {
		return inter;
	}
	public void setInter(String inter) {
		this.inter = inter;
	}
	public String getUg() {
		return ug;
	}
	public void setUg(String ug) {
		this.ug = ug;
	}
	public String getBacklogs() {
		return backlogs;
	}
	public void setBacklogs(String backlogs) {
		this.backlogs = backlogs;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	@Override
	public String toString() {
		return "JobDrive [id=" + id + ", company=" + company + ", jobrole=" + jobrole + ", jobdesc=" + jobdesc
				+ ", ssc=" + ssc + ", inter=" + inter + ", ug=" + ug + ", backlogs=" + backlogs + ", date=" + date
				+ ", location=" + location + "]";
	}

}
