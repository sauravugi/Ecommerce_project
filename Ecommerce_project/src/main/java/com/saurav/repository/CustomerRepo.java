package com.saurav.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.saurav.models.Customer;

public interface CustomerRepo extends JpaRepository<Customer, Integer>{

}
