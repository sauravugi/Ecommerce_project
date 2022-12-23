package com.saurav.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.saurav.exceptions.OrderException;
import com.saurav.models.Order;

public interface OrderRepo extends JpaRepository<Order, Integer> {
	
	@Query(value = "Select * from order where DAY(orderdate)= :date", nativeQuery = true)
	List<Order> getDateWiseOrders(int date) throws OrderException;
	
	@Query(value = "Select * from order where MONTH(orderdate)= :date", nativeQuery = true)
	List<Order> getMonthWiseOrders(int date) throws OrderException;

}
