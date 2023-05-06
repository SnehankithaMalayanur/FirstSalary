package com.klef.jfsd.springboot.repository;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.klef.jfsd.springboot.model.JobDrive;
import com.klef.jfsd.springboot.model.JobSeeker;
@Repository
public interface JobSeekerRepository extends CrudRepository<JobSeeker, Integer>{

	@Query("select j from JobSeeker j where username=?1 and password=?2")
	public JobSeeker checkjobseekerlogin(String uname,String pwd);
	
	@Query("select j from JobSeeker j where username=?1")
	public JobSeeker viewjobseeker(String uname);
	
	@Transactional
	@Modifying
	@Query("update JobSeeker j set j.password=?1 where j.password=?2 and j.username=?3")
	public int updatejobseekerpassword(String jobseekernewpwd,String jobseekeroldpwd,String jobseekeruname);
	
	@Query("select j from JobDrive j where j.id=?1")
	public JobSeeker viewjobbyid(String id);
}

