package umg.edu.gt.test.EjercicioLinkedList;

import org.junit.jupiter.api.Test;
import umg.progra3.ejercicios.EjercicioLinkedList;

import java.util.Collections;
import java.util.LinkedList;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static umg.progra3.ejercicios.EjercicioLinkedList.*;

public class EjercicioLinkedListTest {
    @Test
    public void testEjercicioEliminarDuplicados() {
        LinkedList<Integer> lista = new LinkedList<>();

        lista.add(1);
        lista.add(1);
        lista.add(2);
        lista.add(4);
        lista.add(5);
        lista.add(5);
        lista.add(7);
        lista.add(8);
        lista.add(8);
        lista.add(9);

        LinkedList<Integer> listaCorrecta = new LinkedList<>();
        listaCorrecta.add(1);
        listaCorrecta.add(2);
        listaCorrecta.add(4);
        listaCorrecta.add(5);
        listaCorrecta.add(7);
        listaCorrecta.add(8);
        listaCorrecta.add(9);

        LinkedList<Integer> lista2 = eliminar(lista);
        assertEquals(listaCorrecta,lista2);

    }

    @Test
    public void testEjercicioInvertirLista(){
        LinkedList<String> lista = new LinkedList<>();

        lista.add("Hola");
        lista.add("mi");
        lista.add("nombre");
        lista.add("es");
        lista.add("Oliver");

        // Llamar al método invertir
        LinkedList<String> listaInvertida = lista;
        EjercicioLinkedList.invertir(lista);
        Collections.reverse(listaInvertida);

        // Verificar que la lista se haya invertido correctamente
        LinkedList<String> esperada = new LinkedList<>();
        esperada.add("Oliver");
        esperada.add("es");
        esperada.add("nombre");
        esperada.add("mi");
        esperada.add("Hola");

        assertEquals(esperada, listaInvertida, "La lista no se invirtió correctamente");

    }

    @Test
    public void testEjercicioUnirListas(){
        LinkedList<Integer> lista1 = new LinkedList<>();
        LinkedList<Integer> lista2 = new LinkedList<>();

        lista1.add(1);
        lista1.add(3);
        lista1.add(5);
        lista1.add(7);
        lista1.add(9);

        lista2.add(2);
        lista2.add(4);
        lista2.add(6);
        lista2.add(8);
        lista2.add(10);

        LinkedList<Integer> lista3 = unir(lista1,lista2);
        LinkedList<Integer> listaUnida = new LinkedList<>();
        listaUnida.add(1);
        listaUnida.add(2);
        listaUnida.add(3);
        listaUnida.add(4);
        listaUnida.add(5);
        listaUnida.add(6);
        listaUnida.add(7);
        listaUnida.add(8);
        listaUnida.add(9);
        listaUnida.add(10);

        assertEquals(listaUnida,lista3, "La lista no esta unida");
    }
}
