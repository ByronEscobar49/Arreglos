package Clases;

import java.util.Arrays;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;





public class OrdenarElementosFrecuencia {
    private static final Logger logger = LogManager.getLogger(OrdenarElementosFrecuencia.class);

    public static void EjecutarOrdenarElementosFrecuencia(){
        // Ejercicio 4 - Ordenar Elementos por Frecuencia
        int[] nums2 = new int[]{4, 3, 1, 6, 3, 4, 4, 6};
        logger.info("\nEntrada:" + Arrays.toString(nums2));
        logger.info("Salida:");
        ElementosOrdenados(nums2);
    }


    public static void ElementosOrdenados(int[] nums2){
        // Encontrar el valor máximo en el arreglo
        int maxNum = encontrarMaximo(nums2);

        // Crear un arreglo de frecuencias
        int[] frecuencias = new int[maxNum + 1];
        for (int num : nums2) {
            frecuencias[num]++;
        }

        //Ordenar el arreglo según la frecuencia
        for (int i = 0; i < nums2.length - 1; i++) {
            for (int j = 0; j < nums2.length - i - 1; j++) {
                // Comparar frecuencias
                if (frecuencias[nums2[j]] < frecuencias[nums2[j + 1]]) {
                    // Intercambiar elementos
                    int temp = nums2[j];
                    nums2[j] = nums2[j + 1];
                    nums2[j + 1] = temp;
                }
                // Si las frecuencias son iguales, mantener el orden relativo
                else if (frecuencias[nums2[j]] == frecuencias[nums2[j + 1]]) {
                    // Verificar el orden original
                    if (j > 0 && nums2[j - 1] == nums2[j + 1]) {
                        // Intercambiar para mantener el orden relativo
                        int temp = nums2[j];
                        nums2[j] = nums2[j + 1];
                        nums2[j + 1] = temp;
                    }
                }
            }
        }

        for (int num : nums2) {
            System.out.print(num + " ");
        }
    }

    // Método para encontrar el valor máximo en el arreglo
    private static int encontrarMaximo(int[] nums2) {
        int max = nums2[0];
        for (int num : nums2) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }
}
