package ejercicios;

import java.util.Random;

public class Ejercicios {

	public float calcularSaldoFinal(float saldoInicial, float[] movimientos) {

		float saldoFinal = saldoInicial;
		for (int i = 0; i < movimientos.length; i++)

			saldoFinal += movimientos[i];

		// System.out.println((i+".- "+saldoFinal+"+"+movimientos[i]+"= "+(saldoFinal +=
		// movimientos[i]))+", ");

		return saldoFinal;
	}

	public int ejercicio2(int n, int inferior, int superior) {
		int acumulado = 0;
		Random rnd = new Random();

		for (int i = 0; i < n; i++)

			acumulado += inferior + rnd.nextInt(superior - inferior + 1); // Números entre inferior y superior.
		System.out.println("El total de números es: "+n+","+" La suma es: "+acumulado+","+" La media es: "+ acumulado/n);
		return (acumulado / n);
	}

}
