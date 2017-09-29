package com.metodologia.sistemapelotero.modelos;

import java.util.List;

public class ComboJson {
/*
 * "id": 0,
    "items": [
      {
        "id": 0,
        "name": "string"
      }
    ],
    "precio": 0
 */
	private int id;
	private List<ItemsJSO> intem;
	public ComboJson(int id, List<ItemsJSO> intem) {
		super();
		this.id = id;
		this.intem = intem;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public List<ItemsJSO> getIntem() {
		return intem;
	}
	public void setIntem(List<ItemsJSO> intem) {
		this.intem = intem;
	}
	
	
}
