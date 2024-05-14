package com.iphone;

public class Iphone implements NavegadorNaInternet {
	
	public void tocar() {
		System.out.println("Tocando Musica");
	}	
	public void pausar() {
			System.out.println("Musica pausada");
	}
	
	public void selecionarMusicar() {
			System.out.println("Escolheu uma música");
	}
	
	
	public void ligar() {
		System.out.println("Ligando");
	}
	
	public void atender() {
		System.out.println("Atendeu");
	}
	
	public void iniciarCorreioDeVoz() {
		System.out.println("Iniciou correio de voz");
	}
	
	
	public void exibirPagina() {
		System.out.println("Exibindo Pagina");
	}
	
	public void adicionarNovaAba() {
		System.out.println("Adionando nova aba");
	}
	
	public void atualizarPagina() {
		System.out.println("Atualizando Pagina");
	}
}
