package umg.progra3.Lombok;

public class MainApp {
    public static void main(String[] args) {
        Servis service = new Servis();
        service.inicializarDatos();

        // Probamos los métodos generados por Lombok
        System.out.println("=== Todos los productos ===");
        service.listarProductos().forEach(System.out::println);

        System.out.println("\n=== Buscar producto con ID 2 ===");
        lombok encontrado = service.buscarPorId(2L);
        System.out.println(encontrado);

        // Probamos el toString() generado por @Data
        System.out.println("\n=== Detalles del producto encontrado ===");
        System.out.println("Nombre: " + encontrado.getNombre()); // Getter generado
        System.out.println("Precio: $" + encontrado.getPrecio()); // Getter generado

        // Probamos el builder
        System.out.println("\n=== Crear nuevo producto ===");
        lombok nuevo = lombok.builder()
                .id(3L)
                .nombre("Teclado Mecánico")
                .categoria("Tecnología")
                .precio(75.99)
                .stock(20)
                .build();
        System.out.println(nuevo);
    }
}
