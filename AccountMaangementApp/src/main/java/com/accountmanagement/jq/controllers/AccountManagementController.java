package com.accountmanagement.jq.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/management")
public class AccountManagementController {
	
	@GetMapping("/manage")
	public String manage() {
		return "Management working";
	}

		
}
