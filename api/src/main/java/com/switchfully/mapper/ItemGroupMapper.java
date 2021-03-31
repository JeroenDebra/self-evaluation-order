package com.switchfully.mapper;

import com.switchfully.dto.CreateItemGroupDTO;
import com.switchfully.dto.ItemGroupDTO;
import com.switchfully.model.order.ItemGroup;
import org.springframework.stereotype.Component;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

@Component
public class ItemGroupMapper {

    public Map<String, Integer> CreateItemGroupDTOtoMap(Collection<CreateItemGroupDTO> items){

        Map<String, Integer> result = new HashMap<>();

        items.forEach(item -> result.put(item.getProductId(),item.getAmount()));

        return result;
    }

    public Collection<ItemGroupDTO> listItemGroupToListDTO(Collection<ItemGroup> itemGroups) {
        return itemGroups.stream().map(this::toDTO).collect(Collectors.toList());
    }

    public ItemGroupDTO toDTO(ItemGroup itemGroup){
     return new ItemGroupDTO()
             .setId(itemGroup.getItemInfo().getId())
                .setName(itemGroup.getItemInfo().getName())
                .setPrice(itemGroup.getTotalPrice())
                .setCurrency(itemGroup.getItemInfo().getPrice().getCurrency().toString())
                .setAmount(itemGroup.getAmount())
                .setShippingDate(itemGroup.getShippingDate().toString());
    }

}
