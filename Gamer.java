package Aula_13_intefac;

public class Gamer implements Computador {
	
	@Override
	public void Ligar() {
		System.out.println("Ligado");
	}
	
	@Override
	public void Reiniciar () {
		System.out.println("Reiniciando");
	}
	@Override
	public void Desligar() {
		System.out.println("Desligado");
	}
	@Override
	public void RecarregandoSistema() {
		System.out.println("Recaregando Sistema");
	}

}
