package com.klef.jfsd.springboot.service;


import java.util.List;

import com.klef.jfsd.springboot.model.JobDrive;


public interface JobDriveService{
	public JobDrive addnewjobdrive(JobDrive jobdrive);
	public List<JobDrive> viewalljobdrive();
	public static JobDrive viewjobid(int id) {
		// TODO Auto-generated method stub
		return null;
	}
	


}
