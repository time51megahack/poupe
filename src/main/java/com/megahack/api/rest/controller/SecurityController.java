package com.megahack.api.rest.controller;

import java.net.URI;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.megahack.domain.model.Customer;
import com.megahack.domain.model.User;

@RestController
@RequestMapping("/security")
public class SecurityController {

	@GetMapping("/login")
	public ResponseEntity<Customer> doLogin(@RequestParam String login, @RequestParam String password) {
		return ResponseEntity.ok(new Customer());
	}
	
	@GetMapping("/logout")
	public ResponseEntity<Void> doLogout() {
		return ResponseEntity.noContent().build();
	}
	
	@PostMapping("/customer/{id}")
	public ResponseEntity<Customer> createUser(@RequestBody User user) {
		Customer customer = new Customer();
		return ResponseEntity.created(URI.create("/customer/" + customer.getId())).body(customer);
	}
}
