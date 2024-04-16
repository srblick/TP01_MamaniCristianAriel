package ar.edu.unju.fi.ejercicio09.model;

public class Producto {
    private String nombre;
    private int codigo;
    private double precio;
    private int descuento;

    // Constructor por defecto
    public Producto() {
        // Inicialización de los atributos
    }

    // Métodos accesores
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getDescuento() {
        return descuento;
    }

    public void setDescuento(int descuento) {
    	if((descuento >= 0) && (descuento <= 50)){
            this.descuento = descuento;
    	}
    	else {
            this.descuento = 50;
    	}
    }

    // Método para calcular el descuento
    public double calcularDescuento() {
    	return precio * (1 - (descuento / 100.0));
    }
    
    public void mostrarProducto() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Código: " + codigo);
        System.out.println("Precio: " + precio);
        System.out.println("Descuento: " + descuento + "%");
        System.out.println("Precio con descuento: " + calcularDescuento());    	
    }
}
