import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Garaje {
    private String ubicacion;
    private HashMap<String, Carro> carros; // Usamos HashMap para los carros

    public Garaje(String ubicacion) {
        this.ubicacion = ubicacion;
        this.carros = new HashMap<>(); // Inicializamos el HashMap
    }

    public void agregarCarro(Carro carro) { carros.put(carro.getMatricula(), carro); }
    public Carro getCarro(String matricula) { return carros.get(matricula); }
    public List<Carro> getCarros() { return new ArrayList<>(carros.values()); }

    @Override
    public String toString() {
        return "Garaje{" + "ubicacion='" + ubicacion + '\'' + ", carros=" + carros.values() + '}';
    }
}
