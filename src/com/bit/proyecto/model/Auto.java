package com.bit.proyecto.model;

public class Auto {
    private String modelo;
    private String color;
    private int ano;
    private Marca marca;
    private String chasis;
    private Propietario propietario;
    private int velocidadMaxima;
    private int velocidadActual;
    private int numeroDePuertas;
    private boolean tieneTechoSolar;
    private int numeroDeMarchas;
    private boolean tieneTransmisionAutomatica;

    public Auto(String modelo, String color, int ano, Marca marca, String chasis, Propietario propietario,
                int velocidadMaxima, int numeroDePuertas, boolean tieneTechoSolar, int numeroDeMarchas,
                boolean tieneTransmisionAutomatica) {
        if (modelo == null || color == null || marca == null || chasis == null || propietario == null) {
            throw new IllegalArgumentException("Los atributos no pueden ser nulos");
        }
        this.modelo = modelo;
        this.color = color;
        this.ano = ano;
        this.marca = marca;
        this.chasis = chasis;
        this.propietario = propietario;
        this.velocidadMaxima = velocidadMaxima;
        this.velocidadActual = 0;
        this.numeroDePuertas = numeroDePuertas;
        this.tieneTechoSolar = tieneTechoSolar;
        this.numeroDeMarchas = numeroDeMarchas;
        this.tieneTransmisionAutomatica = tieneTransmisionAutomatica;
    }

    // Getters y Setters
    // ...

    public void acelerar() {
        if (velocidadActual < velocidadMaxima) {
            velocidadActual++;
        }
    }

    public void frenar() {
        velocidadActual = 0;
    }

    public void cambiarMarcha(int nuevaMarcha) {
        if (nuevaMarcha >= 0 && nuevaMarcha <= numeroDeMarchas) {
            if (nuevaMarcha == 0 && velocidadActual > 0) {
                throw new IllegalArgumentException("No se puede engranar la marcha atrás si la velocidad supera los 0 km/h");
            }
            // Aquí se implementaría la lógica para cambiar de marcha
        }
    }

    public void reducirMarcha(int marchaAnterior) {
        if (marchaAnterior > 0 && marchaAnterior <= numeroDeMarchas) {
            // Aquí se implementaría la lógica para reducir de marcha
        }
    }

    public double calcularAutonomia(double consumoMedio) {
        if (consumoMedio <= 0) {
            throw new IllegalArgumentException("El consumo medio debe ser mayor que 0");
        }
        // Supongamos que tenemos un atributo `double capacidadTanque`
        double capacidadTanque = 50; // Por ejemplo, 50 litros
        return capacidadTanque / consumoMedio * 100; // Devuelve la autonomía en km
    }

    public double mostrarVolumenCombustible() {
        // Supongamos que tenemos un atributo `double capacidadTanque`
        double capacidadTanque = 50; // Por ejemplo, 50 litros
        return capacidadTanque;
    }

    public Propietario getPropietario() {
        return propietario;
    }

    public Marca getMarca() {
        return marca;
    }

    public String getVelocidadActual() {
        return String.valueOf(velocidadActual);

    }
}
