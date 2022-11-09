package ejercicios;

import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) {


		int numeroIntroducido;//Declaro la variable en la que guardare el numero introducido
		//por el usuario por teclado
		
		int factorial=1;//Declaro la variable, la inicializo con valor 1 para poder usarla en el bucle 
		//y guardare en ella el valor de cada multiplicacion y finalmente el valor final del factorial del numero introducido

		//Creo un Scanner, lo llamo dogma y lo importo
		Scanner dogma = new Scanner(System.in);
		
		//Solicito al usuario el numero del que quiere el factorial
		System.out.print("Introduzca un numero : ");
		
		//Asigno el valor introducido por el usuario mediante teclado a variable numeroIntroducido
		numeroIntroducido = dogma.nextInt();
		
		//Abro bucle, declaro e incializo la variable i dentro del bucle con un valor igual a 1
		
		//Establezo la condicion: variable i menor o igual a numeroIntroducido, 
		//mientras se cumpla se seguira ejecutando el bucle
								
		//Establezco el incremento variable i al que le sumare +1 en cada iteracion,
		//usare esta suma para modificar el valor de i en cada iteracion haciendo que eventualmente
		//la condicion del bucle no se cumpla y finalice el bucle
		for (int i=1; i<=numeroIntroducido; i++) {
			
			//Doy valor a variable factorial igual a factorial multiplicado por variable i
			factorial = factorial*i;
		}

		//Al finalizar el bucle muestro por pantalla mensaje con valor final de factorial
		System.out.print("El factorial del numero introducido es: " + factorial);
		
		//Cierro Scanner
		dogma.close();
	}

}
