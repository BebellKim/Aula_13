package Aula_13_intefac;

public class Principal_Computador {

	public static void main(String[] args) {

		Gamer Computador1 = new Gamer();
		Home Computador2 = new Home();
		Work Computador3 =new Work();
		
        System.out.println("            Computador_1        ");
		Computador1.Ligar();
		Computador1.Reiniciar();
		Computador1.Desligar();
		Computador1.RecarregandoSistema();
		
		
        System.out.println("            Computador_2          ");
		Computador2.Ligar();
		Computador2.Reiniciar();
		Computador2.Desligar();
		Computador2.RecarregandoSistema();
		
		
		
        System.out.println("            Computador_3        ");
		Computador3.Ligar();
		Computador3.Reiniciar();
		Computador3.Desligar();
		Computador3.RecarregandoSistema();

	}

}
