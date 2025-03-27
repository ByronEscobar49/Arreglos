package umg.progra3.Clases;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


import java.util.*;

public class AgruparPersonas {
    private static final Logger logger = LogManager.getLogger(AgruparPersonas.class);

    public static void EjecutarAgruparPersonas(){
        // Ejercicio 2 - Agrupar Personas
        int[] GroupSizes  = new int[]{3,3,3,3,3,1,3};
        logger.info("\nEntrada:" + Arrays.toString(GroupSizes));
        logger.info("Salida: "+"["+Resultado(GroupSizes)+"]");
    }

    public static String Resultado(int[] GroupSizes) {
        Map<Integer, List<Integer>> map = new HashMap<>();
        StringBuilder resultado = new StringBuilder();

        // Agrupar los índices según el tamaño del grupo
        for (int i = 0; i < GroupSizes.length; i++) {
            int size = GroupSizes[i];
            map.putIfAbsent(size, new ArrayList<>());
            map.get(size).add(i);
        }

        // Imprimir los grupos en horizontal
        for (Map.Entry<Integer, List<Integer>> entry : map.entrySet()) {
            int groupSize = entry.getKey();
            List<Integer> group = entry.getValue();

            for (int i = 0; i < group.size(); i += groupSize) {
                List<Integer> subGroup = group.subList(i, i + groupSize);
                resultado.append("["); // Inicio del grupo
                for (int j = 0; j < subGroup.size(); j++) {
                    resultado.append(subGroup.get(j)); // Índice de la persona
                    if (j < subGroup.size() - 1) {
                        resultado.append(", ");
                    }
                }
                resultado.append("] "); // Fin del grupo
            }
        }
        return resultado.toString();
    }
}
