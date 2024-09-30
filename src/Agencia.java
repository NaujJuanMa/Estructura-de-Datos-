import java.util.ArrayList;
import java.util.List;

public class Agencia {
    private String nombre;
    private String direccion;
    private List<Carro> carros;
    private List<Cliente> clientes;
    private List<Reserva> reservas;

    public Agencia(String nombre, String direccion) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.carros = new ArrayList<>();
        this.clientes = new ArrayList<>();
        this.reservas = new ArrayList<>();
    }

    // Métodos para agregar y obtener carros, clientes y reservas
    public void agregarCarro(Carro carro) { carros.add(carro); }
    public void agregarCliente(Cliente cliente) { clientes.add(cliente); }
    public void agregarReserva(Reserva reserva) { reservas.add(reserva); }

    public List<Carro> getCarros() { return carros; }
    public List<Cliente> getClientes() { return clientes; }
    public List<Reserva> getReservas() { return reservas; }

    @Override
    public String toString() {
        return "Agencia{" + "nombre='" + nombre + '\'' + ", direccion='" + direccion + '\'' + ", carros=" + carros + ", clientes=" + clientes + ", reservas=" + reservas + '}';
    }
}
