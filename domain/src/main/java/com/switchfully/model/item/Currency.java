package com.switchfully.model.item;

public enum Currency {
    EURO("euro");

    private final String name;

    Currency(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
