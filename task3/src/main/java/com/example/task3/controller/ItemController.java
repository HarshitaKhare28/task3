package com.example.task3.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.task3.model.Item;
import com.example.task3.service.ItemService;

@RestController
@RequestMapping("/items")
public class ItemController {
    
    @Autowired
    private ItemService itemService;

    // Create
    @PostMapping
    public Item createItem(@RequestBody Item item) {
        return itemService.createItem(item);
    }

    // Read All
    @GetMapping
    public List<Item> getAllItems() {
        return itemService.getAllItems();
    }
    //Read by ID
    @GetMapping("/{id}")
    public Item getItemById(@PathVariable int id) {
        return itemService.getItemById(id);
    }

    // Update
    @PutMapping("/{id}")
    public Item updateItem(@PathVariable int id, @RequestBody Item itemDetails) {
        return itemService.updateItem(id, itemDetails);
    }

    // Delete
    @DeleteMapping("/{id}")
    public String deleteItem(@PathVariable int id) {
        return itemService.deleteItem(id);
    } 
}
