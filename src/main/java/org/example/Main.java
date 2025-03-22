package org.example;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import static Ejercicios.EjercicioLinkedList.*;

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
