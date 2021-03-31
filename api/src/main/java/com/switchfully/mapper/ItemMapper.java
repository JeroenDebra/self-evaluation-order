package com.switchfully.mapper;

import com.switchfully.dto.item.CreateItemDTO;
import com.switchfully.dto.item.ItemDTO;
import com.switchfully.dto.item.UpdateItemDTO;
import com.switchfully.model.item.Currency;
import com.switchfully.model.item.Item;
import com.switchfully.model.item.ItemInfo;
import com.switchfully.model.item.Price;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;

@Component
public class ItemMapper {


    public ItemDTO toDto(Item item) {
        return new ItemDTO().setId(item.getItemInfo().getId()).setName(item.getItemInfo().getName()).setPrice(item.getItemInfo().getPrice().getAmount()).setCurrency(item.getItemInfo().getPrice().getCurrency().getName()).setAmount(item.getStockAmount());
    }

    public Item toItem(CreateItemDTO createItemDTO) {
        return new Item(creataItemInfo(createItemDTO), createItemDTO.getStockAmount());
    }

    public Item toItem(UpdateItemDTO updateItemDTO){
        return new Item(creataItemInfo(updateItemDTO),updateItemDTO.getAmount());
    }

    private ItemInfo creataItemInfo(CreateItemDTO createItemDTO){
        return new ItemInfo(createItemDTO.getName(),createItemDTO.getDescription(),createPrice(createItemDTO));
    }

    private ItemInfo creataItemInfo(UpdateItemDTO updateItemDTO){
        return new ItemInfo(updateItemDTO.getName(),updateItemDTO.getDescription(),createPrice(updateItemDTO));
    }

    private Price createPrice(UpdateItemDTO updateItemDTO){
        return new Price(BigDecimal.valueOf(updateItemDTO.getPrice()),Currency.EURO);
    }

    private Price createPrice(CreateItemDTO createItemDTO){
        return new Price(BigDecimal.valueOf(createItemDTO.getPrice()),Currency.EURO);
    }

}
