package com.switchfully.repository;

import com.switchfully.model.item.Currency;
import com.switchfully.model.item.Item;
import com.switchfully.model.item.ItemInfo;
import com.switchfully.model.item.Price;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

@Repository
public class ItemRepository {

    private final Set<Item> items = new HashSet<>();

    public ItemRepository() {
        init();
    }

    private void init(){
        items.add(new Item(new ItemInfo("hammer","",new Price(BigDecimal.TEN, Currency.EURO)),20));
    }

    public Collection<Item> getAllItems(){
        return items;
    }

    public boolean addItem(Item item){
        return items.add(item);
    }

}
