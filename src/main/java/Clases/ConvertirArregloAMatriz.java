package Clases;

import java.util.*;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


import java.util.*;


public class ConvertirArregloAMatriz {
    private static final Logger logger = LogManager.getLogger(ConvertirArregloAMatriz.class);

    public static void EjecutarConvertirArregloAMatriz(){
        // Ejercicio 3 - Convertir Arreglo a Matriz
        int[] nums = new int[]{1,3,4,1,2,3,1};
        logger.info("\nEntrada:" + Arrays.toString(nums));

        List<List<Integer>> resultado = construirMatriz(nums);
        // Imprimir la matriz resultante
        logger.info("Salida:");
        for (List<Integer> fila : resultado) {
            System.out.println(fila);
        }
    }

    public static List<List<Integer>> construirMatriz(int[] nums) {
        // Paso 1: Contar las ocurrencias de cada número
        Map<Integer, Integer> contador = new HashMap<>();
        for (int num : nums) {
            contador.put(num, contador.getOrDefault(num, 0) + 1);
        }

        // Paso 2: Determinar el número máximo de filas necesarias
        int maxFilas = Collections.max(contador.values());

        // Paso 3: Crear la matriz 2D con el número de filas necesario
        List<List<Integer>> matriz = new ArrayList<>();
        for (int i = 0; i < maxFilas; i++) {
            matriz.add(new ArrayList<>());
        }

        // Paso 4: Distribuir los elementos en las filas
        for (int num : nums) {
            for (List<Integer> fila : matriz) {
                if (!fila.contains(num)) {
                    fila.add(num);
                    break;
                }
            }
        }

        return matriz;
    }

}
