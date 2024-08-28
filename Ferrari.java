package Aula_13_intefac;

public class Ferrari implements Veiculo{
	
	@Override
	public void Ligar() {
		System.out.println("Ligando;");
	}
	
	@Override
	public void Desligar () {
		System.out.println("Desligando;");
	}
	
	@Override
	public void Manobrar () {
		System.out.println("Manobrando;");
	}
	
	@Override
	public void Engatar () {
		System.out.println("Engatando;");
	}
	@Override
	public void Acelerar () {
		System.out.println("Acelerar;");
	}
	@Override
	public void Frear () {
		System.out.println("Frear.");
	}
}
