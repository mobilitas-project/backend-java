package br.com.mobilitas.model;

import java.util.ArrayList;

public class Estagio {

	private String periodo;
	private String finaisSemana;
	private ArrayList<String> ano;
	
	
	public String getPeriodo() {
		return periodo;
	}
	public void setPeriodo(String periodo) {
		this.periodo = periodo;
	}
	public String getFinaisSemana() {
		return finaisSemana;
	}
	public void setFinaisSemana(String finaisSemana) {
		this.finaisSemana = finaisSemana;
	}
	public ArrayList<String> getAno() {
		return ano;
	}
	public void setAno(ArrayList<String> ano) {
		this.ano = ano;
	}
	
}
