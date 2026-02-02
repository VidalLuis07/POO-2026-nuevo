package edu.luis.vidal.actividad3.test;
import edu.luis.vidal.actividad3.plantillas.Empleado;
import edu.luis.vidal.actividad3.process.ListaEmpleados;
import edu.luis.vidal.actividad3.process.Strings;
import edu.luis.vidal.actividad3.process.ListaEnteros;
import org.junit.Test;
import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Tests {
    @Test
    public void testListaEnteros() {
        List<Integer> input = new ArrayList<>(Arrays.asList(0, 2, 1, 4, 0, 2));
        List<Integer> esperado = Arrays.asList(2, 1, 4, 2, 0, 0);

        List<Integer> resultado = ListaEnteros.recorrerCeros(input);

        assertEquals("La lista debería tener los ceros al final", esperado, resultado);
    }

    @Test
    public void testGetCantidadPares() {
        List<Integer> input = Arrays.asList(3, 4, 5, 7, 6);
        int esperado = 2;

        int resultado = ListaEnteros.getCantidadPares(input);

        assertEquals("La cuenta de pares no es correcta", esperado, resultado);
    }

    @Test
    public void testIsPalindromoTrue() {
        String input = "ana";
        assertTrue("La palabra 'ana' debería ser palíndromo", Strings.isPalindromo(input));
    }

    @Test
    public void testIsPalindromoFalse() {
        String input = "hola mundo";
        assertFalse(" 'hola mundo' NO es palíndromo", Strings.isPalindromo(input));
    }

    @Test
    public void testDevolverNumeroVocales() {
        String input = "hola";
        int esperado = 2;

        int resultado = Strings.devolverNumeroVocales(input);

        assertEquals("La palabra 'hola' debería tener 2 vocales", esperado, resultado);
    }

    @Test
    public void testInvertirCadena() {
        String input = "hola";
        String esperado = "aloh";

        String resultado = Strings.devolverCadenaInvertida(input);

        assertEquals("La cadena debería estar al revés", esperado, resultado);
    }

    @Test
    public void testUbicarCaracterEncontrado() {
        String inputStr = "hola";
        char inputChar = 'o';
        int esperado = 1;

        int resultado = Strings.ubicarCaracter(inputStr, inputChar);

        assertEquals("La 'o' debería estar en la posición 1", esperado, resultado);
    }

    @Test
    public void testUbicarCaracterNoEncontrado() {
        String inputStr = "hola";
        char inputChar = 'r';
        int esperado = -1;

        int resultado = Strings.ubicarCaracter(inputStr, inputChar);

        assertEquals("Si no existe el caracter, debe devolver -1", esperado, resultado);
    }

    @Test
    public void testGetMayorSalario() {
        List<Empleado> lista = Arrays.asList(
                new Empleado("Luis", 5000.0, 20, "Sistemas"),
                new Empleado("Vidal", 12000.0, 30, "Ventas"),
                new Empleado("Juan", 8000.0, 25, "Sistemas")
        );

        Empleado resultado = ListaEmpleados.getMayorSalario(lista);

        assertNotNull(resultado);
        assertEquals("Vidal", resultado.getNombre());
        assertEquals(12000.0, resultado.getSalario(), 0.0);
    }

    @Test
    public void testGetEdadMasComun() {
        List<Empleado> lista = Arrays.asList(
                new Empleado("Luis", 10000.0, 25, "Sistemas"),
                new Empleado("Pedro", 12000.0, 30, "Ventas"),
                new Empleado("Vidal", 15000.0, 25, "Sistemas"),
                new Empleado("Ana", 9000.0, 40, "RRHH")
        );

        int resultado = ListaEmpleados.getEdadMasComun(lista);

        assertEquals("La edad más común debería ser 25", 25, resultado);
    }

    @Test
    public void testGetPromedioEdad() {
        List<Empleado> lista = Arrays.asList(
                new Empleado("Luis", 1000.0, 20, "Sistemas"),
                new Empleado("Vidal", 2000.0, 30, "Ventas"),
                new Empleado("Juan", 3000.0, 40, "Sistemas")
        );

        double resultado = ListaEmpleados.getPromedioEdad(lista);

        assertEquals(30.0, resultado, 0.001);
    }

    @Test
    public void testGetPromedioSalario() {
        List<Empleado> lista = Arrays.asList(
                new Empleado("Luis", 10500.50, 25, "Sistemas"),
                new Empleado("Vidal", 20500.50, 30, "Ventas")
        );

        double resultado = ListaEmpleados.getPromedioSalario(lista);

        // (10500.50 + 20500.50) / 2 = 15500.50
        assertEquals(15500.50, resultado, 0.001);
    }

    @Test
    public void testGetPromedioEdadMas25K() {
        List<Empleado> lista = Arrays.asList(
                new Empleado("Rico 1", 30000.0, 40, "Sistemas"),
                new Empleado("Rico 2", 40000.0, 50, "Ventas"),
                new Empleado("Pobre", 10000.0, 20, "RRHH")
        );

        double resultado = ListaEmpleados.getPromedioEdadMas25K(lista);
        assertEquals(45.0, resultado, 0.001);
    }

    @Test
    public void testGetMenores25Edad() {
        // 1. Datos de entrada
        List<Empleado> lista = Arrays.asList(
                new Empleado("Joven", 1000.0, 20, "Sistemas"),
                new Empleado("Justo", 1000.0, 24, "Ventas"),
                new Empleado("Limite", 1000.0, 25, "RRHH"),
                new Empleado("Viejo", 1000.0, 30, "Sistemas")
        );

        List<Empleado> resultado = ListaEmpleados.getMenores25Edad(lista);

        assertEquals("Deberían haber 2 empleados menores de 25", 2, resultado.size());
        assertEquals("Joven", resultado.get(0).getNombre());
        assertEquals("Justo", resultado.get(1).getNombre());
    }

    @Test
    public void testGetCantidadEmpleadosSistemas() {
        List<Empleado> lista = Arrays.asList(
                new Empleado("Luis", 1000.0, 20, "Sistemas"),   // +1
                new Empleado("Ana", 1000.0, 25, "sistemas"),   // +1 (por el ignore case)
                new Empleado("Pedro", 1000.0, 30, "Ventas"),   // No cuenta
                new Empleado("Maria", 1000.0, 35, "SISTEMAS")  // +1
        );

        int resultado = ListaEmpleados.getCantidadEmpleadosSistemas(lista);

        assertEquals("Debería haber contado 3 empleados de Sistemas", 3, resultado);
    }

    @Test
    public void testGetMayorSalarioMayor30Edad() {
        List<Empleado> lista = Arrays.asList(
                new Empleado("Joven Rico", 50000.0, 20, "Sistemas"), // Se ignora por edad
                new Empleado("Vidal", 10000.0, 35, "Ventas"),       // Candidato 1
                new Empleado("Luis", 15000.0, 40, "Sistemas"),      // Ganador (es > 30 y gana más que Vidal)
                new Empleado("Ana", 5000.0, 25, "RRHH")             // Se ignora por edad
        );

        Empleado resultado = ListaEmpleados.getMayorSalarioMayor30Edad(lista);

        assertNotNull(resultado);
        assertEquals("Luis", resultado.getNombre());
        assertEquals(15000.0, resultado.getSalario(), 0.0);
    }

    @Test
    public void testGetMenorSalarioEdadMenosComun() {
        List<Empleado> lista = Arrays.asList(
                new Empleado("Comun A", 3000, 20, "Ventas"),
                new Empleado("Comun B", 4000, 20, "Ventas"),
                new Empleado("Raro Caro", 9000, 50, "Sistemas"),
                new Empleado("Raro Barato", 1500, 50, "Sistemas")
        );

        Empleado resultado = ListaEmpleados.getMenorSalarioEdadMenosComun(lista);

        assertNotNull(resultado);
        assertEquals("Raro Barato", resultado.getNombre());
    }
}