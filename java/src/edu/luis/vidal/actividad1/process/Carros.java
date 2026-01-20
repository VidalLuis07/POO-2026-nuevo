package edu.luis.vidal.actividad1.process;

/**
 * esta clase guarda la informacion de los carros
 */

public class Carros {
    private String modelo;
    private int anio;
    private String color;
    private String transmision;
    private int asientos;
    private double precio;

    public Carros(String modelo, int anio, String color,
                  String transmision, int asientos, double precio) {
        this.modelo = modelo;
        this.anio = anio;
        this.color = color;
        this.transmision = transmision;
        this.asientos = asientos;
        this.precio = precio;
    }

    public String getModelo() {
        return modelo;
    }

    public double getPrecio() {
        return precio;
    }

    public String getInformacion() {
        return """
               Modelo: %s
               Año: %d
               Color: %s
               Transmisión: %s
               Asientos: %d
               Precio: $%.2f
               """.formatted(modelo, anio, color, transmision, asientos, precio);
    }
}


