package interfaces;

public interface Telefone {
	default void ligar() {System.out.println("Fazendo ligação!");}
	default void atender() {System.out.println("Alô!");}
	default void correioDeVoz() {System.out.println("Você tem um novo recado.");}
}

//+ ligar(): void
//+ atender():void
//
//+ correioDeVoz():void