package org.tnsindia.client;

import java.util.Scanner;

import org.tnsindia.entities.Customer;
import org.tnsindia.service.CustomerService;
import org.tnsindia.service.CustomerServiceImpl;

public class Client {

	public static void main(String[] args) {
		CustomerService service=new CustomerServiceImpl();
		Customer customer=new Customer();
		Scanner s=new Scanner(System.in);
		
		//create operation
		customer.setCust_ID(155);
		customer.setName("Nirvi sawant");
		customer.setProduct_price(9578.90);
		service.addCustomer(customer);
		System.out.println("Customer added Successfully");
		s.close();
		
		

		
		
		
		
		
		

	}

}