package com.bit.proyecto.test;

import com.bit.proyecto.model.Factura;

public class FacturaTest {
    public void revisarFactura() {
        // Crear instancia de Factura
        Factura factura = new Factura("001", "Teclado mecánico", 5, 49.99);
        // // emoticones: ⚠️🔥📝✅❎📂⚙️🏷️📦📆🗓️🕑🏁➡️⬆️🎁🛒🛍️✏️🖍️✂️🔒🔓🚗✈️🛞
        // 📤📥📆📊⚙️🧲📡🔋🎯🎲🎗️🧮📌📍☯️♻️🏁🚩
        // Mostrar los valores iniciales
        System.out.println("\uD83C\uDFF7\uFE0F Número de factura: " + factura.getNumero());
        System.out.println("✏\uFE0F Descripción: " + factura.getDescripcion());
        System.out.println("\uD83D\uDCE6 Cantidad comprada: " + factura.getCantidad());
        System.out.println("\uD83C\uDFB2 Precio por artículo: " + factura.getPrecioPorArticulo());
        System.out.println("\uD83D\uDD25 Monto total de la factura: " + factura.getTotalFactura());

        // Modificar los valores
        Integer cantidad=-3;
        Double precio=-29.99;
        factura.setCantidad(cantidad); // Prueba de cantidad no positiva
        factura.setPrecioPorArticulo(precio); // Prueba de precio no positivo

        // Mostrar los valores después de modificar
        System.out.println("\nDespués de modificar usando los datos:");
        System.out.println("❎ Cantidad= "+cantidad+"\n"+"❎ Precio Ariculo: "+precio);
        System.out.println("******************");
        System.out.println("Cantidad comprada: " + factura.getCantidad()); // Debería ser 0
        System.out.println("Precio por artículo: " + factura.getPrecioPorArticulo()); // Debería ser 0.0
        System.out.println("Monto total de la factura: "+ factura.getTotalFactura()); // Debería ser 0.0
    }
}
