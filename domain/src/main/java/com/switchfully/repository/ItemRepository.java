package com.switchfully.repository;

import com.switchfully.model.item.Item;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

@Repository
public class ItemRepository {

    private final Set<Item> items = new HashSet<>();

    public Collection<Item> getAllItems(){
        return items;
    }

    public boolean addItem(Item item){
        return items.add(item);
    }

    public Optional<Item> getItemById(String productId) {
        return items.stream().filter(item -> item.getItemInfo().getId().toString().equals(productId)).findFirst();
    }

    public Item updateItem(String id, Item toItem) {
      Item itemToUpdate =  items.stream().filter(item -> item.getItemInfo().getId().toString().equals(id)).findFirst().get();
      itemToUpdate.update(toItem);

      return itemToUpdate;
    }
}
