package edu.luis.vidal.actividad2.calculadora.process;
import edu.luis.vidal.actividad2.calculadora.process.Suma;

public class Multiplicacion {
    /**
     * Este metodo recibe dos operandos y devuelve su diferencia
     * @return la suma de op1 y op2
     * @param op1 primer operando, aqui será el numero a sumarse
     * @param op2 segundo operando operando, la cantidad de veces que se repetira el bucle sumando op1
     * La variable resultado vale cero, pero es donde se guarda el resultado del bucle de sumas
     */

    public static int realizarOperacion(int op1, int op2) {
        int resultado = 0;
        for (int i = 0; i < op2; i++) {
            resultado = Suma.realizarOperacion(resultado, op1);
        }
        return resultado; // Al final entregamos el paquete armado
    }
}
