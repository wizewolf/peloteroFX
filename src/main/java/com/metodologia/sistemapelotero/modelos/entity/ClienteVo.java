package com.metodologia.sistemapelotero.modelos.entity;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import com.metodologia.sistemapelotero.modelos.Direccion;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import javafx.fxml.FXML;

public class ClienteVo {

	private StringProperty id;
	

	private StringProperty dni;

	private StringProperty nombre;

	private StringProperty apellido;

	private StringProperty telefono;

	private StringProperty mail;

	private StringProperty otraInf;
	private StringProperty calle;

	private StringProperty altura;

	private StringProperty nroDepartamento;

	private StringProperty piso;

	private StringProperty celular;

	public ClienteVo() {

	}

	public ClienteVo(int id,String dni, String nombre, String apellido, String telefono, String mail, String otraInf,
			String celular,Direccion direccion) {
		this.id= new SimpleStringProperty(""+id);
		this.dni = new SimpleStringProperty(dni);
		this.nombre = new SimpleStringProperty(nombre);
		this.apellido = new SimpleStringProperty(apellido);
		this.telefono = new SimpleStringProperty(telefono);
		this.mail = new SimpleStringProperty(mail);
		this.otraInf = new SimpleStringProperty(otraInf);
		this.celular = new SimpleStringProperty(celular);
		this.calle = new SimpleStringProperty(direccion.getCalle());
		this.altura = new SimpleStringProperty(direccion.getAltura());
		this.piso = new SimpleStringProperty(String.valueOf(direccion.getPiso()));
		this.setNroDepartamento(new SimpleStringProperty(direccion.getNroDepartamento()));
		 
	}

	public StringProperty getId() {
		return id;
	}

	public void setId(String id) {
		this.id.setValue(id);
	}

	public StringProperty getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni.setValue(dni);
	}

	public StringProperty getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre.setValue(nombre);
	}

	public StringProperty getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido.setValue(apellido);
	}

	public StringProperty getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono.setValue(telefono);
	}

	public StringProperty getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail.setValue(mail);
	}

	public StringProperty getOtraInf() {
		return otraInf;
	}

	public void setOtraInf(String otraInf) {
		this.otraInf.setValue(otraInf);
	}



	public StringProperty getCalle() {
		return calle;
	}

	public void setCalle(StringProperty calle) {
		this.calle = calle;
	}

	public StringProperty getAltura() {
		return altura;
	}

	public void setAltura(StringProperty altura) {
		this.altura = altura;
	}

	public StringProperty getPiso() {
		return piso;
	}

	public void setPiso(StringProperty piso) {
		this.piso = piso;
	}

	public void setApellido(StringProperty apellido) {
		this.apellido = apellido;
	}

	

	public StringProperty getCelular() {
		return celular;
	}

	public void setCelular(String celular) {
		this.celular.setValue(celular);
	}

	public StringProperty getNroDepartamento() {
		return nroDepartamento;
	}

	public void setNroDepartamento(StringProperty nroDepartamento) {
		this.nroDepartamento = nroDepartamento;
	}

	

}
