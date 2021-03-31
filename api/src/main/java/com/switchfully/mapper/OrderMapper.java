package com.switchfully.mapper;

import com.switchfully.dto.OrderDTO;
import com.switchfully.model.item.Item;
import com.switchfully.model.order.Order;
import org.springframework.stereotype.Component;

import java.util.stream.Collectors;

@Component
public class OrderMapper {

    private final CustomerMapper customerMapper;
    private final ItemMapper itemMapper;

    public OrderMapper(CustomerMapper customerMapper, ItemMapper itemMapper) {
        this.customerMapper = customerMapper;
        this.itemMapper = itemMapper;
    }

    public OrderDTO toDTO(Order order){


        return new OrderDTO()
                .setOrderId(order.getId())
                .setCustomerDTO(customerMapper.toCustomerDTO(order.getCustomer()))
                .setOrderedItems(itemMapper.listItemToListDTO(order.getItems().stream().map(itemGroup -> new Item(itemGroup.getItemInfo(),itemGroup.getAmount())).collect(Collectors.toList())))
                .setTotalPrice(order.getTotalPrice().toString());
    }
}
