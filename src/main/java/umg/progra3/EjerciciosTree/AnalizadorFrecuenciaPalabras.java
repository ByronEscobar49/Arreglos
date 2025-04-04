package umg.progra3.EjerciciosTree;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.TreeMap;
import java.util.regex.Pattern;

public class AnalizadorFrecuenciaPalabras {

    private static final Pattern PATRON_PALABRA = Pattern.compile("[^a-zA-Záéíóúüñ]+");

    public TreeMap<String, Integer> contarPalabras(String rutaArchivo) throws IOException {
        TreeMap<String, Integer> frecuencia = new TreeMap<>();

        try (BufferedReader br = new BufferedReader(new FileReader(rutaArchivo))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                String[] palabras = PATRON_PALABRA.split(linea.toLowerCase());
                for (String palabra : palabras) {
                    if (!palabra.isEmpty()) {
                        frecuencia.put(palabra, frecuencia.getOrDefault(palabra, 0) + 1);
                    }
                }
            }
        }
        return frecuencia;
    }

    public static void main(String[] args) {
        System.out.println("Ruta actual: " + System.getProperty("user.dir")); //me sirvio para saber la ruta actual
        AnalizadorFrecuenciaPalabras analizador = new AnalizadorFrecuenciaPalabras();

        try {
            // Prueba 1: Archivo con palabras repetidas (debe pasar)
            TreeMap<String, Integer> resultado1 = analizador.contarPalabras("test.txt");
            TreeMap<String, Integer> esperado1 = new TreeMap<>();
            esperado1.put("hola", 2);
            esperado1.put("mundo", 1);

            System.out.println("Prueba 1 - Archivo válido:");
            System.out.println("Esperado: " + esperado1);
            System.out.println("Resultado: " + resultado1);
            if (resultado1.equals(esperado1)) {
                System.out.println("✅ Prueba 1 pasó.");
            } else {
                System.out.println("❌ Prueba 1 falló.");
            }

            // Prueba 2: Archivo vacío (debe pasar)
            TreeMap<String, Integer> resultado2 = analizador.contarPalabras("vacio.txt");
            System.out.println("\nPrueba 2 - Archivo vacío:");
            System.out.println("Esperado: {}");
            System.out.println("Resultado: " + resultado2);
            if (resultado2.isEmpty()) {
                System.out.println("✅ Prueba 2 pasó.");
            } else {
                System.out.println("❌ Prueba 2 falló.");
            }

            // Prueba 3: Fuerza un fallo (comparación incorrecta)
            TreeMap<String, Integer> esperado3 = new TreeMap<>();
            esperado3.put("hola", 3);  // Valor incorrecto (real es 2)
            esperado3.put("mundo", 1);

            System.out.println("\nPrueba 3 - Test con error intencional:");
            System.out.println("Esperado (incorrecto): " + esperado3);
            System.out.println("Resultado: " + resultado1);
            if (resultado1.equals(esperado3)) {
                System.out.println("✅ Prueba 3 pasó (¡inesperado!).");
            } else {
                System.out.println("❌ Prueba 3 falló (como se esperaba).");
            }

        } catch (IOException e) {
            System.err.println("Error al leer el archivo: " + e.getMessage());
        }
    }
}