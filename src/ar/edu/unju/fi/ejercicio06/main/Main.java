package ar.edu.unju.fi.ejercicio06.main;
import java.time.LocalDate;
import java.time.Period;
import ar.edu.unju.fi.ejercicio06.model.Persona;

public class Main {

	public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);

        // Creación de objeto utilizando el constructor por defecto
        System.out.println("Ingrese nombre:");
        String nombre1 = scanner.nextLine();
        System.out.println("Ingrese DNI:");
        int dni1 = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Ingrese fecha de nacimiento (AAAA-MM-DD):");
        LocalDate fechaNacimiento1 = LocalDate.parse(scanner.nextLine());
        System.out.println("Ingrese provincia:");
        String provincia1 = scanner.nextLine();
        Persona persona1 = new Persona();
        persona1.setDni(dni1);
        persona1.setNombre(nombre1);
        persona1.setFechaNacimiento(fechaNacimiento1);
        persona1.setProvincia(provincia1);
        persona1.mostrarDatos();

        // Creación de objeto utilizando el constructor parametrizado
        System.out.println("Ingrese nombre:");
        String nombre2 = scanner.nextLine();
        System.out.println("\nIngrese DNI:");
        int dni2 = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Ingrese fecha de nacimiento (AAAA-MM-DD):");
        LocalDate fechaNacimiento2 = LocalDate.parse(scanner.nextLine());
        System.out.println("Ingrese provincia:");
        String provincia2 = scanner.nextLine();
        Persona persona2 = new Persona(dni2, nombre2, fechaNacimiento2, provincia2);
        persona2.mostrarDatos();

        // Creación de objeto utilizando el constructor que inicializa dni, nombre y fecha de nacimiento
        System.out.println("Ingrese nombre:");
        String nombre3 = scanner.nextLine();
        System.out.println("\nIngrese DNI:");
        int dni3 = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Ingrese fecha de nacimiento (AAAA-MM-DD):");
        LocalDate fechaNacimiento3 = LocalDate.parse(scanner.nextLine());
        Persona persona3 = new Persona(dni3, nombre3, fechaNacimiento3);
        persona3.mostrarDatos();

        scanner.close();

	}

}
