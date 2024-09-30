import java.util.Scanner;

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
