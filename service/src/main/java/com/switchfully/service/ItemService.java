package com.switchfully.service;

import com.switchfully.exceptions.CouldNotCreateItemException;
import com.switchfully.exceptions.NotAuthorizedException;
import com.switchfully.model.item.Item;
import org.springframework.stereotype.Service;
import com.switchfully.repository.ItemRepository;


import java.util.Collection;

@Service
public class ItemService {

    private final ItemRepository itemRepository;
    private final AdminService adminService;

    public ItemService(ItemRepository itemRepository, AdminService adminService) {
        this.itemRepository = itemRepository;
        this.adminService = adminService;
    }

    public Collection<Item> getAllItems(){
        return itemRepository.getAllItems();
    }

    public Item addItem(String authorisationIdId, Item item){
        if (!adminService.isAdmin(authorisationIdId)) throw new NotAuthorizedException("user with id:" + authorisationIdId + "tried to add an item but has " + "not permission");

        if (!itemRepository.addItem(item)) throw new CouldNotCreateItemException("item with id:" + item.getId() + "coudl not be created by " + authorisationIdId);

        return item;
    }
}
