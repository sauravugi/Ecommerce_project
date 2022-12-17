package com.saurav.service;

import java.util.List;

import com.saurav.exceptions.CustomerException;
import com.saurav.exceptions.ProductException;
import com.saurav.models.Customer;
import com.saurav.models.Order;
import com.saurav.models.Product;

public class CustomerServiceImpl implements CustomerService{

	@Override
	public Customer registerCustomer(Customer customer) throws CustomerException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String updateCustomer(Customer customer) throws CustomerException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String deleteCustomer(String username, String password) throws CustomerException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String loginCustomer(String username, String password) throws CustomerException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Product> getAllProducts() throws ProductException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Order buyProduct(Integer id, Integer productId) throws CustomerException, ProductException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Product> getProductsByAmount(int amount) throws ProductException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Order> getAllOrders(Integer id) throws CustomerException {
		// TODO Auto-generated method stub
		return null;
	}

}
