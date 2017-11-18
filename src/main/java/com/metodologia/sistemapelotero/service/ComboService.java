package com.metodologia.sistemapelotero.service;

import com.metodologia.sistemapelotero.entity.Combo;

import java.util.List;

public interface ComboService {
    void save(Combo combo);
    Combo findById(int id);
    void delete(int id);
    void update(int id, Combo combo);
    List<Combo> findAll();
}
