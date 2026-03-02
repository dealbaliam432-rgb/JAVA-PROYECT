package model;
import java.util.ArrayList;

public class Inventario {
    // es un Requisito lo cual es la  Estructura de datos es decir el ArrayList
    private ArrayList<Producto> listaProductos;

    public Inventario() {
        this.listaProductos = new ArrayList<>();
    }

    // sirve  para agregar productos
    public void agregarProducto(Producto p) {
        listaProductos.add(p);
        System.out.println("Sistema: " + p.getNombre() + " agregado al inventario.");
    }

    // sirve para ser eficientes
    public Producto buscarPorCodigo(String codigo) {
        for (Producto p : listaProductos) {
            if (p.getCodigo().equals(codigo)) {
                return p;
            }
        }
        return null;
    }
}
