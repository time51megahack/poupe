package com.megahack.api.rest.controller;

import java.security.Principal;

import org.springframework.web.bind.annotation.GetMapping;

public class MainNavigationController {

	@GetMapping
	public String viewIndex(Principal principa) {
		return "index";
	}
	
}
