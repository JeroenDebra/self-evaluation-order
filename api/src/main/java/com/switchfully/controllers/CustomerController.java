package com.switchfully.controllers;

import com.switchfully.dto.CreateCustomerDTO;
import com.switchfully.dto.CustomerDTO;
import com.switchfully.mapper.CustomerMapper;
import com.switchfully.service.CustomerService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/items")
public class CustomerController {

    private static final Logger logger = LoggerFactory.getLogger(ItemController.class);

    private final CustomerService customerService;
    private final CustomerMapper customerMapper;

    public CustomerController(CustomerService customerService, CustomerMapper customerMapper) {
        this.customerService = customerService;
        this.customerMapper = customerMapper;
    }

    @PostMapping(consumes = "application/json",produces = "application/json")
    @ResponseStatus(HttpStatus.CREATED)
    public CustomerDTO addMember(@RequestBody CreateCustomerDTO createMemberDTO){
        logger.info("A new Member account is being created with email: " + createMemberDTO.getEmail());

        return customerMapper.ToCustomerDTO(customerService.createCustomer(customerMapper.ToCustomer(createMemberDTO)));

    }

}
