import java.util.ArrayList;

public class Reserva {
    private ArrayList<Vuelo> informacionVuelo;
    private ArrayList<Reserva> informacionReserva;
    private ArrayList<Pasajero> informacionPasajero;

    public Reserva() {
        this.informacionVuelo= new ArrayList<>();
        this.informacionReserva= new ArrayList<>();
        this.informacionPasajero= new ArrayList<>();
    }
    public void bucarVuelo(Vuelo numeroVuelo, Vuelo origen, Vuelo destino, Vuelo capacidadMaximaPasajeros,Vuelo fecha, Vuelo horaDeSalida){
        informacionVuelo.add(numeroVuelo);
        informacionVuelo.add(origen);
        informacionVuelo.add(destino);
        informacionVuelo.add(capacidadMaximaPasajeros);
        informacionVuelo.add(fecha);
        informacionVuelo.add(horaDeSalida);
    }
    public void informacionPasajero(Pasajero nombre, Pasajero numeroPasaporte, Pasajero edad, Pasajero preferencia){
        informacionPasajero.add(nombre);
        informacionPasajero.add(numeroPasaporte);
        informacionPasajero.add(edad);
        informacionPasajero.add(preferencia);
    }
    public void realizarReserva(String numeroVuelo, String origen, String destino, int capacidadMaxima, int fecha, String horaSalida){

    }

}
