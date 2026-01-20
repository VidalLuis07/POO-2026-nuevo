package edu.luis.vidal.actividad2.calculadora.process;

import edu.luis.vidal.actividad2.calculadora.process.Multiplicacion;

public class Logaritmo {
    /**
     * @param op1 es la base del logaritmo
     * @param op2 es el argumento del logaritmo
     * @return contador es la cantidad
     */
    public static int realizarOperacion(int op1, int op2) {
        // 1. Validaciones matemáticas
        if (op1 <= 1) {
            System.out.println("Error: La base debe ser mayor a 1");
            return 0;
        }
        if (op2 <= 0) {
            System.out.println("Error: El argumento debe ser mayor a 0");
            return 0;
        }

        int contador = 0;
        int acumulado = 1;

        // 2. El ciclo de búsqueda
        // Mientras el acumulado multiplicado por la base no pase al argumento
        while (true) {
            // Intentamos multiplicar una vez más
            int siguiente = Multiplicacion.realizarOperacion(acumulado, op1);

            if (siguiente <= op2) {
                acumulado = siguiente;
                contador++; // Llevamos la cuenta de cuántas veces multiplicamos
            } else {
                // Si la siguiente multiplicación se pasa, nos salimos
                break;
            }
        }
        return contador;
    }
}

