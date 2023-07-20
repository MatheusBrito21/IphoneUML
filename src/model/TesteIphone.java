package model;

public class TesteIphone {
	public static void main(String[] args) {
		
		Iphone iphone = new Iphone();
		
		iphone.tocar(iphone.selecionarMusica("Master of Puppets - Metallica"));
		
		iphone.atender();
		iphone.correioDeVoz();
		
		
	}
}
