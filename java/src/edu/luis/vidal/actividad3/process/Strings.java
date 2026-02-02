package edu.luis.vidal.actividad3.process;

/**
 * Clase para realizar operaciones y metodos sobre Strings.
 */
public class Strings {

    /**
     * Determina si una cadena es un palíndromo (se lee igual de izquierda a derecha que de derecha a izquierda).
     * Ignora las diferencias entre mayúsculas y minúsculas.
     */
    public static boolean isPalindromo(String cadena){
        return cadena.equalsIgnoreCase(devolverCadenaInvertida(cadena));
    }

    /**
     * Cuenta el número total de vocales (a, e, i, o, u) presentes en una cadena.
     * El conteo no distingue entre mayúsculas y minúsculas.
     */
    public static int devolverNumeroVocales(String cadena) {
        int contador = 0;
        String minusculas = cadena.toLowerCase();

        for (int i = 0; i < minusculas.length(); i++) {
            char letra = minusculas.charAt(i);
            if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u') {
                contador++;
            }
        }
        return contador;
    }

    /**
     * Crea una nueva cadena con los caracteres de la original en orden inverso.
     */
    public static String devolverCadenaInvertida(String cadena) {
        StringBuilder cadenaInvertida = new StringBuilder();
        for (int i = cadena.length() - 1; i >= 0; i--) {
            cadenaInvertida.append(cadena.charAt(i));
        }
        return cadenaInvertida.toString();
    }

    /**
     * Busca la primera aparición de un carácter específico en la cadena.
     * @return El índice de la posición (empezando desde 0) o -1 si el carácter no existe.
     */
    public static int ubicarCaracter(String cadena, char letra) {
        for(int i = 0; i < cadena.length(); i++) {
            if(cadena.charAt(i) == letra) {
                return i;
            }
        }
        return -1;
    }
}