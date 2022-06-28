package modelo;

import modelo.Persona;

public class Vendedor extends Persona {

    private int edad;

    public Vendedor(String nombre, String rut, int edad){
        super(nombre, rut);
        this.edad=edad;
    }

    public String getNombre(){return nombre;}

    public int getEdad(){return edad;}

    @Override
    public String toString(){
        return super.nombre+","+super.rut+","+this.edad;
    }

    @Override
    public double obtenerDescuento(){
        return 0.9;
    }
}
