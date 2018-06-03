package br.com.mobilitas.model;

public class Contratante {

	private String nome;
	private int ramo;
	private String nacionalidade;
	private String porte;
	private String descricao;
	private boolean confidencial;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getRamo() {
		return ramo;
	}
	public void setRamo(int ramo) {
		this.ramo = ramo;
	}
	public String getNacionalidade() {
		return nacionalidade;
	}
	public void setNacionalidade(String nacionalidade) {
		this.nacionalidade = nacionalidade;
	}
	public String getPorte() {
		return porte;
	}
	public void setPorte(String porte) {
		this.porte = porte;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public boolean isConfidencial() {
		return confidencial;
	}
	public void setConfidencial(boolean confidencial) {
		this.confidencial = confidencial;
	}

	
	
}
