package com.klef.jfsd.springboot.service;

import java.util.List;

import com.klef.jfsd.springboot.model.IrpAdmin;
import com.klef.jfsd.springboot.model.JobSeeker;
import com.klef.jfsd.springboot.model.Recruiter;

public interface IrpAdminService {
	public IrpAdmin checkirpadminlogin(String uname,String pwd);
	public List<JobSeeker> viewalljobseekers();
	public void deletejobseeker(int id);
	public JobSeeker viewjobseekerbyid(int id);
	public List<Recruiter> viewallrecruiters();
	public void deleterecruiter(int id);
	public Recruiter viewrecruiterbyid(int id);
	public List<JobSeeker> viewallapplyjobs();
}
