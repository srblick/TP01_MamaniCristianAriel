package ar.edu.unju.fi.ejercicio04;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int numero;
		System.out.print("Ingrese un numero entero: ");
		if(entrada.hasNextInt()) {
			numero = entrada.nextInt();
			if((numero >= 0) && (numero <= 10)) {
				int factorial = 1;
				int i = numero;
				while(i > 1) {
					factorial *= i--;
				}
				System.out.print("El factorial de "+numero+" es: " + factorial);
			}
			else {
				System.out.print("El numero ingresado esta fuera del rango [0, 10].");
			}
		}
		else {
			System.out.print("ERROR: No se ingreso un numero.");
		}

	}

}
