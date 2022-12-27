package com.saurav.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.saurav.exceptions.AdminException;
import com.saurav.exceptions.ProductException;
import com.saurav.models.Admin;
import com.saurav.models.Product;
import com.saurav.service.AdminService;

@RestController
@RequestMapping("/saurav")
public class AdminController {
	
	@Autowired
	private AdminService adminService;
	
	
	@PostMapping("/admin/register")
	public ResponseEntity<String> registerAdminHandler(@Valid @RequestBody Admin admin) throws AdminException{
		
		String msg = adminService.registerAdmin(admin);
		
		return new ResponseEntity<String>(msg,HttpStatus.ACCEPTED);
	}
	
	@PostMapping("/admin/product")
	public ResponseEntity<String> registerProductHandler(@Valid @RequestBody Product product) throws ProductException{
		
		String msg = adminService.addProduct(product);
		
		return new ResponseEntity<String>(msg,HttpStatus.ACCEPTED);
	}

}