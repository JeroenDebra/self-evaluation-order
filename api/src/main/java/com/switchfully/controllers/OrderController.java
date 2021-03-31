package com.switchfully.controllers;

import com.switchfully.dto.CreateItemGroupDTO;
import com.switchfully.dto.OrderDTO;
import com.switchfully.mapper.ItemGroupMapper;
import com.switchfully.mapper.OrderMapper;
import com.switchfully.service.OrderService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RestController
@RequestMapping("/order")
public class OrderController {

    private final OrderService orderService;
    private final ItemGroupMapper itemGroupMapper;
    private final OrderMapper orderMapper;

    public OrderController(OrderService orderService, ItemGroupMapper itemGroupMapper, OrderMapper orderMapper) {
        this.orderService = orderService;
        this.itemGroupMapper = itemGroupMapper;
        this.orderMapper = orderMapper;
    }

    @PostMapping(consumes = "application/json", produces = "application/json")
    @ResponseStatus(HttpStatus.CREATED)
    public OrderDTO addOrder(@RequestHeader("CustomerId") String customerId, @RequestBody Collection<CreateItemGroupDTO> items){
        return orderMapper.toDTO(orderService.addOrder(customerId, itemGroupMapper.CreateItemGroupDTOtoMap(items)));
    }

}
