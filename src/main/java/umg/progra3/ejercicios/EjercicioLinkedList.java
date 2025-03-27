package umg.progra3.ejercicios;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.LinkedList;

public class EjercicioLinkedList {
    private static final Logger logger = LogManager.getLogger(EjercicioLinkedList.class);

    /**
     * Ejercicio 1: Eliminar duplicados
     */
    public static void eliminarDuplicados(){
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

        LinkedList<Integer> lista2 = eliminar(lista);

        for(Integer i : lista2){
            logger.info(i);
        }
    }

    public static LinkedList<Integer> eliminar (LinkedList<Integer> lista){
        LinkedList<Integer> lista2 = new LinkedList<>();
        for(int i = 0; i < lista.size() -1; i++){
            if(lista.get(i).equals(lista.get(i+1))){
                lista.remove(i);
                i--;
            }
            else{
                lista2.add(lista.get(i));
            }
        }
        // Agregar el último elemento a lista2
        if (!lista.isEmpty()) {
            lista2.add(lista.getLast());
        }
        return lista2;
    }

    /**
     * Ejercicio 2: Invertir elementos de una LinkedList
     */
    public static void invertirElemento(){
        LinkedList<String> lista = new LinkedList<>();

        lista.add("Hola");
        lista.add("mi");
        lista.add("nombre");
        lista.add("es");
        lista.add("Byron");

        for(String s : lista){
            logger.info(s);
        }

        logger.info("Lista invertida: \n");
        invertir(lista);
    }

    public static void invertir(LinkedList<String>lista){
        for(int i = lista.size() - 1; i >= 0; i--){
            String s = lista.get(i);
            logger.info(s);
        }
    }

    /**
     * Ejercicio 3: Unir elementos de 2 LinkedList de manera intercalada
     */
    public static void unirListas(){
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

        unir(lista1,lista2);

    }

    public static LinkedList<Integer> unir(LinkedList<Integer>lista1, LinkedList<Integer>lista2){
        LinkedList<Integer> lista3 = new LinkedList<>();
        int maxSize = Math.max(lista1.size(), lista2.size());

        for(int i = 0; i < maxSize; i++){
            if(i < lista1.size()){
                lista3.add(lista1.get(i));
                logger.info(lista1.get(i));
            }
            if(i < lista2.size()){
                lista3.add(lista2.get(i));
                logger.info(lista2.get(i));
            }
        }
        return lista3;
    }
}
