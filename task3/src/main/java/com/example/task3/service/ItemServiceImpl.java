package com.example.task3.service;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.task3.model.Item;
import com.example.task3.repository.ItemRepository;
@Service
public class ItemServiceImpl implements ItemService {
    @Autowired
    private ItemRepository itemRepository;
    @Override
    public Item createItem(Item item) {
        return itemRepository.save(item);
    }

    @Override
    public List<Item> getAllItems() {
        return itemRepository.findAll();
    }

    @Override
    public Item getItemById(int id) {
        return itemRepository.findById(id).orElse(null);
    }

    @Override
    public Item updateItem(int id, Item itemDetails) {
        Optional<Item> optionalItem = itemRepository.findById(id);
        if (optionalItem.isPresent()) {
            Item item = optionalItem.get();
            item.setName(itemDetails.getName());
            item.setPrice(itemDetails.getPrice());
            return itemRepository.save(item);
        }
        return null;
    }

    @Override
    public String deleteItem(int id) {
        itemRepository.deleteById(id);
        return "Item with id " + id + " deleted successfully.";
    }
}
