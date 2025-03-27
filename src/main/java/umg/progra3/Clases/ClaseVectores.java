package umg.progra3.Clases;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;

/**
 *
 * @author wcordova
 */
public class ClaseVectores {

    /**
     * Ejemplo 1: ArrayList y LinkedList
     */
    public void ejemploListas() {

        // ArrayList - Lista dinámica
        ArrayList<Integer> lista = new ArrayList<>();
        lista.add(10);
        lista.add(20);
        lista.add(30);
        lista.add(10);
        lista.add(50);
        lista.add(100);
        lista.add(3, 60);


        System.out.println("ArrayList: " + lista);

        ArrayList<String> listaString = new ArrayList<>();
        listaString.add("Walter");
        listaString.add("Anibal");
        listaString.add("Cordova");
        listaString.remove(1);

        System.out.println("ArrayList: " + listaString);

        // LinkedList - Lista enlazada
        LinkedList<String> nombres = new LinkedList<>();
        nombres.add("Ana");
        nombres.add("Juan");
        nombres.add("Pedro");
        nombres.addFirst("--");
        nombres.addLast("---");

        System.out.println("LinkedList: " + nombres);
    }

    /**
     * Ejemplo 2: eficiencia de algoritmo
     */
    public void ejemploBuscarNumero() {
        int[] numeros = {10, 20, 30, 40, 50};
        int objetivo = 30;

        System.out.println(buscarNumero(numeros, objetivo));
    }

    public static boolean buscarNumero(int[] arr, int objetivo) {
        for (int num : arr) {
            if (num == objetivo) {
                return true; // O(n) en el peor caso
            }
        }
        return false;
    }

    /**
     * Ejemplo 3: Arrays, LinkedList y Hash
     */
    public void comparacionArraysLinkedListHash() {
        LinkedList<String> lista = new LinkedList<>();
        lista.add("A");
        lista.add("B");
        lista.add("C");
        lista.add("D");
        lista.add("E");
        lista.addFirst("Z");
        lista.addLast("X");
        lista.add(3, "8");
        lista.removeFirst();
        lista.removeLast();
        lista.remove(2);
        System.out.println(lista);

        ArrayList<String> lista2 = new ArrayList<>();
        lista2.add("A");
        lista2.add("B");
        lista2.add("C");
        lista2.add("E");
        lista2.add("E");
        lista2.add(3, "8");
        //quiero la letra C
        for (String letra: lista2) {
            if("C".equals(letra)) {
                System.out.println(letra);
            }
        }

        HashMap<String, Integer> edades = new HashMap<>();
        edades.put("Walter", 34);
        edades.put("Gabriel", 50);
        edades.put("Rodrigo", 60);
        edades.put("Bukele", 35);
        edades.put("Palomares", 51);
        edades.put("Ulises", 30);

        System.out.println(edades);
        System.out.println(edades.get("Gabriel"));


    }


}