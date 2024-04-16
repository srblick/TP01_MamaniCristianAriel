package ar.edu.unju.fi.ejercicio03;

import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		int numero;
		System.out.print("Ingrese un numero entero: ");
		if(entrada.hasNextInt()) {
			numero = entrada.nextInt();
			if((numero % 2) == 0) {
				System.out.print("El triple es: " + numero * 3);
			}
			else {
				System.out.print("El doble es: " + numero * 2);
			}
		}
		else {
			System.out.print("ERROR: No se ingreso un numero.");
		}

	}

}
