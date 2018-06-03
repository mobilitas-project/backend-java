package br.com.mobilitas.model;

import java.util.ArrayList;

public class Localidade {

	private ArrayList<Local> locais;
	private String tipo;
	public ArrayList<Local> getLocais() {
		return locais;
	}
	public void setLocais(ArrayList<Local> locais) {
		this.locais = locais;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
}
