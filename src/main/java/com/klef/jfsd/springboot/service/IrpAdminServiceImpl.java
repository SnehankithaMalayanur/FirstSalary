package com.klef.jfsd.springboot.service;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.klef.jfsd.springboot.model.IrpAdmin;
import com.klef.jfsd.springboot.model.JobSeeker;
import com.klef.jfsd.springboot.model.Recruiter;
import com.klef.jfsd.springboot.repository.IrpAdminRepository;
import com.klef.jfsd.springboot.repository.JobSeekerRepository;
import com.klef.jfsd.springboot.repository.RecruiterRepository;
@Service
public class IrpAdminServiceImpl implements IrpAdminService{

	@Autowired
	private IrpAdminRepository irpadminrepository;
	
	@Autowired
	private JobSeekerRepository jobseekerrepository;
	
	@Autowired
	private RecruiterRepository recruiterrepository;
	
	
	@Override
	public IrpAdmin checkirpadminlogin(String uname, String pwd) {
		return irpadminrepository.checkirpadminlogin(uname, pwd);
	}

	@Override
	public List<JobSeeker> viewalljobseekers() {
		return (List<JobSeeker>) jobseekerrepository.findAll();
	}
	
	@Override
	public List<Recruiter> viewallrecruiters() {
		return (List<Recruiter>) recruiterrepository.findAll();
	}
	


	@Override
	public void deletejobseeker(int id)
	{
		jobseekerrepository.deleteById(id);
		
	}
////
//	@Override
//	public Employee viewemployeebyid(int id)
//	{
//		return employeeRepository.findById(id).get();
//	}

@Override
public JobSeeker viewjobseekerbyid(int id) {
	return jobseekerrepository.findById(id).get();
	
}


@Override
public void deleterecruiter(int id) {
	// TODO Auto-generated method stub
	
}

@Override
public Recruiter viewrecruiterbyid(int id) {
	return recruiterrepository.findById(id).get();
}

@Override
public List<JobSeeker> viewallapplyjobs() {
	// TODO Auto-generated method stub
	return null;
}

//@Override
//public List<ApplyJob> viewallapplyjobs() {
//	// TODO Auto-generated method stub
//	return null;
//}

}
