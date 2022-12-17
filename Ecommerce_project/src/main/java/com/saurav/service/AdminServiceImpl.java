package com.saurav.service;

import java.util.List;

import com.saurav.exceptions.AdminException;
import com.saurav.exceptions.CustomerException;
import com.saurav.exceptions.OrderException;
import com.saurav.exceptions.ProductException;
import com.saurav.models.Admin;
import com.saurav.models.Customer;
import com.saurav.models.Order;
import com.saurav.models.Product;

public class AdminServiceImpl implements AdminService {

	@Override
	public String registerAdmin(Admin admin) throws AdminException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String loginAdmin(String username, String password) throws AdminException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String deleteAdmin(String username, String password) throws AdminException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String updateAdmin(Admin admin) throws AdminException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Order> getAllOrders() throws OrderException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Order> getDayWiseOrders(String day) throws OrderException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Order> getMonthWiseOrders(String month) throws OrderException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Product> getAllProducts() throws ProductException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String addProduct(Product product) throws ProductException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Product> leastQuantityProducts() throws ProductException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Customer> getAllCustomers() throws CustomerException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Customer getCustomerDetailsById(Integer id) throws CustomerException {
		// TODO Auto-generated method stub
		return null;
	}

}
