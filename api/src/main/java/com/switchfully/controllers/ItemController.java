package com.switchfully.controllers;

import com.switchfully.dto.CreateItemDTO;
import com.switchfully.dto.ItemDTO;
import com.switchfully.mapper.ItemMapper;
import com.switchfully.service.ItemService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/items")
public class ItemController {

    private static final Logger logger = LoggerFactory.getLogger(ItemController.class);

    private final ItemService itemService;
    private final ItemMapper itemMapper;

    public ItemController(ItemService itemService, ItemMapper itemMapper) {
        this.itemService = itemService;
        this.itemMapper = itemMapper;
    }

    @PostMapping(consumes = "application/json", produces = "application/json")
    @ResponseStatus(HttpStatus.CREATED)
    public ItemDTO addItem(@RequestHeader("Authorisation") String authorisationId, @RequestBody CreateItemDTO createItemDTO){
        return itemMapper.toDto(itemService.addItem(authorisationId, itemMapper.toItem(createItemDTO)));
    }

}
