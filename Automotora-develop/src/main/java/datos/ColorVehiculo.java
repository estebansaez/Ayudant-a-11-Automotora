package datos;

public enum ColorVehiculo {
        BLANCO("Blanco"),
        AZUL("Azul"),
        ROJO("Rojo"),
        VERDE("Verde"),
        AMARILLO("Amarillo"),
        NEGRO("Negro"),
        CELESTE("Celeste"),
        PLATEADO("Plateado"),
        NARANJA("Naranja");

        private String colorVehiculo;

        private ColorVehiculo(String colorVehiculo) {
            this.colorVehiculo = colorVehiculo;
        }
        public String getColorVehiculo(){
            return colorVehiculo;
        }
}

