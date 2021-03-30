package com.switchfully.dto;

import java.math.BigDecimal;
import java.util.UUID;

public class ItemDTO {

    private UUID id;
    private String name;
    private BigDecimal price;
    private String Currency;
    private int amount;

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

    public ItemDTO setId(UUID id) {
        this.id = id;
        return this;
    }

    public ItemDTO setName(String name) {
        this.name = name;
        return this;
    }

    public ItemDTO setPrice(BigDecimal price) {
        this.price = price;
        return this;
    }

    public ItemDTO setAmount(int amount) {
        this.amount = amount;
        return this;
    }

    public ItemDTO setCurrency(String currency) {
        Currency = currency;
        return this;
    }
}
