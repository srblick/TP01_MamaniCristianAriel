package ar.edu.unju.fi.ejercicio08.main;
import ar.edu.unju.fi.ejercicio08.model.CalculadoraEspecial;

public class Main {

	public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);

        // Solicitar al usuario que ingrese el valor de n
        System.out.println("Ingrese el valor de n:");
        int n = scanner.nextInt();

        // Crear objeto CalculadoraEspecial
        CalculadoraEspecial calculadora = new CalculadoraEspecial(n);

        // Invocar métodos y mostrar resultados
        System.out.println("La sumatoria es: " + calculadora.calcularSumatoria());
        System.out.println("La productoria es: " + calculadora.calcularProductoria());

        scanner.close();
	}

}
