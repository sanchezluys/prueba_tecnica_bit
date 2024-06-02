package com.bit.proyecto.model;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Factura {
    private String numero;
    private String descripcion;
    private int cantidad;
    private double precioPorArticulo;

    // Constructor
    public Factura(String numero, String descripcion, int cantidad, double precioPorArticulo) {
        this.numero = numero;
        this.descripcion = descripcion;
        this.cantidad = cantidad > 0 ? cantidad : 0; // Establecer a 0 si no es positivo
        this.precioPorArticulo = precioPorArticulo > 0.0 ? precioPorArticulo : 0.0; // Establecer a 0.0 si no es positivo
    }

    // Métodos get y set para número
    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    // Métodos get y set para descripción
    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    // Métodos get y set para cantidad
    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad > 0 ? cantidad : 0; // Establecer a 0 si no es positivo
    }

    // Métodos get y set para precio por artículo
    public double getPrecioPorArticulo() {
        return precioPorArticulo;
    }

    public void setPrecioPorArticulo(double precioPorArticulo) {
        this.precioPorArticulo = precioPorArticulo > 0.0 ? precioPorArticulo : 0.0; // Establecer a 0.0 si no es positivo
    }

    // Método para calcular el monto total de la factura
    public double getTotalFactura() {
        double total = cantidad * precioPorArticulo;
        BigDecimal bd = new BigDecimal(total).setScale(2, RoundingMode.HALF_UP);
        return bd.doubleValue();
    }
}
