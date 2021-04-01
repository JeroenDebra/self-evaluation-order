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
        this.itemInfo = item.getItemInfo().getCopy();
        this.amount = amount;
        this.shippingDate = calculateShippingDate(item);
    }

    private LocalDate calculateShippingDate(Item item){
        if (item.getStockAmount()>=amount){
            return LocalDate.now().plusDays(1);
        }
        return LocalDate.now().plusDays(7);
    }

    public BigDecimal getTotalPrice(){
        return itemInfo.getPrice().getAmount().multiply(BigDecimal.valueOf(amount));
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
