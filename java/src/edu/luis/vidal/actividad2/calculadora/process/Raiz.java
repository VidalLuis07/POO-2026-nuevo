package edu.luis.vidal.actividad2.calculadora.process;

public class Raiz {

    public static int realizarOperacion(int op1, int op2) {
        /**
         * primero resolvemos errores matemáticos relacionados con raízes, no sacaremos la raíz de 0 o de númers negativos
         * porque no existen
         * ahora, i es el resultado de la raíz que nosotros creemos que puede ser, se va a elever a la misma potencia que
         * el radical de la raíz, está operación se va a repetir hasta que a la hora de que elevemos i
         * se pase del valorr en op2 y por ende la raíz entera más cercana sería el número anterior guardado en i
         */

        if (op2 < 0) {
            System.out.println("Error: No manejamos raíces de números negativos");
            return 0;
        }
        if (op1 <= 0) {
            System.out.println("Error: El índice de la raíz debe ser mayor a 0");
            return 0;
        }

        int i = 0;
        int resultadoPotencia = 0;

        while (resultadoPotencia <= op2) {
            i++;

            resultadoPotencia = Potencia.realizarOperacion(i, op1);
        }

        return i - 1;
    }
}