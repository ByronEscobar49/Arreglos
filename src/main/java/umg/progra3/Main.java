package umg.progra3;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import umg.progra3.ejercicios.EjercicioArray;

import static umg.progra3.Clases.AgruparPersonas.EjecutarAgruparPersonas;
import static umg.progra3.Clases.ConvertirArregloAMatriz.EjecutarConvertirArregloAMatriz;
import static umg.progra3.Clases.MinOperaciones.EjecutarMinOperaciones;
import static umg.progra3.Clases.OrdenarElementosFrecuencia.EjecutarOrdenarElementosFrecuencia;
import static umg.progra3.ejercicios.EjercicioArray.EjecutarDiagonal;
import static umg.progra3.ejercicios.EjercicioLinkedList.*;


public class Main {
    private static final Logger logger = LogManager.getLogger(Main.class);

    public static void main(String[] args) {
//        logger.debug("Mensaje de depuración");
//        logger.warn("Mensaje de advertencia");
//        logger.error("Mensaje de error");

        // EjecutarMinOperaciones();
        // EjecutarAgruparPersonas();
        // EjecutarConvertirArregloAMatriz();
        // EjecutarOrdenarElementosFrecuencia();

        // EjecutarArray();
        // EjecutarSuma();
         // EjecutarDiagonal();
        
        eliminarDuplicados();
        invertirElemento();
        unirListas();
    }
}