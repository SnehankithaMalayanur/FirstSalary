package com.klef.jfsd.springboot.repository;

import javax.transaction.Transactional;


import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.klef.jfsd.springboot.model.Recruiter;
@Repository
public interface RecruiterRepository extends CrudRepository<Recruiter, Integer>{
	@Query("select r from Recruiter r where username=?1 and password=?2")
	public Recruiter checkrecruiterlogin(String uname,String pwd);
	
	@Query("select r from Recruiter r where username=?1")
	public Recruiter viewrecruiter(String uname);
	
	@Transactional
	@Modifying
	@Query("update Recruiter r set r.password=?1 where r.password=?2 and r.username=?3")
	public int updaterecruiterpassword(String recruiternewpwd,String recruiteroldpwd,String recruiteruname);


}
