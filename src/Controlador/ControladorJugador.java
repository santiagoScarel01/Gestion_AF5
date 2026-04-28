package Controlador;

import Modelo.Jugador;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import javax.swing.JOptionPane;

public class ControladorJugador {

    private Jugador jugador = new Jugador();
    private static final Map<String, Jugador> mapaJugadores = new HashMap<>();

    public ControladorJugador() {
        jugador = new Jugador(); // instanciás el jugador 
    }

    //Setters y Getters
    public void setNombre(String n) {
        jugador.setNombre(n);
    }

    public String getNombre() {
        return jugador.getNombre();
    }

    public void setApellido(String a) {
        jugador.setApellido(a);
    }

    public String getApellido() {
        return jugador.getApellido();
    }

    public void setFechaNac(String f) {
        jugador.setFechaNac(f);
    }

    public String getFechaNac() {
        return jugador.getFechaNac();
    }

    public void setNacionalidad(String na) {
        jugador.setNacionalidad(na);
    }

    public String getNacionalidad() {
        return jugador.getNacionalidad();
    }

    public void setDni(String dni) {
        jugador.setDni(dni);
    }

    public String getDni() {
        return jugador.getDni();
    }

    public void setClubActual(String ca) {
        jugador.setClubActual(ca);
    }

    public String getClubActual() {
        return jugador.getClubActual();
    }

    public void setPosicion(String po) {
        jugador.setPosicion(po);
    }

    public String getPosicion() {
        return jugador.getPosicion();
    }

    public void setGoles(int cg) {
        jugador.setGoles(cg);
    }

    public int getGoles() {
        return jugador.getGoles();
    }

    public void setTarjetasAma(int am) {
        jugador.setTarjetasAma(am);
    }

    public int getTarjetasAma() {
        return jugador.getTarjetasAma();
    }

    public void setTarjetasRoj(int rj) {
        jugador.setTarjetasRoj(rj);
    }

    public int getTarjetasRoj() {
        return jugador.getTarjetasRoj();
    }

    public Jugador getJugador() {
        return jugador;
    }

    //Funciones
    public void agregarJugador(String dni, Jugador jugador) {
        mapaJugadores.put(dni, jugador);
    }

    public boolean existeJugador(String dni) {
        return mapaJugadores.containsKey(dni);
    }

    public void mostrarJugadores() {
        for (Jugador j : mapaJugadores.values()) {
            System.out.println(j);
        }
    }

    public static Collection<Jugador> obtenerTodosLosJugadores() {
        return mapaJugadores.values();
    }

    public boolean eliminarJugadorMapa(String dni) {
        return (mapaJugadores.remove(dni) != null);
    }

    public int eliminarJugadorSiEsValido(String dni) {
        Jugador jugador = buscarJugadorPorDni(dni);
        if (jugador == null) {
            return 1; // No encontrado
        }
        int confirmacion = JOptionPane.showConfirmDialog(null,
                "¿Está seguro que desea eliminar al jugador?",
                "Confirmar Eliminación",
                JOptionPane.YES_NO_OPTION);

        if (confirmacion != JOptionPane.YES_OPTION) {
            return 3; // Cancelado
        }

        String club = jugador.getClubActual();
        int cant = contarJugadoresPorEquipo(club);
        // DEBUG: mostrar cantidad de jugadores en el equipo antes de eliminar
        System.out.println("Cantidad de jugadores en equipo '" + club + "': " + cant);

        if (cant <= 5) {
            return 2; // No puede eliminar
        }
        boolean eliminado = eliminarJugadorMapa(dni);
        if (eliminado) {
            return 4; // Eliminado
        } else {
            return 5; // Fallo
        }
    }

    public int contarJugadoresPorEquipo(String equipo) {
        int contador = 0;
        for (Jugador jugador : mapaJugadores.values()) {
            if (jugador.getClubActual().equals(equipo)) {
                contador++;
            }
        }
        return contador;
    }

    public boolean modificarJugador(String dni, String po, String cg, String tj) {
        for (Jugador j : mapaJugadores.values()) {
            if (j.getDni().equals(dni)) {
                boolean modificado = false;

                if (!po.equals("Seleccione una opción...") && !po.equals(j.getPosicion())) {
                    j.setPosicion(po);
                    modificado = true;
                }
                if (!cg.equals("")) {
                    int nuevoG = Integer.parseInt(cg);
                    if (nuevoG != j.getGoles()) {
                        j.setGoles(nuevoG);
                        modificado = true;
                    }
                }
                if (!tj.equals("")) {
                    int nuevasT = Integer.parseInt(tj);
                    if (nuevasT != j.getTarjetasAma()) {
                        j.setTarjetasAma(nuevasT);
                        modificado = true;
                    }
                }
                return modificado;
            }
        }
        return false;
    }

    public Jugador buscarJugadorPorDni(String dni) {
        return mapaJugadores.get(dni);
    }

    public static List<Object[]> obtenerDatosTablaJugadores() {
        List<Object[]> filas = new ArrayList<>();

        for (Jugador j : obtenerTodosLosJugadores()) {
            filas.add(new Object[]{
                j.getNombre(),
                j.getApellido(),
                j.getFechaNac(),
                j.getNacionalidad(),
                j.getDni(),
                j.getClubActual(),
                j.getPosicion(),
                j.getGoles(),
                j.getTarjetasAma(),
                j.getTarjetasRoj()
            });
        }
        return filas;
    }

    public String obtenerPosicionJugador(String dni) {
        Jugador jugador = mapaJugadores.get(dni);
        if (jugador != null) {
            return jugador.getPosicion();
        }
        return null; // o lanzar una excepción si querés forzar que el jugador exista
    }

    public static List<Object[]> obtenerJugadoresPorEquipo(String equipo) {
        List<Object[]> filas = new ArrayList<>();

        for (Jugador j : mapaJugadores.values()) {
            if (j.getClubActual().equalsIgnoreCase(equipo.trim())) {
                filas.add(new Object[]{
                    j.getNombre(),
                    j.getApellido(),
                    j.getFechaNac(),
                    j.getNacionalidad(),
                    j.getDni(),
                    j.getClubActual(),
                    j.getPosicion(),
                    j.getGoles(),
                    j.getTarjetasAma(),
                    j.getTarjetasRoj()
                });
            }
        }

        return filas;
    }

    public List<Object[]> obtenerJugadorConMasExpulsiones() {
        List<Object[]> resultado = new ArrayList<>();
        int maxRojas = -1;

        for (Jugador j : mapaJugadores.values()) {
            int rojas = j.getTarjetasRoj();
            if (rojas > maxRojas) {
                resultado.clear();
                resultado.add(new Object[]{
                    j.getNombre(),
                    j.getApellido(),
                    j.getFechaNac(),
                    j.getNacionalidad(),
                    j.getDni(),
                    j.getClubActual(),
                    j.getPosicion(),
                    j.getGoles(),
                    j.getTarjetasAma(),
                    j.getTarjetasRoj()
                });
                maxRojas = rojas;
            } else if (rojas == maxRojas) {
                resultado.add(new Object[]{
                    j.getNombre(),
                    j.getApellido(),
                    j.getFechaNac(),
                    j.getNacionalidad(),
                    j.getDni(),
                    j.getClubActual(),
                    j.getPosicion(),
                    j.getGoles(),
                    j.getTarjetasAma(),
                    j.getTarjetasRoj()
                });
            }
        }

        return resultado;
    }

    public List<Object[]> obtenerJugadoresConGolesMayoresQue(int cantidad) {
        List<Object[]> jugadores = new ArrayList<>();

        for (Jugador j : mapaJugadores.values()) {
            if (j.getGoles() > cantidad) {
                jugadores.add(new Object[]{
                    j.getNombre(),
                    j.getApellido(),
                    j.getFechaNac(),
                    j.getNacionalidad(),
                    j.getDni(),
                    j.getClubActual(),
                    j.getPosicion(),
                    j.getGoles(),
                    j.getTarjetasAma(),
                    j.getTarjetasRoj(),});
            }
        }
        return jugadores;
    }

    public static List<Object[]> obtenerFilasPorPosicion(String posicion) {
        List<Object[]> filas = new ArrayList<>();

        for (Jugador j : mapaJugadores.values()) {
            if (j.getPosicion().equalsIgnoreCase(posicion.trim())) {
                filas.add(new Object[]{
                    j.getNombre(),
                    j.getApellido(),
                    j.getFechaNac(),
                    j.getNacionalidad(),
                    j.getDni(),
                    j.getClubActual(),
                    j.getPosicion(),
                    j.getGoles(),
                    j.getTarjetasAma(),
                    j.getTarjetasRoj()
                });
            }
        }
        return filas;
    }

    public void guardarJugadoresEnArchivo(String ruta) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(ruta))) {
            for (Jugador j : mapaJugadores.values()) {
                bw.write(j.getNombre() + "," + j.getApellido() + "," + j.getFechaNac() + ","
                        + j.getNacionalidad() + "," + j.getDni() + "," + j.getClubActual() + "," + j.getPosicion() + ","
                        + j.getGoles() + "," + j.getTarjetasAma() + "," + j.getTarjetasRoj());
                bw.newLine();
            }
        } catch (IOException e) {
            System.out.println("Error al guardar jugadores: " + e.getMessage());
        }
    }

    public void cargarJugadoresDesdeArchivo(String ruta) {
        mapaJugadores.clear();
        try (BufferedReader br = new BufferedReader(new FileReader(ruta))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                String[] p = linea.split(",");
                if (p.length == 10) {
                    try {
                        Jugador j = new Jugador(
                                p[5], // clubActual
                                p[6], // posicion
                                Integer.parseInt(p[7].trim()), // goles
                                Integer.parseInt(p[8].trim()), // tarjetasAma
                                Integer.parseInt(p[9].trim()), // tarjetasRoj
                                p[0], // nombre
                                p[1], // apellido
                                p[2], // fechaNac
                                p[3], // nacionalidad
                                p[4] // dni
                        );
                        mapaJugadores.put(p[4], j); // clave dni
                    } catch (NumberFormatException e) {
                        System.out.println("Error parseando numeros en linea: " + linea);
                    }
                } else {
                    System.out.println("Linea con formato incorrecto: " + linea);
                }
            }
        } catch (IOException e) {
            System.out.println("No se pudo cargar jugadores: " + e.getMessage());
        }
    }
}
