package com.switchfully.dto;

public class ItemGroupDTO {

    private String productId;
    private int amount;

    public String getProductId() {
        return productId;
    }

    public int getAmount() {
        return amount;
    }

    public ItemGroupDTO setProductId(String productId) {
        this.productId = productId;
        return this;
    }

    public ItemGroupDTO setAmount(int amount) {
        this.amount = amount;
        return this;
    }
}
