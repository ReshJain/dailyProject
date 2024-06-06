package com.wipro.app;

import java.util.Iterator;
import java.util.List;

import com.wipro.entity.Customer;
import com.wipro.service.CustomerService;
import com.wipro.service.CustomerServiceImpl;
import java.time.LocalDate;
import org.apache.log4j.Logger;
import com.wipro.entity.Book;
import com.wipro.exception.BookException;
import com.wipro.service.BookService;
import com.wipro.service.BookServiceImpl;


public class App {
	
//	private static CustomerService service  = new CustomerServiceImpl();
	
	private static BookService bookService = new BookServiceImpl();
	private static Logger appLogger = Logger.getLogger(App.class);
	
	public static void main(String[] args) {
		try {
			String status = bookService.addBook(new Book(null,"Jones","Spring Programming", LocalDate.of(2023, 10,15),550.0));
			System.out.println(status);
		}catch(BookException e) {
			appLogger.error(e.getMessage(), e);
		}
		
		
		
		
	}


//		service.addCustomer(new Customer(null,"Resh","ch@gmail.com",790679622l));
//		service.addCustomer(new Customer(null,"VAsu","dee@gmail.com",8907896910l));
//		
//		Customer customer1 = service.getCustomerById(1);
//		System.out.println(customer1);
//		
//		Customer customer2 = service.getCustomerById(2);
//		System.out.println(customer2);
		
//		List<Customer> customerList = service.getAllCustomers();
//		Iterator<Customer> iterator = customerList.iterator();
//		while(iterator.hasNext()) {
//			System.out.println(iterator.next());
//		}
		
//		Customer customer1 = service.getCustomerById(1);
//		System.out.println("Befor :"+customer1);
//		customer1.setEmail("charu@gmail.com");
//		String status = service.updateCustomer(customer1);
//		System.out.println(status);
//		customer1 = service.getCustomerById(1);
//		System.out.println("After :"+customer1);
//		
		//****************************************************************
		

	}


