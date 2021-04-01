package com.switchfully.dto.order;

import java.util.Collection;
import java.util.UUID;

public class OrderDTO {

    private UUID orderId;
    private String CustomerId;
    private Collection<ItemGroupDTO> orderedItems;
    private String totalPrice;

    public UUID getOrderId() {
        return orderId;
    }

    public String getCustomer() {
        return CustomerId;
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

    public OrderDTO setCustomer(String customerId) {
        this.CustomerId = customerId;
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
