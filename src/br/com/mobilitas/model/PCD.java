package br.com.mobilitas.model;

public class PCD {
	private String tipo;
	private String descricao;
	private String curso;
	private String instalacoesAdaptadas;
	private Opcao opcoes;
	
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public String getCurso() {
		return curso;
	}
	public void setCurso(String curso) {
		this.curso = curso;
	}
	public String getInstalacoesAdaptadas() {
		return instalacoesAdaptadas;
	}
	public void setInstalacoesAdaptadas(String instalacoesAdaptadas) {
		this.instalacoesAdaptadas = instalacoesAdaptadas;
	}
	public Opcao getOpcoes() {
		return opcoes;
	}
	public void setOpcoes(Opcao opcoes) {
		this.opcoes = opcoes;
	}
}
