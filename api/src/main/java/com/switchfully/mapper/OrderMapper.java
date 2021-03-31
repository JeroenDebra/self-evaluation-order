package com.switchfully.mapper;

import com.switchfully.dto.order.OrderDTO;
import com.switchfully.model.order.Order;
import org.springframework.stereotype.Component;

@Component
public class OrderMapper {

    private final CustomerMapper customerMapper;
    private final ItemGroupMapper itemGroupMapper;

    public OrderMapper(CustomerMapper customerMapper, ItemGroupMapper itemGroupMapper) {
        this.customerMapper = customerMapper;
        this.itemGroupMapper = itemGroupMapper;
    }

    public OrderDTO toDTO(Order order){


        return new OrderDTO()
                .setOrderId(order.getId())
                .setCustomer(customerMapper.toCustomerDTO(order.getCustomer()))
                .setOrderedItems(itemGroupMapper.listItemGroupToListDTO(order.getItems()))
                .setTotalPrice(order.getTotalPrice().toString());
    }
}
