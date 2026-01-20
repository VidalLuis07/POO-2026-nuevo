package edu.luis.vidal.actividad1.data;
import edu.luis.vidal.actividad1.process.Carros;
import java.time.LocalDate;
/**
 *En esta clase es donde se van guardando las elecciones del usuario inccluido su nombre
 *Tambien conseguimmos la fecha del dia presente y la añadimos al ticket
*/
public class Ticket {


    private String nombreCliente;
    private Carros carro;
    private LocalDate fecha;

    public Ticket(String nombreCliente, Carros carro) {
        this.nombreCliente = nombreCliente;
        this.carro = carro;
        this.fecha = LocalDate.now();
    }

    public void imprimirTicket() {
        System.out.println("\n========= TICKET DE VENTA =========");
        System.out.println("Cliente: " + nombreCliente);
        System.out.println("Fecha: " + fecha);
        System.out.println("----------------------------------");
        System.out.println(carro.getInformacion());
        System.out.println("TOTAL A PAGAR: $" + carro.getPrecio());
        System.out.println("==================================");
    }
}
