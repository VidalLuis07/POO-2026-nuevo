package edu.luis.vidal.actividad2.v2.calculadora.process;

public class Raiz extends Operacion {

    /**
     * Calcula la raíz entera aproximada.
     * @param a El índice o radical (ej. 2 para raíz cuadrada, 3 para cúbica).
     * @param b El número al que se le busca la raíz (el radicando).
     * @return La raíz entera más cercana.
     */
    @Override
    public int apply(int a, int b) {
        if (b < 0) {
            throw new ArithmeticException("Error: No se pueden calcular raíces de números negativos.");
        }
        if (a <= 0) {
            throw new ArithmeticException("Error: El índice de la raíz debe ser mayor a 0.");
        }

        int i = 0;
        int resultadoPotencia = 0;
        while (resultadoPotencia <= b) {
            i++;
            resultadoPotencia = new Potencia().apply(i, a);
        }
        return i - 1;
    }
}