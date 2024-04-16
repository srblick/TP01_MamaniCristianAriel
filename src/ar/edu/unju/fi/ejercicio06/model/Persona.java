package ar.edu.unju.fi.ejercicio06.model;
import java.time.LocalDate;
import java.time.Period;

public class Persona {
    private int dni;
    private String nombre;
    private LocalDate fechaNacimiento;
    private String provincia;

    // Constructor por defecto
    public Persona() {
    }

    // Constructor parametrizado
    public Persona(int dni, String nombre, LocalDate fechaNacimiento, String provincia) {
        this.dni = dni;
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
        this.provincia = provincia;
    }

    // Constructor que inicializa dni, nombre y fecha de nacimiento
    public Persona(int dni, String nombre, LocalDate fechaNacimiento) {
        this.dni = dni;
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
        this.provincia = "Jujuy";
    }

    // Métodos accesores
    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    // Método para calcular la edad
    public int calcularEdad() {
        LocalDate ahora = LocalDate.now();
        Period periodo = Period.between(this.fechaNacimiento, ahora);
        return periodo.getYears();
    }

    // Método para verificar si es mayor de edad
    public boolean esMayorDeEdad() {
        return calcularEdad() >= 18;
    }

    // Método para mostrar los datos de la persona
    public void mostrarDatos() {
        System.out.println("DNI: " + dni);
        System.out.println("Nombre: " + nombre);
        System.out.println("Fecha de nacimiento: " + fechaNacimiento);
        System.out.println("Provincia: " + provincia);
        System.out.println("Edad: " + calcularEdad());
        if (esMayorDeEdad()) {
            System.out.println("La persona es mayor de edad");
        } else {
            System.out.println("La persona no es mayor de edad");
        }
    }
}
