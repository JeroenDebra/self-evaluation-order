package com.switchfully.controllers;

import com.switchfully.dto.order.CreateItemGroupDTO;
import com.switchfully.dto.order.OrderDTO;
import com.switchfully.mapper.ItemGroupMapper;
import com.switchfully.mapper.OrderMapper;
import com.switchfully.service.OrderService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RestController
@RequestMapping("/order")
public class OrderController {

    private static final Logger logger = LoggerFactory.getLogger(ItemController.class);

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
        logger.info(customerId + "creates a new order " + items);


        return orderMapper.toDTO(orderService.addOrder(customerId, itemGroupMapper.CreateItemGroupDTOtoMap(items)));
    }

    @GetMapping(produces = "application/json", params = {"customerId"})
    @ResponseStatus(HttpStatus.OK)
    public Collection<OrderDTO> getOrdersByCustomer(@RequestParam String customerId){
        logger.info(customerId + "views order data");

        return orderMapper.listToDTOList(orderService.getOrdersByCustomer(customerId));

    }



}
