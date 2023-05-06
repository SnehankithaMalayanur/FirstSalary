package com.klef.jfsd.springboot.service;

import com.klef.jfsd.springboot.model.JobDrive;
import com.klef.jfsd.springboot.model.JobProfile;
import com.klef.jfsd.springboot.model.JobSeeker;

public interface JobSeekerService {

	public JobSeeker addjobseeker(JobSeeker jobseeker);

	public JobSeeker checkjobseekerlogin(String uname,String pwd);
	public JobSeeker viewjobseeker(String uname);
	public int changejobseekerpassword(String jobseekeroldpwd,String jobseekernewpwd,String jobseekeruname);
	
	

}
