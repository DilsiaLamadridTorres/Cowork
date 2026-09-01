package com.coworking.cowork.model;

public class Espacio {
    private long id;
    private String nombre;
    private int capacidad;
    private double precioHora;
    private String descripcion;
    private String nombreCategoria;
    private String nombreSede;

    public Espacio() {

    }

    public Espacio(String nombre, int capacidad, double precioHora, String descripcion, String nombreCategoria, String nombreSede) {
       this.nombre = nombre;
        this.capacidad = capacidad;
        this.precioHora = precioHora;
        this.descripcion = descripcion;
        this.nombreCategoria = nombreCategoria;
        this.nombreSede = nombreSede;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public double getPrecioHora() {
        return precioHora;
    }

    public void setPrecioHora(double precioHora) {
        this.precioHora = precioHora;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getNombreCategoria() {
        return nombreCategoria;
    }

    public void setNombreCategoria(String nombreCategoria) {
        this.nombreCategoria = nombreCategoria;
    }

    public String getNombreSede() {
        return nombreSede;
    }

    public void setNombreSede(String nombreSede) {
        this.nombreSede = nombreSede;
    }
}
