package com.metodologia.sistemapelotero.service.imp;

import com.metodologia.sistemapelotero.entity.Item;
import com.metodologia.sistemapelotero.repository.ItemRepository;
import com.metodologia.sistemapelotero.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ItemServiceImplementation implements ItemService {
    @Autowired
    ItemRepository itemRepository;

    @Override
    public void save(Item item) {
        itemRepository.save(item);
    }

    @Override
    public Item findById(int id) {
        return itemRepository.findById(id);
    }

    @Override
    public void delete(int id) {
        itemRepository.delete(id);
    }

    @Override
    public void update(int id, Item item) {
        itemRepository.save(item);
    }

    @Override
    public List<Item> findAll() {
        return itemRepository.findAll();
    }

}
