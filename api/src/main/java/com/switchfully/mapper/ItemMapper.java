package com.switchfully.mapper;

import com.switchfully.dto.ItemDTO;
import model.Item;
import org.springframework.stereotype.Component;

import java.util.Collection;
import java.util.stream.Collectors;

@Component
public class ItemMapper {


    public ItemDTO itemToDto(Item item){
        return new ItemDTO().setId(item.getId())
                .setName(item.getName())
                .setPrice(item.getPrice().getAmount())
                .setCurrency(item.getPrice().getCurrency().getName())
                .setAmount(item.getStockAmount());
    }

    public Collection<ItemDTO> listItemToListDTO(Collection<Item> items){
        return items.stream().map(this::itemToDto).collect(Collectors.toList());
    }

}
