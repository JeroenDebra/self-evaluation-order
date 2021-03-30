package com.switchfully.service;

import com.switchfully.exceptions.CouldNotCreateCustomerException;
import com.switchfully.model.customer.Customer;
import com.switchfully.repository.CustomerRepository;
import org.springframework.stereotype.Service;

@Service
public class CustomerService {

    private final CustomerRepository customerRepository;

    public CustomerService(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    public Customer createCustomer(Customer customer){
        if (!customerRepository.createCustomer(customer)) throw new CouldNotCreateCustomerException("Customer could not be saved to the database: " + customer.getEmail());

        return customer;
    }
}
