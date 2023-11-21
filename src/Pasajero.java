public class Pasajero {
    private String nombre;
    private int numeroPasaporte;
    private int edad;
    private String preferenciasPasajero;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNumeroPasaporte() {
        return numeroPasaporte;
    }

    public void setNumeroPasaporte(int numeroPasaporte) {
        this.numeroPasaporte = numeroPasaporte;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getPreferenciasPasajero() {
        return preferenciasPasajero;
    }

    public void setPreferenciasPasajero(String preferenciasPasajero) {
        this.preferenciasPasajero = preferenciasPasajero;
    }

    public Pasajero(String nombre, int numeroPasaporte, int edad, String preferenciasPasajero) {
        this.nombre = nombre;
        this.numeroPasaporte = numeroPasaporte;
        this.edad = edad;
        this.preferenciasPasajero = preferenciasPasajero;
    }
}
