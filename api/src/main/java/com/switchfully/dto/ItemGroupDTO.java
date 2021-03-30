package com.switchfully.dto;

public class ItemGroupDTO {

    private String uuid;
    private int amount;

    public String getUuid() {
        return uuid;
    }

    public int getAmount() {
        return amount;
    }

    public ItemGroupDTO setUuid(String uuid) {
        this.uuid = uuid;
        return this;
    }

    public ItemGroupDTO setAmount(int amount) {
        this.amount = amount;
        return this;
    }
}
