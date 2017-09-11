package com.metodologia.sistemapelotero.modelos.entity;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import com.metodologia.sistemapelotero.modelos.Direccion;

import javafx.fxml.FXML;


public class ClienteVo {
	
	private int id;

	
	private String dni;
	
	private String nombre;
	
	private String apellido;

	
	
	private String telefono;
	
	private String mail;
	
	private String otraInf;
	private Direccion direccion;
	private String celular;

	public ClienteVo() {

	}

	public ClienteVo(int id, String dni, String nombre, String apellido, Direccion direccion, String telefono, String mail,
			String otraInf) {
		
		this.id = id;
		this.dni = dni;
		this.nombre = nombre;
		this.apellido = apellido;
		this.direccion = direccion;
		this.telefono = telefono;
		this.mail = mail;
		this.otraInf = otraInf;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public Direccion getDireccion() {
		return direccion;
	}

	public void setDireccion(Direccion direccion) {
		this.direccion = direccion;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public String getOtraInf() {
		return otraInf;
	}

	public void setOtraInf(String otraInf) {
		this.otraInf = otraInf;
	}

	public void setCelular(String celular) {
		this.celular = celular;
		
	}

	public String getCelular() {
		
		return celular;
	}

}
