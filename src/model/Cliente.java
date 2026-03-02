package model;

public class Cliente {
    private String cedula;
    private String nombre;
    private String telefono;

    public Cliente() {}

    public Cliente(String cedula, String nombre, String telefono) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.telefono = telefono;
    }

    // Getters obtiene leer o consultar y Setters establece modi o asignar
    // aqui los intermediarios para darle aceso a los metodos privados como en este caso ced nombre tel
    public String getCedula() { return cedula; }
    public void setCedula(String cedula) { this.cedula = cedula; }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public String getTelefono() { return telefono; }
    public void setTelefono(String telefono) { this.telefono = telefono; }
}
