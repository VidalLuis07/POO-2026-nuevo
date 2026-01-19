package edu.luis.vidal.actividad1.ui;
import edu.luis.vidal.actividad1.process.Carros;
import edu.luis.vidal.actividad1.data.Ticket;
import java.util.Scanner;
public class Menu {

    private Scanner scanner = new Scanner(System.in);
    private Carros[] carros;
    private String nombreCliente;

    public Menu() {
        carros = new Carros[]{
                new Carros("Nissan Tsuru", 2008, "Blanco", "Manual", 5, 85000),
                new Carros("Nissan Versa", 2016, "Gris", "Automática", 5, 180000),
                new Carros("Nissan Sentra", 2019, "Negro", "Automática", 5, 260000),
                new Carros("Nissan Altima", 2021, "Rojo", "Automática", 5, 420000),
                new Carros("Nissan Maxima", 2023, "Azul", "Automática", 5, 620000)
        };
    }

    public void iniciar() {
        pedirNombre();
        mostrarMenu();
    }

    private void pedirNombre() {
        do {
            System.out.print("Ingrese su nombre: ");
            nombreCliente = scanner.nextLine();
        } while (nombreCliente.isBlank());
    }

    private void mostrarMenu() {
        int opcion;
        do {
            System.out.println("\n--- CATÁLOGO DE VEHÍCULOS ---");
            for (int i = 0; i < carros.length; i++) {
                System.out.println((i + 1) + ". " + carros[i].getModelo());
            }
            System.out.println("0. Salir");
            System.out.print("Seleccione un auto: ");
            opcion = scanner.nextInt();

            if (opcion > 0 && opcion <= carros.length) {
                mostrarInformacionCarro(carros[opcion - 1]);
            }

        } while (opcion != 0);
    }

    private void mostrarInformacionCarro(Carros carro) {
        System.out.println("\n--- INFORMACIÓN DEL VEHÍCULO ---");
        System.out.println(carro.getInformacion());
        System.out.print("¿Desea comprar este vehículo? (1 = Sí, 2 = No): ");
        int decision = scanner.nextInt();

        if (decision == 1) {
            Ticket ticket = new Ticket(nombreCliente, carro);
            ticket.imprimirTicket();
            System.exit(0);
        }
    }
}
