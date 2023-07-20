package com.example.ecommerce.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.ecommerce.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{

}
