package edu.luis.vidal.actividad3.process;

import edu.luis.vidal.actividad3.plantillas.Empleado;
import java.util.ArrayList;
import java.util.List;

/**
 * Clase que realiza operaciones y filtrado sobre una lista de empleados.
 */
public class ListaEmpleados {

    /**
     * Busca y devuelve al empleado con el salario más alto en la lista.
     */
    public static Empleado getMayorSalario(List<Empleado> empleados) {
        Empleado mayor = empleados.get(0);
        for (Empleado emp : empleados) {
            if (emp.getSalario() > mayor.getSalario()) {
                mayor = emp;
            }
        }
        return mayor;
    }

    /**
     * Identifica la edad que más se repite entre los empleados.
     */
    public static int getEdadMasComun(List<Empleado> empleados) {
        java.util.Map<Integer, Integer> conteoEdades = new java.util.HashMap<>();
        for (Empleado emp : empleados) {
            int edad = emp.getEdad();
            conteoEdades.put(edad, conteoEdades.getOrDefault(edad, 0) + 1);
        }
        int edadMasComun = -1;
        int maxApariciones = -1;

        for (java.util.Map.Entry<Integer, Integer> entrada : conteoEdades.entrySet()) {
            if (entrada.getValue() > maxApariciones) {
                maxApariciones = entrada.getValue();
                edadMasComun = entrada.getKey();
            }
        }
        return edadMasComun;
    }

    /**
     * Calcula el promedio de edad de todos los empleados en la lista.
     */
    public static double getPromedioEdad(List<Empleado> empleados) {
        double sumaEdad = 0;
        for (Empleado emp : empleados) {
            sumaEdad += emp.getEdad();
        }
        return sumaEdad / empleados.size();
    }

    /**
     * Calcula el promedio de salario de todos los empleados en la lista.
     */
    public static double getPromedioSalario(List<Empleado> empleados) {
        double sumaSalario = 0;
        for (Empleado emp : empleados) {
            sumaSalario += emp.getSalario();
        }
        return sumaSalario / empleados.size();
    }

    /**
     * Calcula el promedio de edad únicamente de los empleados que ganan más de 25,000.
     */
    public static double getPromedioEdadMas25K(List<Empleado> empleados){
        List<Empleado> empleadosMas25K = new ArrayList<>();
        for (Empleado emp : empleados) {
            if(emp.getSalario() > 25000){
                empleadosMas25K.add(emp);
            }
        }
        if (empleadosMas25K.isEmpty()) {
            return 0;
        }
        return getPromedioEdad(empleadosMas25K);
    }

    /**
     * Filtra y devuelve una lista con los empleados que tienen 25 años o menos.
     */
    public static List<Empleado> getMenores25Edad(List<Empleado> empleados) {
        List<Empleado> empleadosMenores25Edad = new ArrayList<>();
        for (Empleado emp : empleados) {
            if (emp.getEdad() <  25) {
                empleadosMenores25Edad.add(emp);
            }
        }
        return empleadosMenores25Edad;
    }

    /**
     * Cuenta cuántos empleados pertenecen al departamento de "Sistemas" (ignora mayúsculas).
     */
    public static int getCantidadEmpleadosSistemas(List<Empleado> empleados) {
        int cantidadEmpleadosSistemas = 0;
        for (Empleado emp : empleados) {
            if ("Sistemas".equalsIgnoreCase(emp.getDepartamento()))
                cantidadEmpleadosSistemas++;
        }
        return cantidadEmpleadosSistemas;
    }

    /**
     * Busca al empleado con mayor salario entre aquellos que superan los 30 años de edad.
     */
    public static Empleado getMayorSalarioMayor30Edad(List<Empleado> empleados){
        List<Empleado> empleadosMayoresDe30Edad = new ArrayList<>();
        for (Empleado emp : empleados) {
            if (emp.getEdad() > 30) {
                empleadosMayoresDe30Edad.add(emp);
            }
        }
        return getMayorSalario(empleadosMayoresDe30Edad);
    }

    /**
     * Busca al empleado con el salario más bajo cuya edad sea la menos frecuente en la lista.
     */
    public static Empleado getMenorSalarioEdadMenosComun(List<Empleado> empleados) {
        java.util.Map<Integer, Integer> conteoEdades = new java.util.HashMap<>();
        for (Empleado emp : empleados) {
            int edad = emp.getEdad();
            conteoEdades.put(edad, conteoEdades.getOrDefault(edad, 0) + 1);
        }

        int minFrecuencia = Integer.MAX_VALUE;
        for (int frecuencia : conteoEdades.values()) {
            if (frecuencia < minFrecuencia) {
                minFrecuencia = frecuencia;
            }
        }
        Empleado empleadoRaro = null;

        for (Empleado emp : empleados) {
            int edadEmp = emp.getEdad();
            int frecuenciaDeEstaEdad = conteoEdades.get(edadEmp);

            if (frecuenciaDeEstaEdad == minFrecuencia) {
                if (empleadoRaro == null || emp.getSalario() < empleadoRaro.getSalario()) {
                    empleadoRaro = emp;
                }
            }
        }
        return empleadoRaro;
    }
}