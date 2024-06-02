package com.bit.proyecto;

import com.bit.proyecto.test.FacturaTest;

public class Main {
    public static void main(String[] args) {
        //
        // // emoticones: ⚠️🔥📝✅❎📂⚙️🏷️📦📆🗓️🕑🏁➡️⬆️🎁🛒🛍️✏️🖍️✂️🔒🔓🚗✈️🛞
        System.out.println("╔════════════════════════════════════════════════════════╗");
        System.out.println("║ BIT INSTITUTE  JUNIO 2024  BY: SANCHEZLUYS             ║");
        System.out.println("║ PRUEBA TECNICA  *PROYECTO 2*                           ║");
        System.out.println("╠════════════════════════════════════════════════════════╣");
        System.out.println("║ JAVA  SDK 17                                           ║");
        System.out.println("╚════════════════════════════════════════════════════════╝");
        //
        FacturaTest prueba = new FacturaTest();
        prueba.revisarFactura();
    }

}