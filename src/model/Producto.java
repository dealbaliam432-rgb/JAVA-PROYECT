package model;

public class Producto {
    // 1. Atributos Privados (Encapsulamiento)
    private String codigo;
    private String nombre;
    private double precio;
    private int stock;

    // 2. Constructor Vacío
    public Producto() {}

    // 3. Constructor Completo
    public Producto(String codigo, String nombre, double precio, int stock) {
        this.codigo = codigo;
        this.nombre = nombre;
        setPrecio(precio); // Usamos el setter para validar
        setStock(stock);
    }

    // 4. Setters con validaciones (Lo que pidió el profe)
    public void setPrecio(double precio) {
        if (precio >= 0) {
            this.precio = precio;
        } else {
            System.out.println("Error: El precio no puede ser negativo.");
        }
    }

    public void setStock(int stock) {
        if (stock >= 0) {
            this.stock = stock;
        } else {
            System.out.println("Error: El stock no puede ser negativo.");
        }
    }

    // Getters
    public String getNombre() { return nombre; }
    public String getCodigo() { return codigo; }
    public double getPrecio() { return precio; }
    public int getStock() { return stock; }
}