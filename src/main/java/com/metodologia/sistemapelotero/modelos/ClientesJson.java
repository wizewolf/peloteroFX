package com.metodologia.sistemapelotero.modelos;

public class ClientesJson {
	
	
/*
 * 
 * "apellido": "string",
    "celular": "string",
    "cuil": "string",
    "direccion": {
      "altura": "string",
      "calle": "string",
      "id": 0,
      "nroDepartamento": "string",
      "piso": 0
    },
    "email": "string",
    "id": 0,
    "nombre": "string",
    "otraInformacion": "string",
    "telefono": "string"
 * 
 * */	
	private int id;
	private String apellido,celular;
	private Direccion direccion;
	private String cuil,email,nombre,otraInformacion,telefono;
	
	public ClientesJson(int id,String apellido, String celular, String cuil, String email, String nombre,
			String otraInformacion, String telefono, Direccion direccion) {
		this.setId(id);
		this.apellido = apellido;
		this.celular = celular;
		this.cuil = cuil;
		this.email = email;
		this.nombre = nombre;
		this.otraInformacion = otraInformacion;
		this.telefono = telefono;
		this.direccion = direccion;
	}
	public ClientesJson() {
		// TODO Auto-generated constructor stub
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public String getCelular() {
		return celular;
	}
	public void setCelular(String celular) {
		this.celular = celular;
	}
	public String getCuil() {
		return cuil;
	}
	public void setCuil(String cuil) {
		this.cuil = cuil;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getnombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getOtraInformacion() {
		return otraInformacion;
	}
	public void setOtraInformacion(String otraInformacion) {
		this.otraInformacion = otraInformacion;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	public Direccion getDireccion() {
		return direccion;
	}
	public void setDireccion(Direccion direccion) {
		this.direccion = direccion;
	}
	@Override
	public String toString() {
		return "ClientesJson [apellido=" + apellido + ", celular=" + celular + ", cuil=" + cuil + ", email=" + email
				+ ", nombre=" + nombre + ", otraInformacion=" + otraInformacion + ", telefono=" + telefono
				+ ", direccion=" + direccion + "]";
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
}
