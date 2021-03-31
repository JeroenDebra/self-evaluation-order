package com.switchfully.mapper;

import com.switchfully.dto.CreateItemGroupDTO;
import org.springframework.stereotype.Component;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Component
public class ItemGroupMapper {

    public Map<String, Integer> CreateItemGroupDTOtoMap(Collection<CreateItemGroupDTO> items){

        Map<String, Integer> result = new HashMap<>();

        items.forEach(item -> result.put(item.getProductId(),item.getAmount()));

        return result;
    }

}
