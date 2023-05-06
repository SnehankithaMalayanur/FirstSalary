package com.klef.jfsd.springboot.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.klef.jfsd.springboot.model.Recruiter;
import com.klef.jfsd.springboot.repository.RecruiterRepository;

@Service
public class RecruiterServiceImpl implements RecruiterService{
	
	@Autowired
	private RecruiterRepository recruiterrepository;
	
	
	@Override
	public Recruiter addrecruiter(Recruiter recruiter) {
		
		return recruiterrepository.save(recruiter);
	}

	
	@Override
	public Recruiter checkrecruiterlogin(String uname, String pwd) 
	{
		return recruiterrepository.checkrecruiterlogin(uname, pwd);
	}

	@Override
	public Recruiter viewrecruiter(String uname) 
	{
		
		return recruiterrepository.viewrecruiter(uname);
	}

	@Override
	public int changerecruiterpassword(String recruiteroldpwd, String recruiternewpwd, String recruiteruname)
	{
		return recruiterrepository.updaterecruiterpassword(recruiternewpwd, recruiteroldpwd, recruiteruname);
	}









}
