package umg.progra3.EjerciciosTree;

import java.util.TreeMap;

public class RastreadorVersiones {
    private TreeMap<Integer, String> versiones;
    private int siguienteVersion;

    public RastreadorVersiones() {
        this.versiones = new TreeMap<>();
        this.siguienteVersion = 1;
    }

    // Agrega una nueva versión con clave autoincrementada
    public void agregarVersion(String contenido) {
        versiones.put(siguienteVersion, contenido);
        System.out.println("Agregar versión " + siguienteVersion + ": \"" + contenido + "\"");
        siguienteVersion++;
    }

    // Obtiene una versión específica
    public String obtenerVersion(int numeroVersion) {
        return versiones.get(numeroVersion);
    }

    // Obtiene la última versión disponible
    public String obtenerUltimaVersion() {
        return versiones.lastEntry().getValue();
    }

    // Elimina una versión específica
    public void eliminarVersion(int numeroVersion) {
        versiones.remove(numeroVersion);
    }

    // Método para pruebas
    public static void main(String[] args) {
        RastreadorVersiones rastreador = new RastreadorVersiones();

        rastreador.agregarVersion("System.out.println('Hola Mundo');");
        rastreador.agregarVersion("System.out.println('Hola Java');");

        System.out.println("\n--- Resultados ---");
        System.out.println("Última versión: \"" + rastreador.obtenerUltimaVersion() + "\"");
        System.out.println("Versión 1: \"" + rastreador.obtenerVersion(1) + "\"");

        rastreador.eliminarVersion(1);
        System.out.println("\nDespués de eliminar versión 1:");
        System.out.println("Versión 1 ahora es: " + rastreador.obtenerVersion(1));
    }
}
