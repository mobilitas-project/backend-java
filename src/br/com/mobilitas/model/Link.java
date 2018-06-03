package br.com.mobilitas.model;

public class Link {

	private Href self;
	private Href first;
	private Href last;
	private Href vizualizacaoCatho;
	
	public Href getVizualizacaoCatho() {
		return vizualizacaoCatho;
	}
	public void setVizualizacaoCatho(Href vizualizacaoCatho) {
		this.vizualizacaoCatho = vizualizacaoCatho;
	}
	public Href getSelf() {
		return self;
	}
	public void setSelf(Href self) {
		this.self = self;
	}
	public Href getFirst() {
		return first;
	}
	public void setFirst(Href first) {
		this.first = first;
	}
	public Href getLast() {
		return last;
	}
	public void setLast(Href last) {
		this.last = last;
	}
	
	
	
}
