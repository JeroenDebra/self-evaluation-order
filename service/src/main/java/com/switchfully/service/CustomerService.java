package com.switchfully.service;

import com.switchfully.exceptions.CouldNotCreateCustomerException;
import com.switchfully.exceptions.CustomerNotFoundException;
import com.switchfully.exceptions.NotAuthorizedException;
import com.switchfully.model.customer.Customer;
import com.switchfully.repository.CustomerRepository;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.Optional;

@Service
public class CustomerService {

    private final CustomerRepository customerRepository;
    private final AdminService adminService;

    public CustomerService(CustomerRepository customerRepository, AdminService adminService) {
        this.customerRepository = customerRepository;
        this.adminService = adminService;
    }

    public Customer createCustomer(Customer customer){
        if (!customerRepository.createCustomer(customer)) throw new CouldNotCreateCustomerException("Customer could not be saved to the database: " + customer.getEmail());

        return customer;
    }

    public Collection<Customer> getAllCustomer(String id){
        if (!adminService.isAdmin(id)) throw new NotAuthorizedException("user with id: " + id + "tried to get Customer data but is not an admin");

        return customerRepository.getAllCustomers();
    }

    public Customer getCustomer(String id) {
        Optional<Customer> customer = customerRepository.getCustomer(id);
        if (customer.isEmpty()) {
            throw new CustomerNotFoundException("Customer with id:" + id + "could not be found");
        }
        return customer.get();
    }

}
