package com.switchfully.mapper;

import com.switchfully.dto.customer.CreateCustomerDTO;
import com.switchfully.dto.customer.CustomerDTO;
import com.switchfully.model.customer.Adress;
import com.switchfully.model.customer.Customer;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

import java.util.Collection;
import java.util.stream.Collectors;

@Component
public class CustomerMapper {

    private final ModelMapper modelMapper = new ModelMapper();

    public Customer toCustomer(CreateCustomerDTO createCustomerDTO){

       return new Customer(createCustomerDTO.getFirstname(), createCustomerDTO.getLastname(), createCustomerDTO.getEmail(), createAdress(createCustomerDTO),
               createCustomerDTO.getPhonenumber());
    }

    private Adress createAdress(CreateCustomerDTO createCustomerDTO){
        return new Adress(createCustomerDTO.getStreetname(),createCustomerDTO.getStreetnumber(),createCustomerDTO.getCity(),createCustomerDTO.getPostcode());
    }

    public CustomerDTO toCustomerDTO(Customer customer){
        return new CustomerDTO()
                .setId(customer.getId().toString())
                .setFirstname(customer.getFirstname())
                .setLastname(customer.getLastname())
                .setEmail(customer.getEmail())
                .setPhonenumber(customer.getPhonenumber())
                .setStreetname(customer.getAdress().getStreetname())
                .setStreetnumber(customer.getAdress().getStreetnumber())
                .setCity(customer.getAdress().getCity())
                .setPostcode(customer.getAdress().getPostcode());
    }

    public Collection<CustomerDTO> listToListDto(Collection<Customer> customers){
        return customers.stream().map(this::toCustomerDTO).collect(Collectors.toList());
    }
}
