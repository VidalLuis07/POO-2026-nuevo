package edu.luis.vidal.actividad2.v2.calculadora.process;

public class Potencia extends Operacion {

    /**
     * @param a Base
     * @param b Exponente
     * @return El resultado de elevar a a la potencia b
     */

    @Override
    public int apply(int a, int b) {
        int resultado = 1;
        for (int i = 0; i < b; i++) {
            resultado = new Multiplicacion().apply(resultado, a);
        }

        return resultado;
    }
}