package interfaces;

public interface Telefone {
	default void ligar() {System.out.println("Fazendo liga��o!");}
	default void atender() {System.out.println("Al�!");}
	default void correioDeVoz() {System.out.println("Voc� tem um novo recado.");}
}

//+ ligar(): void
//+ atender():void
//
//+ correioDeVoz():void