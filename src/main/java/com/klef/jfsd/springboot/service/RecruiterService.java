package com.klef.jfsd.springboot.service;


import com.klef.jfsd.springboot.model.Recruiter;

public interface RecruiterService {
	public Recruiter addrecruiter(Recruiter recruiter);

	public Recruiter checkrecruiterlogin(String uname,String pwd);
	public Recruiter viewrecruiter(String uname);
	public int changerecruiterpassword(String recruiteroldpwd,String recruiternewpwd,String recruiteruname);


}
