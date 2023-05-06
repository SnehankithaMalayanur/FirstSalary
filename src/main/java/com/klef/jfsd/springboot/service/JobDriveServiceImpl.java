package com.klef.jfsd.springboot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.klef.jfsd.springboot.model.JobDrive;
import com.klef.jfsd.springboot.repository.JobDriveRepository;


@Service
public class JobDriveServiceImpl implements JobDriveService{

	@Autowired
	private JobDriveRepository jobdriverepository;
	
	@Override
	public JobDrive addnewjobdrive(JobDrive jobdrive) {
		return jobdriverepository.save(jobdrive);
	}

	@Override
	public List<JobDrive> viewalljobdrive() {
		return (List<JobDrive>)jobdriverepository.findAll();
	}
	
	
}
