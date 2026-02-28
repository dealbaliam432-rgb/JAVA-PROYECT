import java.util.Scanner; // Importante para leer datos del teclado
import model.*;

public class App {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Inventario miTienda = new Inventario();

        // 1. Cargar algunos productos al inventario inicial (para poder buscarlos)
        miTienda.agregarProducto(new Producto("P01", "Arroz 1kg", 3500.0, 10));
        miTienda.agregarProducto(new Producto("P02", "Leche 1L",4000.0, 10));
        miTienda.agregarProducto(new Producto("P03", "aceite 1L",6500.0, 10));

        System.out.println("======= SUPERMERCADO CESDE =======");

        // 2. Pedir datos del Cliente
        System.out.print("Ingrese el nombre del cliente: ");
        String nombreCliente = teclado.nextLine();
        Cliente clienteFiel = new Cliente("12345", nombreCliente,"3224568798");

        // 3. Registrar Empleado (puedes dejarlo fijo o pedirlo también)
        Empleado cajero = new Empleado("Andrea cardona", 25);

        // 4. Iniciar Venta
        Venta nuevaVenta = new Venta(1001, clienteFiel, cajero);

        // 5. Agregar productos interactivamente
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

        // 6. Resultado Final
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