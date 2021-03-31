package com.switchfully.dto.order;

import java.math.BigDecimal;
import java.util.UUID;

public class ItemGroupDTO {

    private UUID id;
    private String name;
    private BigDecimal price;
    private String Currency;
    private int amount;
    private String shippingDate;

    public UUID getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public int getAmount() {
        return amount;
    }

    public String getCurrency() {
        return Currency;
    }

    public String getShippingDate() {
        return shippingDate;
    }

    public ItemGroupDTO setId(UUID id) {
        this.id = id;
        return this;
    }

    public ItemGroupDTO setName(String name) {
        this.name = name;
        return this;
    }

    public ItemGroupDTO setPrice(BigDecimal price) {
        this.price = price;
        return this;
    }

    public ItemGroupDTO setAmount(int amount) {
        this.amount = amount;
        return this;
    }

    public ItemGroupDTO setCurrency(String currency) {
        Currency = currency;
        return this;
    }

    public ItemGroupDTO setShippingDate(String shippingDate) {
        this.shippingDate = shippingDate;
        return this;
    }
}
