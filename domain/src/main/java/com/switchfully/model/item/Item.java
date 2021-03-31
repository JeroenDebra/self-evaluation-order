package com.switchfully.model.item;

import java.util.Objects;

public class Item {

    private final ItemInfo itemInfo;
    private int stockAmount;

    public Item(ItemInfo itemInfo, int stockAmount) {
       this.itemInfo = itemInfo;
        this.stockAmount = validStockAmount(stockAmount);
    }

    private int validStockAmount(int stockAmount) {
        if (stockAmount <= 0) throw new IllegalArgumentException("not a valid stockAmount for item:" + itemInfo.getId());
        return stockAmount;
    }

    public ItemInfo getItemInfo() {
        return itemInfo;
    }

    public int getStockAmount() {
        return stockAmount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Item item = (Item) o;
        return Objects.equals(itemInfo, item.itemInfo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(itemInfo);
    }

    public void decreaseStockAmount(Integer amount) {
        this.stockAmount -= amount;
    }

    public void update(Item toItem) {
        stockAmount = toItem.getStockAmount();
        itemInfo.update(toItem.getItemInfo());
    }
}
