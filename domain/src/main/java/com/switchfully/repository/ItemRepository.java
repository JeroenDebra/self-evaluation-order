package com.switchfully.repository;

import com.switchfully.model.Currency;
import com.switchfully.model.Item;
import com.switchfully.model.Price;
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
        items.add(new Item("hammer",new Price(BigDecimal.TEN, Currency.EURO),20));
    }

    public Collection<Item> getAllItems(){
        return items;
    }

}