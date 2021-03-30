package com.switchfully.controllers;

import com.switchfully.dto.ItemDTO;
import com.switchfully.dto.ItemGroupDTO;
import com.switchfully.service.OrderService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RestController
@RequestMapping("/order")
public class OrderController {

    private final OrderService orderService;

    public OrderController(OrderService orderService) {
        this.orderService = orderService;
    }

    @PostMapping(consumes = "application/json", produces = "application/json")
    @ResponseStatus(HttpStatus.CREATED)
    public ItemDTO addItem(@RequestHeader("CustomerId") String customerId, @RequestBody Collection<ItemGroupDTO> items){
        return null;


       // return itemMapper.toDto(itemService.addItem(authorisationId, itemMapper.toItem(createItemDTO)));
    }

}
