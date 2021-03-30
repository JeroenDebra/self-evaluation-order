package com.switchfully.service;

import com.switchfully.exceptions.OrderCouldNotBeCreatedException;
import com.switchfully.model.order.ItemGroup;
import com.switchfully.model.order.Order;
import com.switchfully.repository.OrderRepository;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class OrderService {

    private final OrderRepository orderRepository;
    private final CustomerService customerService;

    public OrderService(OrderRepository orderRepository, CustomerService customerService) {
        this.orderRepository = orderRepository;
        this.customerService = customerService;
    }

    public Order addOrder(String authorisationId, String customerId, Set<ItemGroup> items){
        Order order = new Order(items,customerService.getCustomer(customerId));
        if (!orderRepository.addOrder(order)) {
            throw new OrderCouldNotBeCreatedException("order by " + customerId + "with items " + items.toString() + "could not be created");
        }
        return order;
    }
}
