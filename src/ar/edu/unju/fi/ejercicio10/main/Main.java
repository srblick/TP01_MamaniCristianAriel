package ar.edu.unju.fi.ejercicio10.main;
import java.util.Scanner;
import ar.edu.unju.fi.ejercicio10.model.Pizza;

public class Main {

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario que ingrese los datos para cada pizza
        for (int i = 0; i < 3; i++) {
            Pizza pizza = new Pizza();
            System.out.println("\nIngrese los datos de la pizza " + (i + 1) + ":");
            System.out.print("Diámetro (20, 30, 40): ");
            int diametro = scanner.nextInt();
            if (diametro != 20 && diametro != 30 && diametro != 40) {
                System.out.println("Diámetro no válido. Intente nuevamente.");
                i--; // Retroceder para ingresar datos nuevamente para esta pizza
                continue;
            }
            pizza.setDiametro(diametro);
            System.out.print("¿Lleva ingredientes especiales? (true/false): ");
            boolean ingredientesEspeciales = scanner.nextBoolean();
            scanner.nextLine(); // Limpiar el buffer de entrada

            pizza.setIngredientesEspeciales(ingredientesEspeciales);
            pizza.calcularPrecio();
            pizza.calcularArea();

            // Mostrar los datos de la pizza
            System.out.println("\n*** Pizza " + (i+1) + " **");
            System.out.println("Diámetro = " + pizza.getDiametro());
            System.out.println("Ingredientes especiales = " + pizza.isIngredientesEspeciales());
            System.out.println("Precio Pizza = $" + pizza.getPrecio());
            System.out.println("Área de la pizza = " + pizza.getArea());
        }
	}

}
