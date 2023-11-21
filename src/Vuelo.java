public class Vuelo {
    private int numeroVuelo;
    private String origen;
    private String destino;
    private int capacidadMaximaPasajeros;
    private int fecha;
    private String horaDeSalida;

    public void setHoraDeSalida(String horaDeSalida) {
        this.horaDeSalida = horaDeSalida;
    }

    public int getNumeroVuelo(Vuelo numeroVuelo) {
        return this.numeroVuelo;
    }

    public void setNumeroVuelo(int numeroVuelo) {
        this.numeroVuelo = numeroVuelo;
    }

    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public int getCapacidadMaximaPasajeros() {
        return capacidadMaximaPasajeros;
    }

    public void setCapacidadMaximaPasajeros(int capacidadMaximaPasajeros) {
        this.capacidadMaximaPasajeros = capacidadMaximaPasajeros;
    }

    public int getFecha() {
        return fecha;
    }

    public void setFecha(int fecha) {
        this.fecha = fecha;
    }



    public Vuelo(int numeroVuelo, String origen, String destino, int capacidadMaximaPasajeros, int fecha, String horaDeSalida) {
        this.numeroVuelo = numeroVuelo;
        this.origen = origen;
        this.destino = destino;
        this.capacidadMaximaPasajeros = capacidadMaximaPasajeros;
        this.fecha = fecha;
        this.horaDeSalida = horaDeSalida;
    }
}
