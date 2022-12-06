package com.saurav.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.saurav.models.Product;

public interface ProductRepo extends JpaRepository<Product, Integer> {

}
