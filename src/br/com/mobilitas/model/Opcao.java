package br.com.mobilitas.model;

public class Opcao {

	private boolean acompanhante;
	private boolean braille;
	private boolean leituraLabial;
	private boolean libras;
	private boolean transporteColetivo;
	private boolean veiculoAdaptado;
	public boolean isAcompanhante() {
		return acompanhante;
	}
	public void setAcompanhante(boolean acompanhante) {
		this.acompanhante = acompanhante;
	}
	public boolean isBraille() {
		return braille;
	}
	public void setBraille(boolean braille) {
		this.braille = braille;
	}
	public boolean isLeituraLabial() {
		return leituraLabial;
	}
	public void setLeituraLabial(boolean leituraLabial) {
		this.leituraLabial = leituraLabial;
	}
	public boolean isLibras() {
		return libras;
	}
	public void setLibras(boolean libras) {
		this.libras = libras;
	}
	public boolean isTransporteColetivo() {
		return transporteColetivo;
	}
	public void setTransporteColetivo(boolean transporteColetivo) {
		this.transporteColetivo = transporteColetivo;
	}
	public boolean isVeiculoAdaptado() {
		return veiculoAdaptado;
	}
	public void setVeiculoAdaptado(boolean veiculoAdaptado) {
		this.veiculoAdaptado = veiculoAdaptado;
	}
}
