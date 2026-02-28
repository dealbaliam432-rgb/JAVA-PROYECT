package model;

import java.util.ArrayList; // IMPORTANTE: Sin esto sale error en ArrayList

public class Venta {
    // ATRIBUTOS PRIVADOS (Encapsulamiento)
    private int idVenta;
    private Cliente cliente;
    private Empleado empleado;
    private ArrayList<Carrito> listaItems; // Colección en memoria
    private double totalVenta;

    // CONSTRUCTOR COMPLETO
    public Venta(int idVenta, Cliente cliente, Empleado empleado) {
        this.idVenta = idVenta;
        this.cliente = cliente;
        this.empleado = empleado;
        this.listaItems = new ArrayList<>();
        this.totalVenta = 0.0;
    }

    // MÉTODO PARA LA EFICIENCIA: Agrega productos y suma el total al instante
    public void agregarAlCarrito(Producto p, int cant) {
        Carrito nuevoItem = new Carrito(p, cant);
        this.listaItems.add(nuevoItem);
        
        // Sumamos al total usando el método del carrito
        this.totalVenta += nuevoItem.obtenerSubtotal();
    }

    // GETTERS (Para que se quiten las líneas naranjas y puedas usar los datos)
    public int getIdVenta() {
        return idVenta;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public Empleado getEmpleado() {
        return empleado;
    }

    public double getTotalVenta() {
        return totalVenta;
    }

    public ArrayList<Carrito> getListaItems() {
        return listaItems;
    }
}