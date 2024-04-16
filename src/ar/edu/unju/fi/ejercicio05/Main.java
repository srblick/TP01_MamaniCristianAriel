package ar.edu.unju.fi.ejercicio05;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int numero;
		System.out.print("Ingrese un numero entero en el rango [1,9]: ");
		if(entrada.hasNextInt()) {
			numero = entrada.nextInt();
			if((numero >= 1) && (numero <= 9)) {
				for(int i = 0; i <= 10; i++) {
					System.out.println(numero + " x " + i + " = " + numero * i);
				}
			}
			else {
				System.out.println("El numero ingresado esta fuera del rango [1, 9].");
			}
		}
		else {
			System.out.println("ERROR: No se ingreso un numero.");
		}
	}

}
