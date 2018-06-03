package br.com.mobilitas.model;

import java.util.ArrayList;

public class Vaga {

	private String id;
	private String perfil;
	private String dataCadastro;
	private String titulo;
	private String atividades;
	private ArrayList<String> regimeContratacao;
	private ArrayList<String> beneficios;
	private String informacoesAdicionais;
	private String horario;
	private String tipo;
	private String status;
	private Estagio estagio;
	private Salario salario;
	private ArrayList<Recrutador> recrutadores; 
	private Localidade localidade;
	private Contratante contratante;
    private Requisito requisitos;
    private ArrayList<Questionario> questionario;
    private PCD pcd;
    private Filtro filtros;
    private Configuracao configuracoes;
    private Link _links;
       
	
    
	public ArrayList<Questionario> getQuestionario() {
		return questionario;
	}
	public void setQuestionario(ArrayList<Questionario> questionario) {
		this.questionario = questionario;
	}
	public PCD getPcd() {
		return pcd;
	}
	public void setPcd(PCD pcd) {
		this.pcd = pcd;
	}
	public Filtro getFiltros() {
		return filtros;
	}
	public void setFiltros(Filtro filtros) {
		this.filtros = filtros;
	}
	public Configuracao getConfiguracoes() {
		return configuracoes;
	}
	public void setConfiguracoes(Configuracao configuracoes) {
		this.configuracoes = configuracoes;
	}
	public Link get_links() {
		return _links;
	}
	public void set_links(Link _links) {
		this._links = _links;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPerfil() {
		return perfil;
	}
	public void setPerfil(String perfil) {
		this.perfil = perfil;
	}
	public String getDataCadastro() {
		return dataCadastro;
	}
	public void setDataCadastro(String dataCadastro) {
		this.dataCadastro = dataCadastro;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getAtividades() {
		return atividades;
	}
	public void setAtividades(String atividades) {
		this.atividades = atividades;
	}
	public ArrayList<String> getRegimeContratacao() {
		return regimeContratacao;
	}
	public void setRegimeContratacao(ArrayList<String> regimeContratacao) {
		this.regimeContratacao = regimeContratacao;
	}
	public ArrayList<String> getBeneficios() {
		return beneficios;
	}
	public void setBeneficios(ArrayList<String> beneficios) {
		this.beneficios = beneficios;
	}
	public String getInformacoesAdicionais() {
		return informacoesAdicionais;
	}
	public void setInformacoesAdicionais(String informacoesAdicionais) {
		this.informacoesAdicionais = informacoesAdicionais;
	}
	public String getHorario() {
		return horario;
	}
	public void setHorario(String horario) {
		this.horario = horario;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

	public Estagio getEstagio() {
		return estagio;
	}
	public void setEstagio(Estagio estagio) {
		this.estagio = estagio;
	}
	public Salario getSalario() {
		return salario;
	}
	public void setSalario(Salario salario) {
		this.salario = salario;
	}
	public ArrayList<Recrutador> getRecrutadores() {
		return recrutadores;
	}
	public void setRecrutadores(ArrayList<Recrutador> recrutadores) {
		this.recrutadores = recrutadores;
	}
	public Localidade getLocalidade() {
		return localidade;
	}
	public void setLocalidade(Localidade localidade) {
		this.localidade = localidade;
	}
	public Contratante getContratante() {
		return contratante;
	}
	public void setContratante(Contratante contratante) {
		this.contratante = contratante;
	}
	public Requisito getRequisitos() {
		return requisitos;
	}
	public void setRequisitos(Requisito requisitos) {
		this.requisitos = requisitos;
	}   
}
