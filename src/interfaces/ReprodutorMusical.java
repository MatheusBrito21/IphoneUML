package interfaces;

public interface ReprodutorMusical {
	default void tocar(String musica) {System.out.println("Tocando " + musica);}
	default String selecionarMusica(String musica) {return musica;}
	default void pausar() {System.out.println("Musica pausada!");}
}

//+ tocar(string): void
//+ pausar(string):void
//
//+ selecionarMusica(string):string