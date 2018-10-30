package principal;

import ejercicios.Ejercicios;

public class Principal {

	public static void main(String[] args) {
		Ejercicios ejercicios = new Ejercicios();

		// Ejercicio 1
		float[] movimientos = { 200f, 53.2f, 30.5f, -86.5f, -22.6f };
		float saldoInicial = 300f;
		ejercicios.calcularSaldoFinal(saldoInicial, movimientos);

		// ejercicio 2
		int resultado = ejercicios.ejercicio2(10, 5, 15);
		
		System.out.println("FIN");

	}

}
