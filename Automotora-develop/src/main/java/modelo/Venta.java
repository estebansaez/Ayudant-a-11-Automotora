package modelo;

import java.util.Calendar;
import java.util.Date;

public class Venta {
    private Vendedor vendedor;
    private Persona cliente;
    private Date fecha;
    private Vehiculo vehiculo;

    public Venta(Vendedor vendedor, Persona Cliente, Vehiculo vehiculo) {
        this.vendedor = vendedor;
        this.cliente = cliente;
        this.vehiculo = vehiculo;
        this.fecha = new Date();
    }

    public Vendedor getVendedor() {
        return vendedor;
    }

    public Persona getCliente() {
        return cliente;
    }

    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    public Date getFecha() {
        Date Fecha = Calendar.getInstance().getTime();
        return Fecha;
    }
}
