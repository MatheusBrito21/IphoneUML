package model;

import interfaces.Navegador;
import interfaces.ReprodutorMusical;
import interfaces.Telefone;

public class Iphone implements ReprodutorMusical, Telefone, Navegador {
	public String nome;
	
	public Iphone() {
	}
	
	public Iphone(String nome) {
		this.nome = nome;
	}
}
