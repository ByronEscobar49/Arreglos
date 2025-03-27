package umg.progra3.ejercicios;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import umg.progra3.Main;

import java.util.*;


public class EjercicioArray {
    private static final Logger logger = LogManager.getLogger(EjercicioArray.class);

    //Ejercicio 1
    public  static void EjecutarArray(){
        List<List<Integer>> matriz = new ArrayList<>();
        matriz.add(List.of(2, 8, 7));
        matriz.add(List.of(7, 1, 3));
        matriz.add(List.of(1, 9, 5));

        int maxRiqueza = ejercicioArray(matriz);
        logger.info("La riqueza del cliente más rico es: " + maxRiqueza);
    }


    public static int ejercicioArray(List<List<Integer>> matriz){
        int maxRiqueza = 0;

        // Iterar sobre cada cliente (m filas)
        for (int i = 0; i < matriz.size(); i++) {
            int riquezaCliente = 0;

            // Obtener la lista de cuentas del cliente actual
            List<Integer> cuentasCliente = matriz.get(i);

            // Sumar todas las cuentas del cliente actual (n columnas)
            for (int j = 0; j < cuentasCliente.size(); j++) {
                riquezaCliente += cuentasCliente.get(j);
            }

            // Actualizar la riqueza máxima si el cliente actual es más rico
            if (riquezaCliente > maxRiqueza) {
                maxRiqueza = riquezaCliente;
            }
        }
        return maxRiqueza;
    }

    //Ejercicio 2
    public static void EjecutarDiagonal(){
        List<List<Integer>> matrizDiagonal = new ArrayList<>();
        matrizDiagonal.add(List.of(3, 3, 1, 1));
        matrizDiagonal.add(List.of(2, 2, 1, 2));
        matrizDiagonal.add(List.of(1, 1, 1, 2));

        logger.info("Matriz original:");
        imprimirMatriz(matrizDiagonal);

        List<List<Integer>> matrizOrdenada = Diagonal(matrizDiagonal);

        logger.info("\nMatriz con diagonales ordenadas:");
        imprimirMatriz(matrizOrdenada);
    }

    public static List<List<Integer>> Diagonal(List<List<Integer>> matrizDiagonal){
        int m = matrizDiagonal.size();    // Número de filas
        int n = matrizDiagonal.get(0).size(); // Número de columnas

        // Crear una copia de la matriz para no modificar la original
        List<List<Integer>> matrizOrdenada = new ArrayList<>();
        for (List<Integer> fila : matrizDiagonal) {
            matrizOrdenada.add(new ArrayList<>(fila));
        }

        // Ordenar diagonales que comienzan en la primera columna
        for (int i = 0; i < m; i++) {
            ordenarDiagonal(matrizOrdenada, i, 0);
        }

        // Ordenar diagonales que comienzan en la primera fila (excepto la primera celda)
        for (int j = 1; j < n; j++) {
            ordenarDiagonal(matrizOrdenada, 0, j);
        }

        return matrizOrdenada;

    }

    private static void ordenarDiagonal(List<List<Integer>> matriz, int filaInicio, int colInicio) {
        int m = matriz.size();
        int n = matriz.get(0).size();
        List<Integer> diagonal = new ArrayList<>();

        // Extraer los valores de la diagonal
        int i = filaInicio, j = colInicio;
        while (i < m && j < n) {
            diagonal.add(matriz.get(i).get(j));
            i++;
            j++;
        }

        // Ordenar los valores de la diagonal
        Collections.sort(diagonal);

        // Colocar los valores ordenados de nuevo en la diagonal
        i = filaInicio;
        j = colInicio;
        int indice = 0;
        while (i < m && j < n) {
            matriz.get(i).set(j, diagonal.get(indice));
            i++;
            j++;
            indice++;
        }
    }

    private static void imprimirMatriz(List<List<Integer>> matriz) {
        for (List<Integer> fila : matriz) {
            for (int valor : fila) {
                System.out.print(valor + " ");
            }
            System.out.println();
        }
    }

    // Método auxiliar para comparar dos matrices
    public static boolean sonMatricesIguales(List<List<Integer>> matriz1, List<List<Integer>> matriz2) {
        if (matriz1.size() != matriz2.size()) {
            return false;
        }

        for (int i = 0; i < matriz1.size(); i++) {
            if (!matriz1.get(i).equals(matriz2.get(i))) {
                return false;
            }
        }

        return true;
    }



    //Ejercicio 3
    public static void EjecutarSuma(){
        List<List<Integer>> matSuma = new ArrayList<>();
        matSuma.add(List.of(1, 2, 3));
        matSuma.add(List.of(4, 5, 6));
        matSuma.add(List.of(7, 8, 9));

        int suma =  ejercicioSuma(matSuma);
        logger.info("La suma de los elementos es: " + suma);

    }

    public static int ejercicioSuma(List<List<Integer>> matSuma){
        int sumaTotal = 0;
        for (int i = 0; i < matSuma.size(); i++) {
            for (int j = 0; j < matSuma.get(i).size(); j++) {
                sumaTotal += matSuma.get(i).get(j); // Sumar cada elemento
            }
        }
        return sumaTotal;
    }
}
