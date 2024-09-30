import java.util.ArrayList;
import java.util.List;

public class Garaje {
    private String ubicacion;
    private List<Carro> carros;

    public Garaje(String ubicacion) {
        this.ubicacion = ubicacion;
        this.carros = new ArrayList<>();
    }

    // Métodos para agregar y obtener carros
    public void agregarCarro(Carro carro) { carros.add(carro); }
    public List<Carro> getCarros() { return carros; }

    @Override
    public String toString() {
        return "Garaje{" + "ubicacion='" + ubicacion + '\'' + ", carros=" + carros + '}';
    }
}
