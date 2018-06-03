package br.com.mobilitas.model;

import java.util.ArrayList;

public class Requisito {
	private String experiencias;
	private String escolaridade;
	private String conhecimentos;
	private ArrayList<Idioma> idiomas;
	private String estagio;
	public String getExperiencias() {
		return experiencias;
	}
	public void setExperiencias(String experiencias) {
		this.experiencias = experiencias;
	}
	public String getEscolaridade() {
		return escolaridade;
	}
	public void setEscolaridade(String escolaridade) {
		this.escolaridade = escolaridade;
	}
	public String getConhecimentos() {
		return conhecimentos;
	}
	public void setConhecimentos(String conhecimentos) {
		this.conhecimentos = conhecimentos;
	}
	public ArrayList<Idioma> getIdiomas() {
		return idiomas;
	}
	public void setIdiomas(ArrayList<Idioma> idiomas) {
		this.idiomas = idiomas;
	}
	public String getEstagio() {
		return estagio;
	}
	public void setEstagio(String estagio) {
		this.estagio = estagio;
	}
}
