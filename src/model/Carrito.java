package model;

public class Carrito {
    private Producto producto;
    private int cantidad;

    public Carrito() {}

    public Carrito(Producto producto, int cantidad) {
        this.producto = producto;
        this.cantidad = cantidad;
    }

    // MÉTODO DE EFICIENCIA: Calcula el subtotal de este item automáticamente
    public double obtenerSubtotal() {
        return producto.getPrecio() * cantidad;
    }

    // Getters y Setters
    public Producto getProducto() { return producto; }
    public void setProducto(Producto producto) { this.producto = producto; }
    public int getCantidad() { return cantidad; }
    public void setCantidad(int cantidad) { this.cantidad = cantidad; }
}