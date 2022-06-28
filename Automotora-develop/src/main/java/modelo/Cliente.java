package modelo;
public class Cliente extends Persona {

    private String direccion, correoElectronico, numTelefono;
    private boolean primeraCompra;

    public Cliente(String nombre, String rut, String numTelefono, String direccion, String correoElectronico){
        super(nombre, rut);
        this.numTelefono= numTelefono;
        this.direccion= direccion;
        this.correoElectronico=correoElectronico;
        this.primeraCompra=true;
    }

    public String getDireccion(){
        return direccion;
    }
    public void setDireccion(String direccion){
        this.direccion= direccion;
    }
    public String getCorreoElectronico(){
        return correoElectronico;
    }
    public void setCorreoElectronico(String correoElectronico){
        this.correoElectronico=correoElectronico;
    }
    public String getNumTelefono(){
        return numTelefono;
    }
    public void setNumTelefono(String numTelefono){
        this.numTelefono=numTelefono;
    }

    public double obtenerDescuento(){
        if(this.primeraCompra=true){
            this.primeraCompra=false;
            return 0.8;
        }else {
            return 1;
        }
    }
    @Override
    public String toString(){
        return super.nombre+","+this.direccion+","+this.numTelefono+","+this.correoElectronico+","+super.rut;
    }
}
