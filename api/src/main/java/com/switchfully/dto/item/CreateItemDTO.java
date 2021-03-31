package com.switchfully.dto.item;

public class CreateItemDTO {

    private String name;
    private String description;
    private double price;
    private int stockAmount;

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public double getPrice() {
        return price;
    }

    public int getStockAmount() {
        return stockAmount;
    }

    public CreateItemDTO setName(String name) {
        this.name = name;
        return this;
    }

    public CreateItemDTO setDescription(String description) {
        this.description = description;
        return this;
    }

    public CreateItemDTO setPrice(double price) {
        this.price = price;
        return this;
    }

    public CreateItemDTO setStockAmount(int stockAmount) {
        this.stockAmount = stockAmount;
        return this;
    }
}
