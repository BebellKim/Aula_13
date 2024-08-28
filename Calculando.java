package Aula_13_intefac;

public class Calculando implements Calculo{
	
	
	@Override
	public double Soma() {
		System.out.print("A soma equivale a: ");
		return 5+5;
	}
	@Override
	public double Sub() {
		System.out.print("A subtração equivale a: ");
		return 5-5;
	}
	
	@Override
	public double Mult() {
		System.out.print("A multiplição equivale a: ");
		return 5*5;
	}
	@Override
	public int Div( ) {
		System.out.print("A divisão equivale a: ");
		return  5/5;
	}
	@Override
	public int Exp() {
		System.out.print("O expoente equivale a: ");
		return 5*5*5;
	}

}