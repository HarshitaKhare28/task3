package com.example.task3.controller;

import java.util.List;
import java.util.Optional;

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
import com.example.task3.repository.ItemRepository;

@RestController
@RequestMapping("/items")
public class ItemController {
    
    @Autowired
    private ItemRepository itemRepository;

    // Create
    @PostMapping
    public Item createItem(@RequestBody Item item) {
        return itemRepository.save(item);
    }

    // Read All
    @GetMapping
    public List<Item> getAllItems() {
        return itemRepository.findAll();
    }

    // Read by ID
    @GetMapping("/{id}")
    public Item getItemById(@PathVariable int id) {
        return itemRepository.findById(id).orElse(null);
    }

    // Update
    @PutMapping("/{id}")
    public Item updateItem(@PathVariable int id, @RequestBody Item itemDetails) {
        Optional<Item> optionalItem = itemRepository.findById(id);
        if (optionalItem.isPresent()) {
            Item item = optionalItem.get();
            item.setName(itemDetails.getName());
            item.setPrice(itemDetails.getPrice());
            return itemRepository.save(item);
        } else {
            return null;
        }
    }

    // Delete
    @DeleteMapping("/{id}")
    public String deleteItem(@PathVariable int id) {
        itemRepository.deleteById(id);
        return "Item with id " + id + " deleted successfully.";
    }   
}
