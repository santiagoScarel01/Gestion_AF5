package Modelo;

public class Persona {

    //Variables
    private String nombre;
    private String apellido;
    private String fechaNac;
    private String nacionalidad;
    private String dni;

    //Constructores
    public Persona() {
    }

    public Persona(String nombre, String apellido, String fechaNac, String nacionalidad, String dni) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.fechaNac = fechaNac;
        this.nacionalidad = nacionalidad;
        this.dni = dni;
    }

    //Setters y Getters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getFechaNac() {
        return fechaNac;
    }

    public void setFechaNac(String fechaNac) {
        this.fechaNac = fechaNac;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    //toString
    @Override
    public String toString() {
        return "Persona - " + "Nombre: " + nombre + ", Apellido: " + apellido + ", Fecha de Nacimiento: " + fechaNac + ", Nacionalidad: " + nacionalidad + ", DNI: " + dni;
    }
}
