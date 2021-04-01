package com.switchfully.repository;

import com.switchfully.model.order.Order;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

@Repository
public class OrderRepository {

    private final Set<Order> orders = new HashSet<>();

    public boolean addOrder(Order order){
        return orders.add(order);
    }

    public Collection<Order> getOrdersByCustomer(String customerId) {
        return orders.stream().filter(order -> order.getCustomer().getId().toString().equals(customerId)).collect(Collectors.toList());
    }
}
