package com.dio.iphone.application;

import com.dio.iphone.Iphone;

public class ApplicationIphone {
	public static void main(String args[]) {
		Iphone iphone = new Iphone("iPhone 14", "KLJ01", "IPA08J");
		
		System.out.println("REPRODUTOR DE MÚSICA");
		iphone.tocar();
		iphone.pausar();
		iphone.selecionarMusica();
		
		System.out.println("\nAPARELHO TELEFONICO");
		iphone.ligar();
		iphone.atender();
		iphone.iniciarCorreioVoz();
		
		System.out.println("\nNAVEGADOR INTERNET");
		iphone.exibirPagina();
		iphone.adicionarNovaAba();
		iphone.atualizarPagina();
		
		
	}
}
