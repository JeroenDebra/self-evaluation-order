package com.switchfully.model.order;

import com.switchfully.model.item.Item;
import com.switchfully.model.item.ItemInfo;

import java.math.BigDecimal;
import java.time.LocalDate;

public class ItemGroup {

    private final ItemInfo itemInfo;
    private final int amount;
    private final LocalDate shippingDate;

    public ItemGroup(Item item, int amount) {
        this.itemInfo = item.getItemInfo();
        this.amount = amount;
        this.shippingDate = calculateShippingDate(item);
    }

    private LocalDate calculateShippingDate(Item item){
        return null;
    }

    public BigDecimal caluclateFullAmount(){
        return null;
    }

    public ItemInfo getItemInfo() {
        return itemInfo;
    }

    public int getAmount() {
        return amount;
    }

    public LocalDate getShippingDate() {
        return shippingDate;
    }
}
