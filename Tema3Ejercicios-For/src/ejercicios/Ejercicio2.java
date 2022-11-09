package ejercicios;

public class Ejercicio2 {

	public static void main(String[] args) {
		
		//Abro bucle, declaro e incializo la variable i dentro del bucle con un valor igual a 2
		
		//Establezo la condicion: variable i menor o igual a 200, 
		//mientras se cumpla se seguira ejecutando el bucle
		
		//Establezco el incremento variable i al que le sumare +2 en cada iteracion,
		//usare esta suma para modificar el valor de i en cada iteracion haciendo que eventualmente
		//la condicion del bucle no se cumpla y finalice el bucle
		for (int i=2; i<=200; i=i+2) {
			System.out.println(i);
		}

	}

}
