package com.switchfully.dto;

import java.util.Collection;
import java.util.UUID;

public class OrderDTO {

    private UUID orderId;
    private CustomerDTO Customer;
    private Collection<ItemGroupDTO> orderedItems;
    private String totalPrice;

    public UUID getOrderId() {
        return orderId;
    }

    public CustomerDTO getCustomer() {
        return Customer;
    }

    public Collection<ItemGroupDTO> getOrderedItems() {
        return orderedItems;
    }

    public String getTotalPrice() {
        return totalPrice;
    }

    public OrderDTO setOrderId(UUID orderId) {
        this.orderId = orderId;
        return this;
    }

    public OrderDTO setCustomer(CustomerDTO customer) {
        this.Customer = customer;
        return this;
    }

    public OrderDTO setOrderedItems(Collection<ItemGroupDTO> orderedItems) {
        this.orderedItems = orderedItems;
        return this;
    }

    public OrderDTO setTotalPrice(String totalPrice) {
        this.totalPrice = totalPrice;
        return this;
    }
}
