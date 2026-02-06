package edu.luis.vidal.actividad2.v2.calculadora.process;

public class Logaritmo extends Operacion {

    /**
     * Calcula el logaritmo entero mediante divisiones sucesivas.
     * @param a La base del logaritmo (ej. Base 2).
     * @param b El argumento (el número al que le sacamos logaritmo).
     * @return El logaritmo entero (cuántas veces hay que multiplicar 'a' para llegar a 'b').
     */
    @Override
    public int apply(int a, int b) {
        if (a <= 1 || b <= 0) {
            throw new ArithmeticException("Error: Parámetros de logaritmo inválidos.");
        }

        int contador = 0;
        int valorActual = b;
        while (valorActual >= a) {
            valorActual = new Division().apply(valorActual, a);
            contador++;
        }
        return contador;
    }
}