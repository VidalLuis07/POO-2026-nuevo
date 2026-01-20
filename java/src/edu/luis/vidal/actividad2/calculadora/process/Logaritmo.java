package edu.luis.vidal.actividad2.calculadora.process;

import edu.luis.vidal.actividad2.calculadora.process.Division;

public class Logaritmo {
    /**
     * Calcula el logaritmo entero mediante divisiones sucesivas.
     * @param op1 es la base del logaritmo
     * @param op2 es el argumento del logaritmo
     * @return devuelve el logaritmo entero
     */
    public static int realizarOperacion(int op1, int op2) {
        if (op1 <= 1 || op2 <= 0) return 0;
        int contador = 0;
        int valorActual = op2;

        while (valorActual >= op1) {

            valorActual = Division.realizarOperacion(valorActual, op1);
            contador++;
        }

        return contador;
    }
}