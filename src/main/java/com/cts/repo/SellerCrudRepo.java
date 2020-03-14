package com.cts.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.cts.entity.Emart_Users_Buyers;
import com.cts.entity.Emart_Users_Sellers;

@Repository
public interface SellerCrudRepo extends CrudRepository<Emart_Users_Sellers, Long> {

	Emart_Users_Sellers findByusername(String Username);
	
	
}
