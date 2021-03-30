package com.switchfully.repository;

import com.switchfully.model.customer.Customer;
import org.springframework.stereotype.Repository;

import java.util.*;

@Repository
public class CustomerRepository {

    private final Set<Customer> customers = new HashSet<>();

    public boolean createCustomer(Customer customer){
        return customers.add(customer);
    }

    public Collection<Customer> getAllCustomers(){
        return Collections.unmodifiableSet(customers);
    }

    public Optional<Customer> getCustomer(String id) {
        return customers.stream().filter(customer -> customer.getId().toString().equals(id)).findFirst();
    }
}
