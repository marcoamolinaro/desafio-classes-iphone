package com.dio.iphone;

public class Iphone implements ReproduzirMusica, AparelhoTelefonico, NavegadorInternet{
	
	private String modeloString;
	private String numSerie;
	private String imei;
	
	public Iphone() {}
	
	public Iphone(String modeloString, String numSerie, String imei) {
		this.modeloString = modeloString;
		this.numSerie = numSerie;
		this.imei = imei;
	}

	public String getModeloString() {
		return modeloString;
	}

	public void setModeloString(String modeloString) {
		this.modeloString = modeloString;
	}

	public String getNumSerie() {
		return numSerie;
	}

	public void setNumSerie(String numSerie) {
		this.numSerie = numSerie;
	}

	public String getImei() {
		return imei;
	}

	public void setImei(String imei) {
		this.imei = imei;
	}

	@Override
	public void tocar() {
		System.out.println("Tocar M�sica!");
	}

	@Override
	public void pausar() {
		System.out.println("Pausar M�sica");
	}

	@Override
	public void selecionarMusica() {
		System.out.println("Selecionar M�sica");
	}

	@Override
	public void ligar() {
		System.out.println("Ligar Iphome");
	}

	@Override
	public void atender() {
		System.out.println("Atender Chamada");
	}

	@Override
	public void iniciarCorreioVoz() {
		System.out.println("Iniciar Correio de Voz");
	}

	@Override
	public void exibirPagina() {
		System.out.println("Exibir P�gina");
	}

	@Override
	public void adicionarNovaAba() {
		System.out.println("Adicionar P�gina");
	}

	@Override
	public void atualizarPagina() {
		System.out.println("Atualizar P�gina");
	}
	
	
}
