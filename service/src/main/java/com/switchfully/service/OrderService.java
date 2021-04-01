package com.switchfully.service;

import com.switchfully.exceptions.OrderCouldNotBeCreatedException;
import com.switchfully.model.order.ItemGroup;
import com.switchfully.model.order.Order;
import com.switchfully.repository.OrderRepository;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

@Service
public class OrderService {

    private final OrderRepository orderRepository;
    private final CustomerService customerService;
    private final ItemService itemService;

    public OrderService(OrderRepository orderRepository, CustomerService customerService, ItemService itemService) {
        this.orderRepository = orderRepository;
        this.customerService = customerService;
        this.itemService = itemService;
    }

    public Order addOrder(String customerId, Map<String,Integer> productAndAmount){

        Set<ItemGroup> items = productAndAmount.keySet().stream().map(  productId -> new ItemGroup(itemService.getItem(productId),
                productAndAmount.get(productId))).collect(Collectors.toSet());

        Order order = new Order(items, customerService.getCustomerById(customerId));

        if (!orderRepository.addOrder(order)) throw new OrderCouldNotBeCreatedException("Order could not be created");

        itemService.reduceStock(productAndAmount);

        return order;
    }

    public Collection<Order> getOrdersByCustomer(String customerId) {
        return orderRepository.getOrdersByCustomer(customerId);
    }
}
