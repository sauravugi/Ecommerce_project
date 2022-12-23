package com.saurav.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.saurav.exceptions.AdminException;
import com.saurav.exceptions.CustomerException;
import com.saurav.exceptions.OrderException;
import com.saurav.exceptions.ProductException;
import com.saurav.models.Admin;
import com.saurav.models.Customer;
import com.saurav.models.Order;
import com.saurav.models.Product;
import com.saurav.repository.AdminRepo;
import com.saurav.repository.CustomerRepo;
import com.saurav.repository.OrderRepo;
import com.saurav.repository.ProductRepo;
@Service
public class AdminServiceImpl implements AdminService {
	
	@Autowired
	private AdminRepo adminRepo;
	
	@Autowired
	private CustomerRepo customerRepo;
	
	@Autowired
	private ProductRepo productRepo;
	
	@Autowired
	private OrderRepo orderRepo;

	@Override
	public String registerAdmin(Admin admin) throws AdminException {
		
		if(admin==null) throw new AdminException("Enter Valid Admin Details..!");
		
		adminRepo.save(admin);
		
		return "Register Sucessfully....!";
	}

	@Override
	public String loginAdmin(String username, String password) throws AdminException {
		
		Optional<Admin> opt = adminRepo.findByEmail(username);
		
		if(opt.isEmpty()) throw new AdminException("Enter Valid Admin Email..!");
		
		if(opt.get().getPassword().equals(password)==false)  throw new AdminException("Enter Valid Admin Password..!");
		
		return "Login Sucessfully with Id "+opt.get().getAdminId();
	}

	@Override
	public String deleteAdmin(String username, String password) throws AdminException {
		
		Optional<Admin> opt = adminRepo.findByEmail(username);
		
		if(opt.isEmpty()) throw new AdminException("Enter Valid Admin Email..!");
		
		if(opt.get().getPassword().equals(password)==false)  throw new AdminException("Enter Valid Admin Password..!");
		
		adminRepo.deleteById(opt.get().getAdminId());
		
		return "Login Sucessfully with Id "+opt.get().getAdminId();
	}

	@Override
	public String updateAdmin(Admin admin) throws AdminException {
		
		Optional<Admin> opt = adminRepo.findById(admin.getAdminId());
		
		if(opt.isEmpty()) throw new AdminException("Invalid Admin details");
		
		adminRepo.save(admin);
		
		return "Updated Sucessfully with Id "+admin.getAdminId();
		
	}

	@Override
	public List<Order> getAllOrders() throws OrderException {
		
		List<Order> orders = orderRepo.findAll();
		
		if(orders.size()==0) throw new OrderException("Not Any order Available in the list...!");
		
		return orders;
	}

	@Override
	public List<Order> getDayWiseOrders(int day) throws OrderException {
		
		List<Order> orders = orderRepo.getDateWiseOrders(day);
		
		if(orders.size()==0) throw new OrderException("Not Any order Available in the list...!");
		
		return orders;
	}

	@Override
	public List<Order> getMonthWiseOrders(int month) throws OrderException {

		List<Order> orders = orderRepo.getMonthWiseOrders(month);
		
		if(orders.size()==0) throw new OrderException("Not Any order Available in the list...!");
		
		return orders;
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
