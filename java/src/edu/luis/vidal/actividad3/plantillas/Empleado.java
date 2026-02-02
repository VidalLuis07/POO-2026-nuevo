package edu.luis.vidal.actividad3.plantillas;

public class Empleado {
    private String nombre;
    private double salario;
    private int edad;
    private String departamento;

    public Empleado(String nombre, double salario, int edad, String departamento) {
        this.nombre = nombre;
        this.salario = salario;
        this.edad = edad;
        this.departamento = departamento;
    }

    // Getters
    public String getNombre() { return nombre; }
    public double getSalario() { return salario; }
    public int getEdad() { return edad; }
    public String getDepartamento() { return departamento; }
}