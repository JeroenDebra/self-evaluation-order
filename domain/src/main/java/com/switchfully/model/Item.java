package com.switchfully.model;

import java.util.Objects;
import java.util.UUID;

public class Item {

    private final UUID id;
    private final String name;
    private final Price price;
    private final int stockAmount;

    public Item(String name, Price price, int stockAmount) {
        id = UUID.randomUUID();
        this.name = validName(name);
        this.price = price;
        this.stockAmount = validStockAmount(stockAmount);
    }

    private String validName(String name) {
        if (name == null || name.isBlank()) throw new IllegalArgumentException("not a valid item name for item:" + getId());

        return name;
    }

    private int validStockAmount(int stockAmount) {
        if (stockAmount <= 0) throw new IllegalArgumentException("not a valid stockAmount for item:" + getId());

        return stockAmount;
    }

    public UUID getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Price getPrice() {
        return price;
    }

    public int getStockAmount() {
        return stockAmount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Item item = (Item) o;
        return Objects.equals(id, item.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
