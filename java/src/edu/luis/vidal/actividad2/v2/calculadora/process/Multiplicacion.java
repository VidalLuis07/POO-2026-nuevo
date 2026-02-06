package edu.luis.vidal.actividad2.v2.calculadora.process;

public class Multiplicacion extends Operacion {

    /**
     * @param a primer operando (multiplicando)
     * @param b segundo operando (multiplicador)
     * @return el resultado de la multiplicacion
     */
    @Override
    public int apply(int a, int b) {
        int resultado = 0;

        for (int i = 0; i < b; i++) {
            resultado = new Suma().apply(resultado, a);
        }

        return resultado;
    }
}