package edu.luis.vidal.actividad2.calculadora.process;

public class Modulo {
    public static int realizarOperacion(int op1, int op2) {
        /**
         * Este metodo recibe dos operandos, para repetir en bucle la resta de op1-op2 hasta que op1 sea el número menor
         * @param residuo es el restante que quede al finalizar nuestro bucle de restas, nuestro modulo
         */
        if (op2 == 0) {
            System.out.println("Error: No se puede dividir entre 0");
            return 0;
        }

        int residuo = op1;

        while (residuo >= op2) {
            residuo = Resta.realizarOperacion(residuo, op2);
        }

        return residuo;
    }
}
