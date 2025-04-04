package umg.progra3.EjerciciosTree;

import java.time.LocalDateTime;
import java.util.Iterator;
import java.util.TreeSet;

public class GestorEventos {
    private TreeSet<Evento> eventos;

    public GestorEventos() {
        this.eventos = new TreeSet<>();
    }

    // Agrega un nuevo evento
    public void agregarEvento(Evento evento) {
        eventos.add(evento);
    }

    // Muestra todos los eventos en orden cronológico
    public void mostrarEventos() {
        System.out.println("Lista de eventos:");
        int i = 1;
        for (Evento evento : eventos) {
            System.out.println(i++ + ". " + evento);
        }
    }

    // Obtiene el próximo evento (el más cercano en el tiempo)
    public Evento obtenerProximoEvento() {
        return eventos.first();  // TreeSet ordena ascendentemente
    }

    // Elimina eventos pasados (fecha anterior a ahora)
    public void eliminarEventosPasados() {
        LocalDateTime ahora = LocalDateTime.now();
        Iterator<Evento> it = eventos.iterator();
        while (it.hasNext()) {
            Evento evento = it.next();
            if (evento.getFecha().isBefore(ahora)) {
                it.remove();
            }
        }
    }

    // Método para pruebas
    public static void main(String[] args) {
        GestorEventos gestor = new GestorEventos();

        // Agregar eventos (ejemplo)
        gestor.agregarEvento(new Evento(
                LocalDateTime.of(2025, 5, 10, 10, 0),
                "Conferencia de Java",
                "Auditorio A"
        ));

        gestor.agregarEvento(new Evento(
                LocalDateTime.of(2025, 4, 15, 14, 0),
                "Taller de Machine Learning",
                "Sala 3"
        ));

        // Mostrar resultados
        System.out.println("Próximo evento: " + gestor.obtenerProximoEvento());
        gestor.mostrarEventos();

        // Eliminar eventos pasados (simulando que hoy es 2025-04-20)
        gestor.eliminarEventosPasados();
        System.out.println("\nDespués de eliminar eventos pasados:");
        gestor.mostrarEventos();
    }
}
