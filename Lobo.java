package Aula_13_intefac;

public class Lobo implements Animal {
	
	@Override
	public void Dormir() {
		System.out.println("Dormindo;");
	}
	@Override
	public void Caminhar() {
		System.out.println("Caminhando;");
	}
	@Override
	public void Correr() {
		System.out.println("Correndo;");
	}
	@Override
	public void EmitirSom() {
		System.out.println("Uivandoo!");
	}

}
