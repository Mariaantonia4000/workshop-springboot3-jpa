package com.projeto1.CRUD.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projeto1.CRUD.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}

