package umg.edu.gt.test.EjercicioVectoresTest;

import org.junit.jupiter.api.Test;
import umg.progra3.ejercicios.EjercicioVectores;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class EjercicioVectoresTest {
    @Test
    void testTribonacci() {
        EjercicioVectores ejercicio1 = new EjercicioVectores();
        int[] signature = {1, 1, 1};
        int[] expected = {1, 1, 1, 3, 5, 9, 17, 31, 57, 105};
        int[] result = ejercicio1.tribonacci(signature, 10);

        System.out.println("Resultado Tribonacci: " + Arrays.toString(result));
        assertArrayEquals(expected, result, "La secuencia Tribonacci no es correcta");
    }

    @Test
    void testFindTotal() {
        int[] numbers = {2, 3, 5, 7, 8, 5, 10};
        int expectedScore = 19;
        int actualScore = EjercicioVectores.findTotal(numbers);

        System.out.println("Resultado FindTotal: " + actualScore);
        assertEquals(expectedScore, actualScore, "El cálculo del puntaje es incorrecto");
    }

    @Test
    void testFindTotalFailed() {
        int[] numbers = {10, 20, 30, 40, 50};
        int expectedScore = 15;
        int actualScore = EjercicioVectores.findTotal(numbers);

        System.out.println("Resultado FindTotal: " + actualScore);
        assertEquals(expectedScore, actualScore, "El cálculo del puntaje es incorrecto");
    }
}
