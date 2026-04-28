package Modelo;

public class Jugador extends Persona {

    //Variables
    private String clubActual;
    private String posicion;
    private int goles;
    private int tarjetasAma;
    private int tarjetasRoj;

    //Constructores
    public Jugador() {
    }

    public Jugador(String clubActual, String posicion, int goles, int tarjetasAma, int tarjetasRoj, String nombre, String apellido, String fechaNac, String nacionalidad, String dni) {
        super(nombre, apellido, fechaNac, nacionalidad, dni);
        this.clubActual = clubActual;
        this.posicion = posicion;
        this.goles = goles;
        this.tarjetasAma = tarjetasAma;
        this.tarjetasRoj = tarjetasRoj;
    }

    //Setters y Getters
    public String getClubActual() {
        return clubActual;
    }

    public void setClubActual(String clubActual) {
        this.clubActual = clubActual;
    }

    public String getPosicion() {
        return posicion;
    }

    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }

    public int getGoles() {
        return goles;
    }

    public void setGoles(int goles) {
        this.goles = goles;
    }

    public int getTarjetasAma() {
        return tarjetasAma;
    }

    public void setTarjetasAma(int tarjetasAma) {
        this.tarjetasAma = tarjetasAma;
    }

    public int getTarjetasRoj() {
        return tarjetasRoj;
    }

    public void setTarjetasRoj(int tarjetasRoj) {
        this.tarjetasRoj = tarjetasRoj;
    }

    //toString
    @Override
    public String toString() {
        return super.toString() + "Jugador - " + "Club actual:" + clubActual + ", Posicion: " + posicion + ", Goles: " + goles + ", Tarjetas Amarillas: " + tarjetasAma + ", Tarjetas Rojas: " + tarjetasRoj;
    }
}
