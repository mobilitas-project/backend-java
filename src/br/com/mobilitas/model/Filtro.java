package br.com.mobilitas.model;

import java.util.ArrayList;

public class Filtro {

	private String sexo;
	private Idade idade;
	private Localidade localidade;
	private ArrayList<String> deficienciasRestrita;
	
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	public Idade getIdade() {
		return idade;
	}
	public void setIdade(Idade idade) {
		this.idade = idade;
	}
	public Localidade getLocalidade() {
		return localidade;
	}
	public void setLocalidade(Localidade localidade) {
		this.localidade = localidade;
	}
	
	public ArrayList<String> getDeficienciasRestrita() {
		return deficienciasRestrita;
	}
	public void setDeficienciasRestrita(ArrayList<String> deficienciasRestrita) {
		this.deficienciasRestrita = deficienciasRestrita;
	}
}
