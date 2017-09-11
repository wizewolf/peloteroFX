package com.metodologia.sistemapelotero.modelos;

public class Direccion {
	private String calle;

	private String altura;

	private String nroDepartamento;

	private int piso;

	public String getCalle() {
		return calle;
	}

	public void setCalle(String calle) {
		this.calle = calle;
	}

	public String getAltura() {
		return altura;
	}

	public void setAltura(String altura) {
		this.altura = altura;
	}

	public String getNroDepartamento() {
		return nroDepartamento;
	}

	public void setNroDepartamento(String nroDepartamento) {
		this.nroDepartamento = nroDepartamento;
	}

	public int getPiso() {
		return piso;
	}

	public void setPiso(int piso) {
		this.piso = piso;
	}

	@Override
	public String toString() {
		return "Direccion [calle=" + calle + ", altura=" + altura + ", nroDepartamento=" + nroDepartamento + ", piso="
				+ piso + "]";
	}
	
}
