package com.klef.jfsd.springboot.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.klef.jfsd.springboot.model.JobDrive;
import com.klef.jfsd.springboot.model.JobProfile;
import com.klef.jfsd.springboot.model.JobSeeker;
import com.klef.jfsd.springboot.repository.JobSeekerRepository;

@Service
public class JobSeekerServiceImpl implements JobSeekerService{

	@Autowired
	private JobSeekerRepository jobseekerrepository;
	
	@Override
	public JobSeeker addjobseeker(JobSeeker jobseeker) {
		
		return jobseekerrepository.save(jobseeker);
	}

	
	@Override
	public JobSeeker checkjobseekerlogin(String uname, String pwd) 
	{
		return jobseekerrepository.checkjobseekerlogin(uname, pwd);
	}

	@Override
	public JobSeeker viewjobseeker(String uname) 
	{
		
		return jobseekerrepository.viewjobseeker(uname);
	}

	@Override
	public int changejobseekerpassword(String jobseekeroldpwd, String jobseekernewpwd, String jobseekeruname)
	{
		return jobseekerrepository.updatejobseekerpassword(jobseekernewpwd, jobseekeroldpwd, jobseekeruname);
	}






}
