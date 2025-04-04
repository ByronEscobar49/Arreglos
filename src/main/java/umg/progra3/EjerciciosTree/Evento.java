package umg.progra3.EjerciciosTree;
import java.time.LocalDateTime;
public class Evento implements Comparable<Evento>{
    private LocalDateTime fecha;
    private String nombre;
    private String ubicacion;

    public Evento(LocalDateTime fecha, String nombre, String ubicacion) {
        this.fecha = fecha;
        this.nombre = nombre;
        this.ubicacion = ubicacion;
    }

    // Orden natural por fecha (requerido por TreeSet)
    @Override
    public int compareTo(Evento otro) {
        return this.fecha.compareTo(otro.fecha);
    }

    // Getters
    public LocalDateTime getFecha() { return fecha; }
    public String getNombre() { return nombre; }
    public String getUbicacion() { return ubicacion; }

    @Override
    public String toString() {
        return String.format("\"%s\", %s, %s", nombre, fecha, ubicacion);
    }
}
