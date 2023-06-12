package com.example.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.Order;

public interface OrderReposiroty extends JpaRepository<Order, Integer>{

}
