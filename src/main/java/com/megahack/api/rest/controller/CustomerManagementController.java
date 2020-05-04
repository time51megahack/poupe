package com.megahack.api.rest.controller;

import java.net.URI;
import java.util.ArrayList;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.megahack.domain.model.Customer;

@RestController
@RequestMapping("/customer")
public class CustomerManagementController {

	@PostMapping
	public ResponseEntity<Customer> createCustomer(@RequestBody Customer customer) {
		return ResponseEntity.created(URI.create("/customer/" + customer.getId())).body(customer);
	}
	
	
	@PostMapping("/{id}")
	public ResponseEntity<Customer> updateCustomer(@PathVariable Long id, @RequestBody Customer customer) {
		return ResponseEntity.created(URI.create("/customer/" + id)).body(customer);
	}
	
	@GetMapping
	public List<Customer> getAll(){
		return new ArrayList<Customer>();
	}
	
	@GetMapping("/findByEmail/{email}")
	public Customer findByEmail(@PathVariable String email) {
		return new Customer(); 
	}
	
	@GetMapping("/findByLogin/{login}")
	public Customer findByLogin(@PathVariable String login) {
		return new Customer(); 
	}
	
	@GetMapping("/findByCpf/{cpf}")
	public Customer findByCpf(@PathVariable String cpf) {
		return new Customer(); 
	}
	
}
