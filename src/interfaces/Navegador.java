package interfaces;

public interface Navegador {
	default void adicionarAba() {System.out.println("nova aba");}
	default void atualizarPagina() {System.out.println("Pagina atualizada");}
	default void exibirAba() {System.out.println("Exibindo pagina");}
}

//adicionarAba(): void
//+ atualizarPagina():void
//
//+ exibirAba():void