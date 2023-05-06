package com.klef.jfsd.springboot.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.klef.jfsd.springboot.model.JobProfile;

@Repository
public interface JobProfileRepository extends CrudRepository<JobProfile, Integer>{
	
	@Query("select a from JobProfile a where username=?1")
	public JobProfileRepository createjobprofile(String uname);
	
	
}
