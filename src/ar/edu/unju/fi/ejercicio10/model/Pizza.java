package ar.edu.unju.fi.ejercicio10.model;

public class Pizza {
    private int diametro;
    private double precio;
    private double area;
    private boolean ingredientesEspeciales;
    private final int ADICIONAL_ESPECIALES_20 = 500;
    private final int ADICIONAL_ESPECIALES_30 = 750;
    private final int ADICIONAL_ESPECIALES_40 = 1000;

    // Constructor por defecto
    public Pizza() {
        // Inicialización de los atributos
    }

    // Métodos accesores
    public int getDiametro() {
        return diametro;
    }

    public void setDiametro(int diametro) {
        this.diametro = diametro;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public boolean isIngredientesEspeciales() {
        return ingredientesEspeciales;
    }

    public void setIngredientesEspeciales(boolean ingredientesEspeciales) {
        this.ingredientesEspeciales = ingredientesEspeciales;
    }

    // Método para calcular el precio de la pizza
    public void calcularPrecio() {
        switch (diametro) {
            case 20:
                if (ingredientesEspeciales) {
                    precio = 4500 + ADICIONAL_ESPECIALES_20;
                } else {
                    precio = 4500;
                }
                break;
            case 30:
                if (ingredientesEspeciales) {
                    precio = 4800 + ADICIONAL_ESPECIALES_30;
                } else {
                    precio = 4800;
                }
                break;
            case 40:
                if (ingredientesEspeciales) {
                    precio = 5500 + ADICIONAL_ESPECIALES_40;
                } else {
                    precio = 5500;
                }
                break;
            default:
                System.out.println("Diámetro no válido.");
        }
    }

    // Método para calcular el área de la pizza
    public void calcularArea() {
        area = Math.PI * Math.pow(diametro / 2.0, 2);
    }}
