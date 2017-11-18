package com.metodologia.sistemapelotero.repository;

import com.metodologia.sistemapelotero.entity.Item;
import org.springframework.data.jpa.repository.JpaRepository;


public interface ItemRepository extends JpaRepository<Item, Integer> {
    Item findById(int id);

}
