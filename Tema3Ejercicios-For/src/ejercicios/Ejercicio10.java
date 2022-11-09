package ejercicios;

import java.util.Scanner;

public class Ejercicio10 {

	public static void main(String[] args) {
		
		int numeroA;//Declaro la variable en la que guardare el numero A
		
		int numeroB;//Declaro la variable en la que guardare el numero B
		
		//Creo un Scanner, lo llamo dogma y lo importo
		Scanner dogma = new Scanner(System.in);
		
		//Solicito valor para variable numero A
		System.out.println("Introduzca un número entero (A): ");
		
		//Asigno valor a variable numero A mediante uso del Scanner
		numeroA = dogma.nextInt();
		
		//Solicito valor para variable numero B
		System.out.println("Introduzca un número entero (B) que debe ser mayor que A: ");
		
		//Asigno valor a variable numero B mediante uso del Scanner
		numeroB = dogma.nextInt();
		
		//Abro bucle, declaro e incializo la variable i dentro del bucle con un valor igual a el valor de variable numeroA
		
		//Establezo la condicion: variable i menor o igual a numeroB, 
		//mientras se cumpla se seguira ejecutando el bucle
										
		//Establezco el incremento variable i al que le sumare +1 en cada iteracion,
		//usare esta suma para modificar el valor de i en cada iteracion haciendo que eventualmente
		//la condicion del bucle no se cumpla y finalice el bucle
		for (int i=numeroA; i<=numeroB; i++) {
			
			//Imprimo mensaje por pantalla con valor de variable i
			System.out.println(i);
		}
		
		//Cierro Scanner
		dogma.close();

	}

}
