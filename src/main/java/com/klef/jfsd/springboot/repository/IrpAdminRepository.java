package com.klef.jfsd.springboot.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.klef.jfsd.springboot.model.IrpAdmin;
@Repository
public interface IrpAdminRepository extends CrudRepository<IrpAdmin, String>{

	@Query("select a from IrpAdmin a where username=?1 and password=?2")
	public IrpAdmin checkirpadminlogin(String uname,String pwd);
	
}
