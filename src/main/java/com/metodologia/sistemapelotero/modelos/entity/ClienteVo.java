package com.metodologia.sistemapelotero.modelos.entity;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import com.metodologia.sistemapelotero.modelos.Direccion;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import javafx.fxml.FXML;

public class ClienteVo {

	private int id;

	private StringProperty dni;

	private StringProperty nombre;

	private StringProperty apellido;

	private StringProperty telefono;

	private StringProperty mail;

	private StringProperty otraInf;
	private StringProperty direccion;
	private StringProperty celular;

	public ClienteVo() {

	}

	public ClienteVo(String dni, String nombre, String apellido, String telefono, String mail, String otraInf,
			String celular,Direccion direccion) {

		this.dni = new SimpleStringProperty(dni);
		this.nombre = new SimpleStringProperty(nombre);
		this.apellido = new SimpleStringProperty(apellido);
		this.telefono = new SimpleStringProperty(telefono);
		this.mail = new SimpleStringProperty(mail);
		this.otraInf = new SimpleStringProperty(otraInf);
		this.celular = new SimpleStringProperty(celular);
		this.direccion = new SimpleStringProperty(DireccionToString(direccion).toString());
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

	public StringProperty getDireccion() {
		return direccion;
	}

	public void setDireccion(Direccion direccion) {
		StringBuilder sb = DireccionToString(direccion);
		this.direccion.set(sb.toString());
		;
	}

	private StringBuilder DireccionToString(Direccion direccion) {
		StringBuilder sb = new StringBuilder();
		sb.append("Calle: " + direccion.getCalle());
		if (!direccion.getAltura().equals(null)) {
			sb.append(" altura: " + direccion.getAltura());
		} else {
			sb.append(" altura: -");
		}
		sb.append(" piso: " + direccion.getPiso());

		if (!direccion.getNroDepartamento().equals(null)) {
			sb.append(" Nro de Dto: " + direccion.getNroDepartamento());
		} else {
			sb.append(" Nro de Dto: -");
		}
		return sb;
	}

	public StringProperty getCelular() {
		return celular;
	}

	public void setCelular(String celular) {
		this.celular.setValue(celular);
	}

	@Override
	public String toString() {
		return "ClienteVo [id=" + id + ", dni=" + dni + ", nombre=" + nombre + ", apellido=" + apellido + ", telefono="
				+ telefono + ", mail=" + mail + ", otraInf=" + otraInf + ", direccion=" + direccion + ", celular="
				+ celular + "]";
	}

}
