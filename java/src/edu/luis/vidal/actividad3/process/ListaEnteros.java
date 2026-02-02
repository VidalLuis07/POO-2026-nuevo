package edu.luis.vidal.actividad3.process;

import java.util.ArrayList;
import java.util.List;

/**
 * Clase que proporciona métodos para listas de números enteros.
 */
public class ListaEnteros {

    /**
     * Reordena la lista moviendo todos los ceros al final, manteniendo el orden
     * relativo de los demás números.
     */
    public static List<Integer> recorrerCeros(List<Integer> lista) {
        List<Integer> enteros = new ArrayList<>();
        // Primero agregamos todos los números que no son cero
        for (Integer integer : lista) {
            if (integer != 0) {
                enteros.add(integer);
            }
        }
        // Después agregamos los ceros restantes
        for (Integer integer : lista) {
            if (integer == 0) {
                enteros.add(integer);
            }
        }
        return enteros;
    }

    /**
     * Cuenta cuántos números pares existen en la lista proporcionada.
     */
    public static int getCantidadPares(List<Integer> lista) {
        int pares = 0;
        for (Integer integer : lista) {
            if (integer % 2 == 0) {
                pares++;
            }
        }
        return pares;
    }
}