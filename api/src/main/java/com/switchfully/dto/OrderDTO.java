package com.switchfully.dto;

import java.util.Collection;
import java.util.UUID;

public class OrderDTO {

    private UUID orderId;
    private CustomerDTO customerDTO;
    private Collection<ItemDTO> orderedItems;
    private String totalPrice;

    public UUID getOrderId() {
        return orderId;
    }

    public CustomerDTO getCustomerDTO() {
        return customerDTO;
    }

    public Collection<ItemDTO> getOrderedItems() {
        return orderedItems;
    }

    public String getTotalPrice() {
        return totalPrice;
    }

    public OrderDTO setOrderId(UUID orderId) {
        this.orderId = orderId;
        return this;
    }

    public OrderDTO setCustomerDTO(CustomerDTO customerDTO) {
        this.customerDTO = customerDTO;
        return this;
    }

    public OrderDTO setOrderedItems(Collection<ItemDTO> orderedItems) {
        this.orderedItems = orderedItems;
        return this;
    }

    public OrderDTO setTotalPrice(String totalPrice) {
        this.totalPrice = totalPrice;
        return this;
    }
}
