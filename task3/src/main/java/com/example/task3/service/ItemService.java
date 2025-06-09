package com.example.task3.service;
import java.util.List;

import com.example.task3.model.Item;

public interface ItemService {
    Item createItem(Item item);
    List<Item> getAllItems();
    Item getItemById(int id);
    Item updateItem(int id, Item itemDetails);
    String deleteItem(int id);
}
