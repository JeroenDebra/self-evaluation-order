package com.switchfully.model.item;

import java.util.Objects;
import java.util.UUID;

public class ItemInfo {

    private final UUID id;
    private  String name;
    private  String description;
    private  Price price;

    public ItemInfo(String name, String description, Price price) {
        id = UUID.randomUUID();
        this.name = validName(name);
        this.description = description;
        this.price = price;
    }

    private ItemInfo(UUID id, String name, String description, Price price) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.price = price;
    }

    private String validName(String name) {
        if (name == null || name.isBlank()) throw new IllegalArgumentException("not a valid item name for item:" + getId());

        return name;
    }

    public UUID getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public Price getPrice() {
        return price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ItemInfo itemInfo = (ItemInfo) o;
        return Objects.equals(id, itemInfo.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    public ItemInfo getCopy() {
        return new ItemInfo(this.getId(),this.getName(),this.getDescription(),this.getPrice());
    }

    public void update(ItemInfo itemInfo) {
        name = itemInfo.getName();
        description = itemInfo.getDescription();
        price = itemInfo.getPrice();
    }
}
