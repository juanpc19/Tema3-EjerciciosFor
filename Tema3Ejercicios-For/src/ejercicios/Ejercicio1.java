package ejercicios;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {

		int numeroIntroducido;//Declaro la variable en la que guardare el numero introducido por el usuario
		
		//Creo un Scanner, lo llamo dogma y lo importo
		Scanner dogma = new Scanner(System.in);
		
		//Solicito al usuario el numero hasta el que quiere contar
		System.out.print("Introduzca el numero hasta el que quiere contar: ");
		
		//Asigno su valor a la variable numeroIntroducido mediante uso del Scanner
		numeroIntroducido = dogma.nextInt();
		
		//Abro bucle, declaro e incializo la variable i dentro del bucle con un valor igual a 1
		
		//Establezo la condicion: variable i menor o igual a numeroIntroducido, 
		//mientras se cumpla se seguira ejecutando el bucle
		
		//Establezco el incremento variable i al que le sumare +1 en cada iteracion,
		//usare esta suma para modificar el valor de i en cada iteracion haciendo que eventualmente
		//la condicion del bucle no se cumpla y finalice el bucle
		for (int i=1; i<=numeroIntroducido; i++) {
			
			//Creo bloque de instrucciones, que en este caso imprimira un mensaje por pantalla
			//mostrando el valor de i en cada iteracion del bucle lo cual usaremos como el numero a contar
			System.out.println("Numero contado por pantalla: " + i);	
		}
		
		//Cierro Scanner
		dogma.close();

	}

}
