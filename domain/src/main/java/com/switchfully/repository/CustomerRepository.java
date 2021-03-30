package com.switchfully.repository;

import com.switchfully.model.customer.Customer;
import org.springframework.stereotype.Repository;

import java.util.HashSet;
import java.util.Set;

@Repository
public class CustomerRepository {

    private final Set<Customer> customers = new HashSet<>();

    public boolean createCustomer(Customer customer){
        return customers.add(customer);
    }

}
