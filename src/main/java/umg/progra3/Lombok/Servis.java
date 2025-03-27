package umg.progra3.Lombok;

import java.util.ArrayList;
import java.util.List;

public class Servis {
    private final List<lombok> productos = new ArrayList<>();

    // Lombok nos permite crear fácilmente instancias con el builder
    public void inicializarDatos() {
        productos.add(lombok.builder()
                .id(1L)
                .nombre("Laptop HP")
                .categoria("Tecnología")
                .precio(1200.99)
                .stock(15)
                .build());

        productos.add(lombok.builder()
                .id(2L)
                .nombre("Mouse Inalámbrico")
                .categoria("Tecnología")
                .precio(25.50)
                .stock(30)
                .build());
    }

    public List<lombok> listarProductos() {
        return new ArrayList<>(productos);
    }

    public lombok buscarPorId(Long id) {
        return productos.stream()
                .filter(p -> p.getId().equals(id))
                .findFirst()
                .orElse(null);
    }
}
