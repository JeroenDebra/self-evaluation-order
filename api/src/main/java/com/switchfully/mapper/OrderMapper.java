package com.switchfully.mapper;

import com.switchfully.dto.order.OrderDTO;
import com.switchfully.model.order.Order;
import org.springframework.stereotype.Component;

import java.util.Collection;
import java.util.stream.Collectors;

@Component
public class OrderMapper {

    private final CustomerMapper customerMapper;
    private final ItemGroupMapper itemGroupMapper;

    public OrderMapper(CustomerMapper customerMapper, ItemGroupMapper itemGroupMapper) {
        this.customerMapper = customerMapper;
        this.itemGroupMapper = itemGroupMapper;
    }

    public OrderDTO toDTO(Order order) {

        return new OrderDTO().setOrderId(order.getId()).setCustomer(order.getCustomer().getId().toString()).setOrderedItems(itemGroupMapper.listItemGroupToListDTO(order.getItems())).setTotalPrice(order.getTotalPrice().toString());
    }

    public Collection<OrderDTO> listToDTOList(Collection<Order> orders) {
        return orders.stream().map(this::toDTO).collect(Collectors.toList());
    }
}
