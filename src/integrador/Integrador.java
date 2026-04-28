package integrador;

import Vista.VistaPersona;
import Controlador.ControladorJugador;
import Controlador.ControladorArbitro;

public class Integrador {

    public static void main(String[] args) {
        // Crear controladores
        ControladorJugador controladorJugador = new ControladorJugador();
        ControladorArbitro controladorArbitro = new ControladorArbitro();

        // Cargar datos desde archivo
        controladorJugador.cargarJugadoresDesdeArchivo("jugadores.txt");
        controladorArbitro.cargarArbitrosDesdeArchivo("arbitros.txt");

        // Obtener instancia única de la vista y pasar controladores
        VistaPersona vista = VistaPersona.getInstancia();

        // Asumiendo que VistaPersona tiene un método para asignar controladores
        vista.setControladorJugador(controladorJugador);
        vista.setControladorArbitro(controladorArbitro);

        // Mostrar ventana y centrar
        vista.setLocationRelativeTo(null);
        vista.setVisible(true);

        // Guardar datos al cerrar la aplicación
        Runtime.getRuntime().addShutdownHook(new Thread(() -> {
            controladorJugador.guardarJugadoresEnArchivo("jugadores.txt");
            controladorArbitro.guardarArbitrosEnArchivo("arbitros.txt");
        }));
    }
}
