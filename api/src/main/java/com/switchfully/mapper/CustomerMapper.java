package com.switchfully.mapper;

import com.switchfully.dto.CreateCustomerDTO;
import com.switchfully.dto.CustomerDTO;
import com.switchfully.model.customer.Adress;
import com.switchfully.model.customer.Customer;
import org.springframework.stereotype.Component;

@Component
public class CustomerMapper {

    public Customer ToCustomer(CreateCustomerDTO createCustomerDTO){
       return new Customer(createCustomerDTO.getFirstname(), createCustomerDTO.getLastname(), createCustomerDTO.getEmail(),
                new Adress(createCustomerDTO.getStreetname(), createCustomerDTO.getStreetnumber(), createCustomerDTO.getCity(),
                        createCustomerDTO.getPostcode()), createCustomerDTO.getPhonenumber());
    }

    public CustomerDTO ToCustomerDTO(Customer customer){
        return new CustomerDTO()
                .setId(customer.getId().toString())
                .setFirstname(customer.getFirstname())
                .setLastname(customer.getLasname())
                .setEmail(customer.getEmail())
                .setPhonenumber(customer.getPhonenumber())
                .setStreetname(customer.getAdress().getStreetname())
                .setStreetnumber(customer.getAdress().getStreetNumber())
                .setCity(customer.getAdress().getCity())
                .setPostcode(customer.getAdress().getPostcode());
    }
}
