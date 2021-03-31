package com.switchfully.model.order;

import com.switchfully.model.customer.Customer;

import java.math.BigDecimal;
import java.util.Collections;
import java.util.Set;
import java.util.UUID;

public class Order {

    private final UUID id;
    private final Set<ItemGroup> items;
    private final Customer customer;

    public Order( Set<ItemGroup> items, Customer customer) {
        this.id = UUID.randomUUID();
        this.items = items;
        this.customer = customer;
    }

    public UUID getId() {
        return id;
    }

    public Set<ItemGroup> getItems() {
        return Collections.unmodifiableSet(items);
    }

    public Customer getCustomer() {
        return customer;
    }

    public BigDecimal getTotalPrice(){
        BigDecimal result = BigDecimal.ZERO;

        for (ItemGroup item : items) {
           result = result.add(item.getTotalPrice());
        }

        return result;
    }
}
