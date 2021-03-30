package com.switchfully.mapper;

import com.switchfully.dto.ItemGroupDTO;
import org.springframework.stereotype.Component;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Component
public class ItemGroupMapper {

    public Map<String, Integer> toMap(Collection<ItemGroupDTO> items){

        Map<String, Integer> result = new HashMap<>();

        items.forEach(item -> result.put(item.getProductId(),item.getAmount()));

        return result;
    }

}
