import com.bit.proyecto.model.Auto;
import com.bit.proyecto.model.Direccion;
import com.bit.proyecto.model.Marca;
import com.bit.proyecto.model.Propietario;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        //
        // // emoticones: ⚠️🔥📝✅❎📂⚙️🏷️📦📆🗓️🕑🏁➡️⬆️🎁🛒🛍️✏️🖍️✂️🔒🔓🚗✈️🛞
        System.out.println("╔════════════════════════════════════════════════════════╗");
        System.out.println("║ BIT INSTITUTE  JUNIO 2024  BY: SANCHEZLUYS             ║");
        System.out.println("║ PRUEBA TECNICA  *PROYECTO 1*                           ║");
        System.out.println("╠════════════════════════════════════════════════════════╣");
        System.out.println("║ JAVA  SDK 17                                           ║");
        System.out.println("╚════════════════════════════════════════════════════════╝");
        Direccion direccion = new Direccion("Calle 123", "Centro", "Ciudad");
        Propietario propietario = new Propietario("Luis Sanchez", LocalDate.of(1974, 6, 15), direccion);
        Marca marca = new Marca("Toyota", 10, 1937, "T001");
        Auto auto = new Auto("Corolla", "Rojo", 2020, marca, "ABC123", propietario, 180, 4, true, 6, true);
        System.out.println("\uD83C\uDFC1 Propietario del auto: " + auto.getPropietario().getNombre());
        System.out.println("\uD83D\uDE97 Marca del auto: " + auto.getMarca().getNombre());
        auto.acelerar(); // sumo velocidad
        auto.acelerar(); // sumo velocidad
        System.out.println("\uD83D\uDE80 Velocidad actual del auto: " + auto.getVelocidadActual());
        auto.frenar();
        System.out.println("⚠\uFE0F Velocidad actual del auto después de frenar: " + auto.getVelocidadActual());
        //**
        System.out.println("⚽ Autonomia del auto para 80 de consumo medio: " +  auto.calcularAutonomia(80));
    }
}