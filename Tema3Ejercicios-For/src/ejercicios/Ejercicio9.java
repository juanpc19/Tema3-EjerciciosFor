package ejercicios;

import java.util.Scanner;

public class Ejercicio9 {

	public static void main(String[] args) {

		
		int numeroIntroducido;//Declaro variable en la que guardare el numero introducido por el usuario

		
		boolean esPrimo = true;//Declaro variable con la que determino si el número es primo o no

		//Creo un Scanner, lo llamo dogma y lo importo
		Scanner dogma = new Scanner(System.in);

		// Pido un número entero positivo al usuario por pantalla
		System.out.println("Introduzca un entero positivo:");
		
		//Doy valor a variable numeroIntroducido mediante uso del Scanner
		numeroIntroducido = dogma.nextInt();

		// Establezco condicion numeroIntroducido mayor que 0 (el número introducido es positivo)
		if (numeroIntroducido > 0) {
			
			// Recorremos los números desde 2 hasta número-1
			for (int i = 2; i < numeroIntroducido; i++) {
				// Si el número es divisible por i deja de ser primo
				if (numeroIntroducido % i == 0) {
					esPrimo = false;
					//En cuyo caso salgo del bucle on un break
					break;
				}
			}
			
			//Creo operador ternario con condicion variable esPrime y numeroIntroducido distinto a 1
			//que me devolvera mensaje: Es primo si Variable esPrimo=true
			//o mensaje: No es primo si Variable esPrimo=false
			System.out.println((esPrimo && numeroIntroducido != 1) ? "Es primo" : "No es primo");

			//De no cumplirse lo anterior imprimo mensaje por pantala diciendole al usuario
			//que no ha introducido un numero entero positivo
		} else {
			System.out.println("No ha introducido un entero positivo");
		}

		//Cierro Scanner
		dogma.close();
		


	}

}
