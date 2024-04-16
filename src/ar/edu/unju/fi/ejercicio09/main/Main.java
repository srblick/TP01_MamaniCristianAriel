package ar.edu.unju.fi.ejercicio09.main;
import java.util.Scanner;
import ar.edu.unju.fi.ejercicio09.model.Producto;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        // Crear un array para almacenar los productos
        Producto[] productos = new Producto[3];

        // Solicitar al usuario que ingrese los datos para cada producto
        for (int i = 0; i < productos.length; i++) {
            System.out.println("Ingrese los datos del producto " + (i + 1) + ":");
            System.out.print("Nombre: ");
            String nombre = scanner.nextLine();
            System.out.print("Código: ");
            int codigo = scanner.nextInt();
            System.out.print("Precio: ");
            double precio = scanner.nextDouble();
            System.out.print("Descuento (%): ");
            int descuento = scanner.nextInt();
            scanner.nextLine(); // Limpiar el buffer de entrada

            // Crear el objeto Producto con los datos ingresados y almacenarlo en el array
            productos[i] = new Producto();
            productos[i].setNombre(nombre);
            productos[i].setCodigo(codigo);
            productos[i].setPrecio(precio);
            productos[i].setDescuento(descuento);
        }

        // Mostrar los datos de cada producto y el precio con descuento
        for (int i = 0; i < productos.length; i++) {
            System.out.println("\nDatos del producto " + (i + 1) + ":");
            productos[i].mostrarProducto();
        }

        scanner.close();

	}

}
