package com.switchfully.repository;

import com.switchfully.model.order.Order;
import org.springframework.stereotype.Repository;

import java.util.HashSet;
import java.util.Set;

@Repository
public class OrderRepository {

    private final Set<Order> orders = new HashSet<>();

    public boolean addOrder(Order order){
        return orders.add(order);
    }

}
