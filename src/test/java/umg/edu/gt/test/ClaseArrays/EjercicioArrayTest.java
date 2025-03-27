package umg.edu.gt.test.ClaseArrays;

import org.junit.jupiter.api.Test;
import umg.progra3.ejercicios.EjercicioArray;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static umg.progra3.ejercicios.EjercicioArray.sonMatricesIguales;

public class EjercicioArrayTest {
    @Test
    public void testEjercicioArray() {
        // Arrange
        List<List<Integer>> matriz = new ArrayList<>();
        matriz.add(List.of(0, 8, 7));
        matriz.add(List.of(7, 1, 3));
        matriz.add(List.of(1, 9, 5));

        // Act
        int maxRiqueza = EjercicioArray.ejercicioArray(matriz);

        // Assert
        assertEquals(15, maxRiqueza, "La riqueza del cliente más rico debería ser 15");
    }

    @Test
    public void testEjercicioArrayDiagonal() {
        List<List<Integer>> matrizDiagonal = new ArrayList<>();
        matrizDiagonal.add(List.of(3, 3, 1, 1));
        matrizDiagonal.add(List.of(2, 2, 1, 2));
        matrizDiagonal.add(List.of(1, 1, 1, 2));

        List<List<Integer>> esperado1 = new ArrayList<>();
        esperado1.add(List.of(1, 1, 1, 1));
        esperado1.add(List.of(1, 2, 2, 2));
        esperado1.add(List.of(1, 2, 3, 3));

        List<List<Integer>> resultado1 = EjercicioArray.Diagonal(matrizDiagonal);
        assertTrue(sonMatricesIguales(esperado1, resultado1), "Caso 1: Las matrices no son iguales");

    }



    @Test
    public void testEjercicioSuma() {
        // Arrange
        List<List<Integer>> matSuma = new ArrayList<>();
        matSuma.add(List.of(1, 2, 3));
        matSuma.add(List.of(4, 5, 6));
        matSuma.add(List.of(7, 8, 9));

        // Act
        int sumaTotal = EjercicioArray.ejercicioSuma(matSuma);

        // Assert
        assertEquals(45, sumaTotal, "La suma de los elementos debería ser 45");
    }
}
