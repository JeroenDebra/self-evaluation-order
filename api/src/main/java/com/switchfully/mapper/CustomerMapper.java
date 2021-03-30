package com.switchfully.mapper;

import com.switchfully.dto.CreateCustomerDTO;
import com.switchfully.dto.CustomerDTO;
import com.switchfully.model.customer.Adress;
import com.switchfully.model.customer.Customer;
import org.springframework.stereotype.Component;

import java.util.Collection;
import java.util.stream.Collectors;

@Component
public class CustomerMapper {

    public Customer toCustomer(CreateCustomerDTO createCustomerDTO){
       return new Customer(createCustomerDTO.getFirstname(), createCustomerDTO.getLastname(), createCustomerDTO.getEmail(),
                new Adress(createCustomerDTO.getStreetname(), createCustomerDTO.getStreetnumber(), createCustomerDTO.getCity(),
                        createCustomerDTO.getPostcode()), createCustomerDTO.getPhonenumber());
    }

    public CustomerDTO toCustomerDTO(Customer customer){
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

    public Collection<CustomerDTO> listToListDto(Collection<Customer> customers){
        return customers.stream().map(this::toCustomerDTO).collect(Collectors.toList());
    }
}
