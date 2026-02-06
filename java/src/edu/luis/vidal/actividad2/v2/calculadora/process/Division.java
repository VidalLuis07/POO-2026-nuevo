package edu.luis.vidal.actividad2.v2.calculadora.process;

public class Division extends Operacion {

    /**
     * @param a Dividendo
     * @param b Divisor
     * @return El cociente (cuántas veces cabe 'b' en 'a')
     */
    @Override
    public int apply(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Error: No se puede dividir entre 0");
        }

        int contador = 0;
        int residuo = a;
        while (residuo >= b) {
            residuo = new Resta().apply(residuo, b);
            contador++;
        }

        return contador;
    }
}