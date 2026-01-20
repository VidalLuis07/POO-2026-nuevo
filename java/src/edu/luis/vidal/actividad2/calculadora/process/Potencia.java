package edu.luis.vidal.actividad2.calculadora.process;
import edu.luis.vidal.actividad2.calculadora.process.Multiplicacion;

public class Potencia {

    /**
     * Este metodo calcula la potencia de un número (op1^op2)
     * Usa la clase multiplicacion, ya que esta solo usa sumas y nos ahorra trabajo extra
     * Usamos un ciclo for porque sabemos exactamente cuantas veces vamos a hacer el bucle
     */
    public static int realizarOperacion(int op1, int op2) {
        int resultado = 1;
        for (int i = 0; i < op2; i++) {
            resultado = Multiplicacion.realizarOperacion(resultado, op1);
        }

        return resultado;
    }
}