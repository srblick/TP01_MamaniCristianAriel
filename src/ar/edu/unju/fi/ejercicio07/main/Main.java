package ar.edu.unju.fi.ejercicio07.main;
import ar.edu.unju.fi.ejercicio07.model.Empleado;


public class Main {

	public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);

        // Solicitar al usuario que ingrese los datos para un nuevo empleado
        System.out.println("Ingrese nombre del empleado:");
        String nombre = scanner.nextLine();
        System.out.println("Ingrese legajo del empleado:");
        int legajo = scanner.nextInt();
        System.out.println("Ingrese salario del empleado:");
        double salario = scanner.nextDouble();

        // Crear objeto Empleado utilizando el constructor parametrizado
        Empleado empleado = new Empleado(nombre, legajo, salario);

        // Mostrar datos del empleado antes del aumento
        System.out.println("\nDatos del empleado antes del aumento:");
        empleado.mostrarDatos();

        // Dar un aumento al salario del empleado
        empleado.darAumento();

        // Mostrar datos del empleado después del aumento
        System.out.println("\nDatos del empleado después del aumento:");
        empleado.mostrarDatos();

        scanner.close();
	}

}
