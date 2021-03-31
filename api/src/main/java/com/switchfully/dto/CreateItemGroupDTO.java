package com.switchfully.dto;

public class CreateItemGroupDTO {

    private String productId;
    private int amount;

    public String getProductId() {
        return productId;
    }

    public int getAmount() {
        return amount;
    }

    public CreateItemGroupDTO setProductId(String productId) {
        this.productId = productId;
        return this;
    }

    public CreateItemGroupDTO setAmount(int amount) {
        this.amount = amount;
        return this;
    }
}
