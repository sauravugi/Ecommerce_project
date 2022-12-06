package com.saurav.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.saurav.models.Order;

public interface OrderRepo extends JpaRepository<Order, Integer> {

}
