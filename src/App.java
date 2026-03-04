import java.util.Scanner; // sirve para que podamos leer los datos del teclado
import model.*;

public class App {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Inventario miTienda = new Inventario();

        // 1. aqui agregamos los productos de la tienda con su codigo precio y cantidad  que es lo que muestra el sistema
        miTienda.agregarProducto(new Producto("P01", "Arroz 1kg", 3500));
        miTienda.agregarProducto(new Producto("P02", "Leche 1L",4000));
        miTienda.agregarProducto(new Producto("P03", "aceite 1L",6500));

        System.out.println("======= SUPERMERCADO CESDE =======");

        // 2. Pedimos los datos del Cliente
        System.out.print("Ingrese el nombre del cliente: ");
        String nombreCliente = teclado.nextLine();
        Cliente clienteFiel = new Cliente("12345", nombreCliente,"3224568798");

        // 3. Registramos los Empleados 
        Empleado cajero = new Empleado("Andrea cardona", 25);

        // 4. Iniciamos la  Venta
        Venta nuevaVenta = new Venta(1001, clienteFiel, cajero);

        // 5. Agregamos productos
        String opcion = "";
        while (!opcion.equals("fin")) {
            System.out.print("Ingrese el CÓDIGO del producto a escanear (o escriba 'fin' para pagar): ");
            opcion = teclado.nextLine();

            if (!opcion.equals("fin")) {
                Producto prodEncontrado = miTienda.buscarPorCodigo(opcion);
                if (prodEncontrado != null) {
                    nuevaVenta.agregarAlCarrito(prodEncontrado, 1);
                    System.out.println("Agregado: " + prodEncontrado.getNombre());
                } else {
                    System.out.println("Error: Producto no encontrado.");
                }
            }
        }

        // 6. y este es el resultado final que mostramos en la consola y tambien hicimos un ciclo for para 
        // recorrer toda la lista de productos que el cliente agrego al carro para mostrarlos en la consola 
        //
        System.out.println("\n-------------------------------------------");
        System.out.println("Cliente: " + nuevaVenta.getCliente().getNombre());
        System.out.println("Atendido por: " + cajero.getNombre());
        System.out.println("PRODUCTOS COMPRADOS:");
        for (Carrito item : nuevaVenta.getListaItems()) {
            System.out.println("- " + item.getProducto().getNombre() + " (Cant: " + item.getCantidad() + ")");
        }
        System.out.println("TOTAL A PAGAR: $" + nuevaVenta.getTotalVenta());
        System.out.println("-------------------------------------------");
        
        teclado.close();
    }
}
