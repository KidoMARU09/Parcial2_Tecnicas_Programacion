import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        int opcion;
        Reserva reservaVueloPasajero = new Reserva();
        System.out.println("Escoja una de las siguientes opciones");
        System.out.println(" 1. Buscar vuelos.\n 2. Realizar una reserva. \n 3. Administrar la información del pasajero.");
        opcion = lector.nextInt();
        switch (opcion){
            case 1:
                Vuelo numeroVuelo= new Vuelo( 6787, "Medellin", "Bogotá",53, 1400, "14:00");
                numeroVuelo.getNumeroVuelo(numeroVuelo);
                case 2:
                Reserva fechareservaPasajero = new Reserva();
                reservaVueloPasajero.informacionPsajero();
            case 3:
                Pasajero informacionPasajero = new Pasajero("Carlos", 1321,27,"Silla al lado de la ventana.");
                informacionPasajero.getPreferenciasPasajero();
        }
    }
}