package com.cts.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class Controller 
{

	String SUCCESS="success";
	
	String ERROR="errors";
	
	
	@GetMapping(value="/one")
	public String BRegister() 
	{
	
		return SUCCESS;
		
	}
	
	
	
	
}
