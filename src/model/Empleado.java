package model;

public class Empleado {
    private String nombre;
    private int edad;

    public Empleado() {}

    public Empleado(String nombre, int edad) {
        this.nombre = nombre;
        setEdad(edad);
    }

    public void setEdad(int edad) {
        if (edad >= 18) { // Validación de mayoría de edad
            this.edad = edad;
        } else if (edad < 0) {
            System.out.println("Error: No se puede registrar edad negativa.");
            this.edad = 0;
        } else {
            System.out.println("Aviso: El empleado es menor de edad.");
            this.edad = edad;
        }
    }

    public String getNombre() { return nombre; }
    public int getEdad() { return edad; }
}