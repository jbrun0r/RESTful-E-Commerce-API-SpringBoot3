package com.example.ecommerce.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.ecommerce.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
