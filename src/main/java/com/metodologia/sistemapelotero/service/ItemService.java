package com.metodologia.sistemapelotero.service;

import com.metodologia.sistemapelotero.entity.Item;

import java.util.List;

public interface ItemService {
    void save(Item item);
    Item findById(int id);
    void delete(int id);
    void update(int id, Item item);
    List<Item> findAll();

}
