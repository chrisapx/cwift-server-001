package com.cwift.cwiftserver.inventoryService.items.controller;

import com.cwift.cwiftserver.inventoryService.items.model.Item;
import com.cwift.cwiftserver.inventoryService.items.service.ItemService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/items")
public class ItemController {

    private final ItemService itemService;

    public ItemController ( ItemService itemService ) {
        this.itemService = itemService;
    }

    @PostMapping("/sv1")
    public ResponseEntity<Item> saveItem( @RequestBody Item item ){
        return ResponseEntity.ok (itemService.saveitem ( item ));
    }
}
