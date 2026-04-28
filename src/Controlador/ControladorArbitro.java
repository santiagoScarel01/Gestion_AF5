package Controlador;

import Modelo.Arbitro;
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

public class ControladorArbitro {

    private Arbitro arbitro = new Arbitro();
    private static final Map<String, Arbitro> mapaArbitros = new HashMap<>();

    public ControladorArbitro() {
        arbitro = new Arbitro(); // instanciás el jugador 
    }

    //Setters y Getters
    public void setNombre(String n) {
        arbitro.setNombre(n);
    }

    public String getNombre() {
        return arbitro.getNombre();
    }

    public void setApellido(String a) {
        arbitro.setApellido(a);
    }

    public String getApellido() {
        return arbitro.getApellido();
    }

    public void setFechaNac(String f) {
        arbitro.setFechaNac(f);
    }

    public String getFechaNac() {
        return arbitro.getFechaNac();
    }

    public void setNacionalidad(String na) {
        arbitro.setNacionalidad(na);
    }

    public String getNacionalidad() {
        return arbitro.getNacionalidad();
    }

    public void setDni(String dni) {
        arbitro.setDni(dni);
    }

    public String getDni() {
        return arbitro.getDni();
    }

    public void setTarjetasSacadas(int tj) {
        arbitro.setTarjetasSacadas(tj);
    }

    public int getTarjetasSacadas() {
        return arbitro.getTarjetasSacadas();
    }

    public void setInternacional(String in) {
        arbitro.setInternacional(in);
    }

    public String getInternacional() {
        return arbitro.getInternacional();
    }

    public Arbitro getArbitro() {
        return arbitro;
    }

    public void setArbitro(Arbitro arbitro) {
        this.arbitro = arbitro;
    }

    //
    public void agregarArbitro(String dni, Arbitro arbitro) {
        mapaArbitros.put(dni, arbitro);
    }

    public boolean existeArbitro(String dni) {
        return mapaArbitros.containsKey(dni);
    }

    public static Collection<Arbitro> obtenerTodosLosArbitros() {
        return mapaArbitros.values();
    }

    public boolean modificarArbitro(String dni, String tarjetas, String internacional) {
        Arbitro arbitro = mapaArbitros.get(dni);

        if (arbitro == null) {
            return false;
        }

        if (!tarjetas.isEmpty()) {
            try {
                int cantidadTarjetas = Integer.parseInt(tarjetas);
                arbitro.setTarjetasSacadas(cantidadTarjetas);
            } catch (NumberFormatException e) {
                return false;
            }
        }

        if (!internacional.equals("Seleccione una opción...")) {
            arbitro.setInternacional(internacional);
        }
        return true;
    }

    public boolean eliminarArbitroSiExiste(String dni) {
        if (!mapaArbitros.containsKey(dni)) {
            return false;
        }
        mapaArbitros.remove(dni);
        return true;
    }

    public static List<Object[]> obtenerDatosTablaArbitros() {
        List<Object[]> filas = new ArrayList<>();

        for (Arbitro a : obtenerTodosLosArbitros()) {
            filas.add(new Object[]{
                a.getNombre(),
                a.getApellido(),
                a.getFechaNac(),
                a.getNacionalidad(),
                a.getDni(),
                a.getTarjetasSacadas(),
                a.getInternacional()
            });
        }
        return filas;
    }

    public static List<Object[]> obtenerDatosPorInternacionalidad(String internacional) {
        List<Object[]> filas = new ArrayList<>();

        for (Arbitro a : obtenerTodosLosArbitros()) {
            if (a.getInternacional().equalsIgnoreCase(internacional)) {
                filas.add(new Object[]{
                    a.getNombre(),
                    a.getApellido(),
                    a.getFechaNac(),
                    a.getNacionalidad(),
                    a.getDni(),
                    a.getTarjetasSacadas(),
                    a.getInternacional()
                });
            }
        }
        return filas;
    }

    public void guardarArbitrosEnArchivo(String ruta) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(ruta))) {
            for (Arbitro a : mapaArbitros.values()) {
                bw.write(a.getNombre() + "," + a.getApellido() + "," + a.getFechaNac() + ","
                        + a.getNacionalidad() + "," + a.getDni() + "," + a.getTarjetasSacadas() + "," + a.getInternacional());
                bw.newLine();
            }
        } catch (IOException e) {
            System.out.println("Error al guardar arbitros: " + e.getMessage());
        }
    }

    public void cargarArbitrosDesdeArchivo(String ruta) {
        mapaArbitros.clear();
        try (BufferedReader br = new BufferedReader(new FileReader(ruta))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                String[] partes = linea.split(",");
                if (partes.length == 7) {
                    // partes[0]=nombre, partes[1]=apellido, partes[2]=fechaNac, partes[3]=nacionalidad
                    // partes[4]=dni, partes[5]=tarjetas, partes[6]=internacional
                    Arbitro a = new Arbitro(
                            Integer.parseInt(partes[5]), // tarjetas
                            partes[6], // internacional (String)
                            partes[0], partes[1], partes[2], // nombre, apellido, fecha
                            partes[3], partes[4] // nacionalidad, dni
                    );
                    mapaArbitros.put(partes[4], a); // usar el DNI como clave
                }
            }
        } catch (IOException e) {
            System.out.println("No se pudo cargar arbitros: " + e.getMessage());
        }
    }
}
