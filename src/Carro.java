public class Carro {
    private String matricula;
    private String modelo;
    private String color;

    public Carro(String matricula, String modelo, String color) {
        this.matricula = matricula;
        this.modelo = modelo;
        this.color = color;
    }

    public String getMatricula() { return matricula; }
    public void setMatricula(String matricula) { this.matricula = matricula; }

    public String getModelo() { return modelo; }
    public void setModelo(String modelo) { this.modelo = modelo; }

    public String getColor() { return color; }
    public void setColor(String color) { this.color = color; }

    @Override
    public String toString() {
        return "Carro{" + "matricula='" + matricula + '\'' + ", modelo='" + modelo + '\'' + ", color='" + color + '\'' + '}';
    }
}
