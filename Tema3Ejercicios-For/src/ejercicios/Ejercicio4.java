package ejercicios;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {

		int numeroIntroducido;//Declaro la variable en la que guardare el numero introducido
		//por el usuario por teclado hasta el que quiere contar los multiplos de 3
		
		//Creo un Scanner, lo llamo dogma y lo importo
		Scanner dogma = new Scanner(System.in);
		
		//Solicito al usuario el numero hasta el que quiere contar los multiplos de 3
		System.out.println("Introduzca el numero hasta el que quiere contar sus multiplos de 3: ");
		
		//Asigno el valor introducido por el usuario mediante teclado a variable numeroIntroducido
		numeroIntroducido = dogma.nextInt();
		
		//Abro bucle, declaro e incializo la variable i dentro del bucle con un valor igual a 0
		
		//Establezo la condicion: variable i menor o igual a numeroIntroducido, 
		//mientras se cumpla se seguira ejecutando el bucle
				
		//Establezco el incremento variable i al que le sumare +3 en cada iteracion,
		//usare esta suma para modificar el valor de i en cada iteracion haciendo que eventualmente
		//la condicion del bucle no se cumpla y finalice el bucle
		for (int i=0; i<=numeroIntroducido; i=i+3) {
			
			//imprimo por pantalla el nuevo valor de variable i
			System.out.print(i); 
		}
		
		//Cierro Scanner
		dogma.close();
		
	}

}
