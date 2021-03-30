package com.switchfully.mapper;

import com.switchfully.dto.CreateItemDTO;
import com.switchfully.dto.ItemDTO;
import com.switchfully.model.item.Currency;
import com.switchfully.model.item.Item;
import com.switchfully.model.item.ItemInfo;
import com.switchfully.model.item.Price;
import org.springframework.stereotype.Component;
import java.math.BigDecimal;
import java.util.Collection;
import java.util.stream.Collectors;

@Component
public class ItemMapper {


    public ItemDTO toDto(Item item) {
        return new ItemDTO().setId(item.getItemInfo().getId()).setName(item.getItemInfo().getName()).setPrice(item.getItemInfo().getPrice().getAmount()).setCurrency(item.getItemInfo().getPrice().getCurrency().getName()).setAmount(item.getStockAmount());
    }

    public Item toItem(CreateItemDTO createItemDTO) {
        return new Item(creataItemInfo(createItemDTO), createItemDTO.getStockAmount());
    }

    private ItemInfo creataItemInfo(CreateItemDTO createItemDTO){
        return new ItemInfo(createItemDTO.getName(),createItemDTO.getDescription(),createPrice(createItemDTO));
    }

    private Price createPrice(CreateItemDTO createItemDTO){
        return new Price(BigDecimal.valueOf(createItemDTO.getPrice()),Currency.EURO);
    }

    public Collection<ItemDTO> listItemToListDTO(Collection<Item> items) {
        return items.stream().map(this::toDto).collect(Collectors.toList());
    }

}
