import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/*JUAN MANUEL MEZA
* INGENIERIA EN SISTEMAS 802993*/

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Agencia agencia = new Agencia("Agencia Central", "Calle Principal 123");

        while (true) {
            System.out.println("Menú Principal:");
            System.out.println("1. Agregar Cliente");
            System.out.println("2. Agregar Carro");
            System.out.println("3. Crear Reserva");
            System.out.println("4. Mostrar Clientes");
            System.out.println("5. Mostrar Carros");
            System.out.println("6. Mostrar Reservas");
            System.out.println("7. Salir");
            System.out.print("Seleccione una opción: ");
            int opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese DNI: ");
                    String dni = scanner.nextLine();
                    System.out.print("Ingrese Nombre: ");
                    String nombre = scanner.nextLine();
                    System.out.print("Ingrese Teléfono: ");
                    String telefono = scanner.nextLine();
                    Cliente cliente = new Cliente(dni, nombre, telefono);
                    agencia.agregarCliente(cliente);
                    break;
                case 2:
                    System.out.print("Ingrese Matrícula: ");
                    String matricula = scanner.nextLine();
                    System.out.print("Ingrese Modelo: ");
                    String modelo = scanner.nextLine();
                    System.out.print("Ingrese Color: ");
                    String color = scanner.nextLine();
                    Carro carro = new Carro(matricula, modelo, color);
                    agencia.agregarCarro(carro);
                    break;
                case 3:
                    System.out.print("Ingrese DNI del Cliente: ");
                    String dniCliente = scanner.nextLine();
                    Cliente clienteReserva = agencia.getClientes().stream()
                            .filter(c -> c.getDni().equals(dniCliente))
                            .findFirst()
                            .orElse(null);
                    if (clienteReserva == null) {
                        System.out.println("Cliente no encontrado.");
                        break;
                    }

                    System.out.print("Ingrese Matrícula del Carro: ");
                    String matriculaCarro = scanner.nextLine();
                    Carro carroReserva = agencia.getCarro(matriculaCarro);
                    if (carroReserva == null) {
                        System.out.println("Carro no encontrado.");
                        break;
                    }

                    System.out.print("Ingrese Fecha de Inicio (yyyy-MM-dd): ");
                    String fechaInicioStr = scanner.nextLine();
                    System.out.print("Ingrese Fecha de Fin (yyyy-MM-dd): ");
                    String fechaFinStr = scanner.nextLine();

                    try {
                        Date fechaInicio = new SimpleDateFormat("yyyy-MM-dd").parse(fechaInicioStr);  /* en esta parte del codigo use la clase Date, la cual hace uso de las fechas y horas */
                        Date fechaFin = new SimpleDateFormat("yyyy-MM-dd").parse(fechaFinStr);
                        System.out.print("Ingrese Precio Total: ");
                        double precioTotal = scanner.nextDouble();
                        scanner.nextLine();

                        Reserva reserva = new Reserva(fechaInicio, fechaFin, precioTotal, clienteReserva, carroReserva);
                        agencia.agregarReserva(reserva);
                        System.out.println("Reserva creada ");
                    } catch (ParseException e) {
                        System.out.println("fecha incorrecta ");
                    }
                    break;

                case 4:
                    System.out.println("Clientes:");
                    for (Cliente c : agencia.getClientes()) {
                        System.out.println(c);
                    }
                    break;
                case 5:
                    System.out.println("Carros:");
                    for (Carro c : agencia.getCarros()) {
                        System.out.println(c);
                    }
                    break;
                case 6:
                    System.out.println("Reservas:");
                    for (Reserva r : agencia.getReservas()) {
                        System.out.println(r);
                    }
                    break;
                case 7:
                    System.out.println("Saliendo...");
                    return;
                default:
                    System.out.println("Opción no válida.");
            }
        }
    }
}
