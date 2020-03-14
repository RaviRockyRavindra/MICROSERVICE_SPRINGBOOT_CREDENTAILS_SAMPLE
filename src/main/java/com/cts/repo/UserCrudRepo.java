package com.cts.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.cts.entity.Emart_Users_Buyers;

@Repository
public interface UserCrudRepo extends CrudRepository<Emart_Users_Buyers, Long> {

	Emart_Users_Buyers findByusername(String username);
	
	
	
}
