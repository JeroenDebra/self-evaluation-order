package com.switchfully.model.item;

import java.util.Objects;
import java.util.UUID;

public class Item {

    private final UUID id;
    private final String name;
    private final String description;
    private final Price price;
    private final int stockAmount;

    public Item(String name, Price price, int stockAmount) {
        this(name,"",price,stockAmount);
    }

    public Item(String name, String description, Price price, int stockAmount) {
        this.id = UUID.randomUUID();
        this.name = validName(name);
        this.price = price;
        this.stockAmount = validStockAmount(stockAmount);
        this.description = description;
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

    public String getDescription() {
        return description;
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
