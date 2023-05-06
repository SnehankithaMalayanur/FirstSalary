package com.klef.jfsd.springboot.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.klef.jfsd.springboot.model.JobDrive;

@Repository
public interface JobDriveRepository extends CrudRepository<JobDrive, String> {
	
		
		@Query("select j from JobDrive j where username=?1")
		public JobDriveRepository addnewjobdrive(String uname);

	}


