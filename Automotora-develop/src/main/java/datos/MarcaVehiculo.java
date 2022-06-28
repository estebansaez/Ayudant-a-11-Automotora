package datos;

public enum MarcaVehiculo {
    SUZUKI("Suzuki"),
    TOYOTA("Toyota"),
    CHEVROLET(""),
    NISSAN("Nissan"),
    HYUNDAI("Hyundai"),
    PEUGEOT("Peugeot"),
    MITSUBISHI("Mitsubichi"),
    FORD("Ford"),
    RENAULT("Renault"),
    KIA("Kia");
    private String marcaVehiculo;

    private MarcaVehiculo(String marcaVehiculo) {
        this.marcaVehiculo = marcaVehiculo;
    }

    public String getMarcaVehiculo(){
        return marcaVehiculo;
    }
}
