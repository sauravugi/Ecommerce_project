package com.saurav.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.saurav.models.Admin;

public interface AdminRepo extends JpaRepository<Admin, Integer>{

}
