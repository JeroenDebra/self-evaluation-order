package com.switchfully.dto.item;

public class UpdateItemDTO {

    private String name;
    private String description;
    private double price;
    private int amount;


    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public double getPrice() {
        return price;
    }

    public int getAmount() {
        return amount;
    }

    public UpdateItemDTO setName(String name) {
        this.name = name;
        return this;
    }

    public UpdateItemDTO setDescription(String description) {
        this.description = description;
        return this;
    }

    public UpdateItemDTO setPrice(double price) {
        this.price = price;
        return this;
    }

    public UpdateItemDTO setAmount(int amount) {
        this.amount = amount;
        return this;
    }
}
