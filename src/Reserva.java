import java.util.Date;

public class Reserva {
    private Date fechaInicio;
    private Date fechaFin;
    private double precioTotal;
    private Cliente cliente;
    private Carro carro;

    public Reserva(Date fechaInicio, Date fechaFin, double precioTotal, Cliente cliente, Carro carro) {
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.precioTotal = precioTotal;
        this.cliente = cliente;
        this.carro = carro;
    }

    /* en esta parte del codigo use la clase Date, la cual hace uso de las fechas y horas */


    public Date getFechaInicio() { return fechaInicio; }
    public void setFechaInicio(Date fechaInicio) { this.fechaInicio = fechaInicio; }

    public Date getFechaFin() { return fechaFin; }
    public void setFechaFin(Date fechaFin) { this.fechaFin = fechaFin; }

    public double getPrecioTotal() { return precioTotal; }
    public void setPrecioTotal(double precioTotal) { this.precioTotal = precioTotal; }

    public Cliente getCliente() { return cliente; }
    public void setCliente(Cliente cliente) { this.cliente = cliente; }

    public Carro getCarro() { return carro; }
    public void setCarro(Carro carro) { this.carro = carro; }

    @Override
    public String toString() {
        return "Reserva{" + "fechaInicio=" + fechaInicio + ", fechaFin=" + fechaFin + ", precioTotal=" + precioTotal + ", cliente=" + cliente + ", carro=" + carro + '}';
    }
}
