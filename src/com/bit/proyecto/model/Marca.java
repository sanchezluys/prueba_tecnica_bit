package com.bit.proyecto.model;

public class Marca {
    private String nombre;
    private int nrDeModelos;
    private int anoLanzamiento;
    private String codigoIdentificador;

    public Marca(String nombre, int nrDeModelos, int anoLanzamiento, String codigoIdentificador) {
        if (nombre == null || codigoIdentificador == null) {
            throw new IllegalArgumentException("Los atributos no pueden ser nulos");
        }
        this.nombre = nombre;
        this.nrDeModelos = nrDeModelos;
        this.anoLanzamiento = anoLanzamiento;
        this.codigoIdentificador = codigoIdentificador;
    }

    // Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNrDeModelos() {
        return nrDeModelos;
    }

    public void setNrDeModelos(int nrDeModelos) {
        this.nrDeModelos = nrDeModelos;
    }

    public int getAnoLanzamiento() {
        return anoLanzamiento;
    }

    public void setAnoLanzamiento(int anoLanzamiento) {
        this.anoLanzamiento = anoLanzamiento;
    }

    public String getCodigoIdentificador() {
        return codigoIdentificador;
    }

    public void setCodigoIdentificador(String codigoIdentificador) {
        this.codigoIdentificador = codigoIdentificador;
    }
}
