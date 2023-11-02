package com.cwift.cwiftserver.inventoryService.items.service;

import com.cwift.cwiftserver.inventoryService.items.model.Item;
import com.cwift.cwiftserver.inventoryService.items.repository.ItemRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class ItemService {

    private final ItemRepository itemRepository;

    public ItemService ( ItemRepository itemRepository ) {
        this.itemRepository = itemRepository;
    }

    public Item saveitem(Item item){
        return itemRepository.save( item );
    }
}
