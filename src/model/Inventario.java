package model;
import java.util.ArrayList;

public class Inventario {
    // Requisito: Estructura de datos (ArrayList)
    private ArrayList<Producto> listaProductos;

    public Inventario() {
        this.listaProductos = new ArrayList<>();
    }

    // Método funcional para agregar productos
    public void agregarProducto(Producto p) {
        listaProductos.add(p);
        System.out.println("Sistema: " + p.getNombre() + " agregado al inventario.");
    }

    // Método para buscar (Eficiencia)
    public Producto buscarPorCodigo(String codigo) {
        for (Producto p : listaProductos) {
            if (p.getCodigo().equals(codigo)) {
                return p;
            }
        }
        return null;
    }
}