package com.metodologia.sistemapelotero.modelos;

public class UsuarioJson {
/**
 * "id": 0,
    "password": "string",
    "username": "string"
 * 
 **/
	private int id;
	private String username,password;
	private boolean admin;
	
	public UsuarioJson(int id, String username, String password,boolean admin) {
		this.id = id;
		this.username = username;
		this.password = password;
		this.admin=admin;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "UsuarioJson [id=" + id + ", username=" + username + ", password=" + password + "]";
	}
	public boolean isAdmin() {
		return admin;
	}
	public void setAdmin(boolean admin) {
		this.admin = admin;
	}
	
	
	
}
