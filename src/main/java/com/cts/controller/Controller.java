package com.cts.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.cts.entity.Emart_Users_Buyers;
import com.cts.entity.Emart_Users_Sellers;
import com.cts.repo.SellerCrudRepo;
import com.cts.repo.UserCrudRepo;

@RestController
public class Controller 
{

	String SUCCESS="success";
	
	String ERROR="errors";
	
	@Autowired
	UserCrudRepo usercrudrepo;
	
	@Autowired
	SellerCrudRepo sellercrudrepo;
	
	@PostMapping(value="/buyerregister")
	public String BRegister(@RequestParam String Username, @RequestParam String password,@RequestParam String role) 
	{
	
		Emart_Users_Buyers users = new Emart_Users_Buyers();
		
		users.setUsername(Username);
		
		users.setPassword(password);
		
		users.setRole(role);
		
		usercrudrepo.save(users);
		
		return SUCCESS;
		
	}
	
	@PostMapping(value="/buyerlogin")
	public String BLogin(@RequestParam String username, @RequestParam String password) 
	{
	
		
		Emart_Users_Buyers hh=usercrudrepo.findByusername(username);
		
		
			if(hh.getPassword().toString().equals(password))
			{
				return SUCCESS;
			}
			else
			{
				return "wrong password";
			}
			
		
	}
	
	@PostMapping(value="/sellerregister")
	public String SRegister(@RequestParam String Username, @RequestParam String password,@RequestParam String role) 
	{
	
		Emart_Users_Sellers users = new Emart_Users_Sellers();
		
		users.setUsername(Username);
		
		users.setPassword(password);
		
		users.setRole(role);
		
		sellercrudrepo.save(users);
		
		return SUCCESS;
		
	}
	
	@PostMapping(value="/sellerlogin")
	public String SLogin(@RequestParam String username, @RequestParam String password) 
	{
	
	
		Emart_Users_Sellers users = sellercrudrepo.findByusername(username);
	
	
		
		if(sellercrudrepo.findByusername(username)!=null)
		{
			
			if(users.getPassword().toString().equals(password))
			{
				return SUCCESS;
			}
			else
			{
				return ERROR;
			}
			
			
			
		}
		
		else
		{
			
			return ERROR;
			
		}
		


	
	}
	
	
}
