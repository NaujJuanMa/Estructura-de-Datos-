import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Agencia {
    private String nombre;
    private String direccion;
    private List<Cliente> clientes;
    private List<Reserva> reservas;
    private HashMap<String, Carro> carros;

    public Agencia(String nombre, String direccion) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.clientes = new ArrayList<>();
        this.reservas = new ArrayList<>();
        this.carros = new HashMap<>();
    }

    public void agregarCarro(Carro carro) { carros.put(carro.getMatricula(), carro); }
    public void agregarCliente(Cliente cliente) { clientes.add(cliente); }
    public void agregarReserva(Reserva reserva) { reservas.add(reserva); }

    public Carro getCarro(String matricula) { return carros.get(matricula); }
    public List<Carro> getCarros() { return new ArrayList<>(carros.values()); }
    public List<Cliente> getClientes() { return clientes; }
    public List<Reserva> getReservas() { return reservas; }

    @Override
    public String toString() {
        return "Agencia{" + "nombre='" + nombre + '\'' + ", direccion='" + direccion + '\'' + ", carros=" + carros.values() + ", clientes=" + clientes + ", reservas=" + reservas + '}';
    }
}
