package Modelo;

public class Arbitro extends Persona {

    //Variables
    private int tarjetasSacadas;
    private String internacional;

    //Constructores
    public Arbitro() {
    }

    public Arbitro(int tarjetasSacadas, String internacional, String nombre, String apellido, String fechaNac, String nacionalidad, String dni) {
        super(nombre, apellido, fechaNac, nacionalidad, dni);
        this.tarjetasSacadas = tarjetasSacadas;
        this.internacional = internacional;
    }

    //Setters y Getters
    public int getTarjetasSacadas() {
        return tarjetasSacadas;
    }

    public void setTarjetasSacadas(int tarjetasSacadas) {
        this.tarjetasSacadas = tarjetasSacadas;
    }

    public String getInternacional() {
        return internacional;
    }

    public void setInternacional(String internacional) {
        this.internacional = internacional;
    }

    //toString
    @Override
    public String toString() {
        return super.toString() + "Arbitro - " + "Tarjetas Sacadas: " + tarjetasSacadas + ", Internacional: " + internacional;
    }
}
