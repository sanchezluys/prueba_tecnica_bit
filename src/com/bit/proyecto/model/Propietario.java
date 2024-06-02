package com.bit.proyecto.model;

import java.time.LocalDate;

public class Propietario {
    private String nombre;
    private LocalDate fechaNacimiento;
    private Direccion direccion;

    public Propietario(String nombre, LocalDate fechaNacimiento, Direccion direccion) {
        if (nombre == null || fechaNacimiento == null || direccion == null) {
            throw new IllegalArgumentException("Los atributos no pueden ser nulos");
        }
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
        this.direccion = direccion;
    }

    // creando los setters y getters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public Direccion getDireccion() {
        return direccion;
    }

    public void setDireccion(Direccion direccion) {
        this.direccion = direccion;
    }

}
