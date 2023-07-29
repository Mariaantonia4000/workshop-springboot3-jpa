package com.projeto1.CRUD.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.projeto1.CRUD.entities.User;

@RestController
@RequestMapping(value = "/users")
public class UserResource {

	@GetMapping
	public ResponseEntity<User> FindAll() {
		User u = new User(1L,"Maria", "maria@gmail.com", "9999999", "122345");
		return ResponseEntity.ok().body(u);	
	}	
}
