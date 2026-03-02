package model;

import java.util.ArrayList; // sin importar sale error en la arrailis

public class Venta {
    // atributos privados
    private int idVenta;
    private Cliente cliente;
    private Empleado empleado;
    private ArrayList<Carrito> listaItems; // Colección en memoria
    private double totalVenta;

    // constructores completos
    public Venta(int idVenta, Cliente cliente, Empleado empleado) {
        this.idVenta = idVenta;
        this.cliente = cliente;
        this.empleado = empleado;
        this.listaItems = new ArrayList<>();
        this.totalVenta = 0.0;
    }

    //  Agregamos  productos y suma el total 
    public void agregarAlCarrito(Producto p, int cant) {
        Carrito nuevoItem = new Carrito(p, cant);
        this.listaItems.add(nuevoItem);
        
        // Sumamos al total usando el método del carrito
        this.totalVenta += nuevoItem.obtenerSubtotal();
    }

    // geter para quitar lineas naranjas y que podamos ver los datos
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
