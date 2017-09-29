package com.metodologia.sistemapelotero.modelos;

public class ItemsJSO {
	private int id;
	private String name;
	public ItemsJSO(int id, String name) {
		this.id = id;
		this.name = name;
	}
	public ItemsJSO(String name) {
		this.id = id;
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return name;
	}
	
	
}
