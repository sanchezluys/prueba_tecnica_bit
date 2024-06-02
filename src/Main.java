import com.bit.proyecto.model.Auto;
import com.bit.proyecto.model.Direccion;
import com.bit.proyecto.model.Marca;
import com.bit.proyecto.model.Propietario;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        System.out.println("Prueba Tecnica");

        Direccion direccion = new Direccion("Calle 123", "Centro", "Ciudad");
        Propietario propietario = new Propietario("Juan Perez", LocalDate.of(1980, 5, 15), direccion);
        Marca marca = new Marca("Toyota", 10, 1937, "T001");

        Auto auto = new Auto("Corolla", "Rojo", 2020, marca, "ABC123", propietario, 180, 4, true, 6, true);

        System.out.println("Propietario del auto: " + auto.getPropietario().getNombre());
        System.out.println("Marca del auto: " + auto.getMarca().getNombre());

        auto.acelerar();
        System.out.println("Velocidad actual del auto: " + auto.getVelocidadActual());

        auto.frenar();
        System.out.println("Velocidad actual del auto después de frenar: " + auto.getVelocidadActual());
    }
}