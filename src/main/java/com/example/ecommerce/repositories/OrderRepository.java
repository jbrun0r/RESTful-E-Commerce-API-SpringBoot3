package com.example.ecommerce.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.ecommerce.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{

}
