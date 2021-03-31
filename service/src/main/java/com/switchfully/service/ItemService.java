package com.switchfully.service;

import com.switchfully.exceptions.CouldNotCreateItemException;
import com.switchfully.exceptions.ItemNotFoundException;
import com.switchfully.exceptions.NotAuthorizedException;
import com.switchfully.model.item.Item;
import com.switchfully.repository.ItemRepository;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.Map;
import java.util.Optional;

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

        if (!itemRepository.addItem(item)) throw new CouldNotCreateItemException("item with id:" + item.getItemInfo().getId() + "coudl not be created by " + authorisationIdId);

        return item;
    }

    public Item getItem(String productId) {
        Optional<Item> item = itemRepository.getItemById(productId);
        if (item.isEmpty()) throw new ItemNotFoundException("item with product id:" + productId + " could not be found");

        return item.get();
    }

    public void reduceStock(Map<String,Integer> productAndAmount) {
        productAndAmount.keySet().forEach(productId -> getItem(productId).decreaseStockAmount(productAndAmount.get(productId)));
    }
}
