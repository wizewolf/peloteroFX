package com.metodologia.sistemapelotero.modelos.entity;

import javafx.beans.property.BooleanProperty;
import javafx.beans.property.SimpleBooleanProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class UsuariosVo {
	private StringProperty id;
	private StringProperty username,password,mail;
	private BooleanProperty admin;
	public UsuariosVo(int id, String username, String password, String mail,
			Boolean admin) {
		this.id = new SimpleStringProperty(""+id);
		this.username = new SimpleStringProperty(username);
		this.mail = new SimpleStringProperty(mail);
		this.admin = new SimpleBooleanProperty(admin);
	}
	public StringProperty getId() {
		return id;
	}
	public void setId(String id) {
		this.id.setValue(""+id);
	}
	public StringProperty getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username.setValue(username);
	}
	public StringProperty getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password.setValue(password);
	}
	public StringProperty getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail.setValue(mail);
	}
	public BooleanProperty getAdmin() {
		return admin;
	}
	public void setAdmin(Boolean admin) {
		this.admin.set(admin);
	}
	
	
}
