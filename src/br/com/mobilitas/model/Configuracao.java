package br.com.mobilitas.model;

public class Configuracao {
	
	private boolean alertaEmail;
	private String contatoEmail;
	private boolean anuncianteConfidencial;
	private String codigoInterno;
	private TrabalheConosco trabalheConosco;
	
	public boolean isAlertaEmail() {
		return alertaEmail;
	}
	public void setAlertaEmail(boolean alertaEmail) {
		this.alertaEmail = alertaEmail;
	}
	public String getContatoEmail() {
		return contatoEmail;
	}
	public void setContatoEmail(String contatoEmail) {
		this.contatoEmail = contatoEmail;
	}
	public boolean isAnuncianteConfidencial() {
		return anuncianteConfidencial;
	}
	public void setAnuncianteConfidencial(boolean anuncianteConfidencial) {
		this.anuncianteConfidencial = anuncianteConfidencial;
	}
	public String getCodigoInterno() {
		return codigoInterno;
	}
	public void setCodigoInterno(String codigoInterno) {
		this.codigoInterno = codigoInterno;
	}
	public TrabalheConosco getTrabalheConosco() {
		return trabalheConosco;
	}
	public void setTrabalheConosco(TrabalheConosco trabalheConosco) {
		this.trabalheConosco = trabalheConosco;
	}

	
	
}
