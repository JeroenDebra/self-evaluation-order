package com.switchfully.service;

import model.Item;
import org.springframework.stereotype.Service;
import repository.ItemRepository;


import java.util.Collection;

@Service
public class ItemService {

    private final ItemRepository itemRepository;

    public ItemService(ItemRepository itemRepository) {
        this.itemRepository = itemRepository;
    }

    public Collection<Item> getAllItems(){
        return itemRepository.getAllItems();
    }
}
