package ejercicios;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		
		float numeroIntroducido=0;//Declaro la variable, la inicializo con valor 0 para poder usarla en el bucle 
		//y guardare en ella el valor del numero introducido por el usuario mediante teclado
		
		float sumaNumeros=0;//Declaro la variable, la inicializo con valor 0 para poder usarla en el bucle 
		//y guardare en ella el valorde la suma total de los numeros introducidos por el usuario

		//Creo un Scanner, lo llamo dogma y lo importo
		Scanner dogma = new Scanner(System.in);
		
		//Abro bucle, declaro e incializo la variable i dentro del bucle con un valor igual a 0
		
		//Establezo la condicion: variable i menor a 10, 
		//mientras se cumpla se seguira ejecutando el bucle
						
		//Establezco el incremento variable i al que le sumare +1 en cada iteracion,
		//usare esta suma para modificar el valor de i en cada iteracion haciendo que eventualmente
		//la condicion del bucle no se cumpla y finalice el bucle
		for (float i=0; i<10; i++) {
			
			//Solicito al usuario un numero por pantalla
			System.out.print("Introduzca un numero : ");
			
			//Asigno el valor introducido por el usuario mediante teclado a variable numeroIntroducido
			numeroIntroducido = dogma.nextFloat();
			
			//Doy valor a variable sumaNumeros sumandole el valor de variable numeroIntroducido
			sumaNumeros += numeroIntroducido;
		}

		//Muestro mensaje por pantalla mostrando la media al dividir variable sumaNumeros entre 10
		System.out.print("La media es: " + (sumaNumeros/10));
		
		//Cierro Scanner
		dogma.close();
	}

}
