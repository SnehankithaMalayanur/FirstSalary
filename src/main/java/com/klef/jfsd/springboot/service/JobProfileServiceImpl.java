package com.klef.jfsd.springboot.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.klef.jfsd.springboot.model.JobProfile;
import com.klef.jfsd.springboot.repository.JobProfileRepository;

@Service
public class JobProfileServiceImpl implements JobProfileService{

	@Autowired
	private JobProfileRepository jobProfileRepository;
	
	@Override
	public JobProfile addcreatejobprofile(JobProfile jobprofile) 
	{
		return jobProfileRepository.save(jobprofile);
	}


}
