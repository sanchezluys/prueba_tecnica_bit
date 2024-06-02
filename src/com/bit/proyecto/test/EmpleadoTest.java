package com.bit.proyecto.test;

import com.bit.proyecto.model.Empleado;

public class EmpleadoTest {

    public void pruebaEmpleado() {
        // // emoticones: ⚠️🔥📝✅❎📂⚙️🏷️📦📆🗓️🕑🏁➡️⬆️🎁🛒🛍️✏️🖍️✂️🔒🔓🚗✈️🛞
        // 📤📥📆📊⚙️🧲📡🔋🎯🎲🎗️🧮📌📍☯️♻️🏁🚩
        // Crear dos objetos Empleado
        Empleado empleado1 = new Empleado("Juan", "Perez", 3000);
        Empleado empleado2 = new Empleado("Ana", "Gomez", 4000);

        // Mostrar el salario mensual de cada objeto
        System.out.printf("\uD83D\uDDD3\uFE0F Salario mensual de %s %s: %.2f%n", empleado1.getNombre(), empleado1.getApellido(), empleado1.getSalarioMensual());
        System.out.printf("\uD83D\uDDD3\uFE0F Salario mensual de %s %s: %.2f%n", empleado2.getNombre(), empleado2.getApellido(), empleado2.getSalarioMensual());
        System.out.println("══════════════════════════════════════════════════════════");
        // Mostrar el salario anual de cada objeto
        System.out.printf("\uD83D\uDCCA Salario anual de %s %s: %.2f%n", empleado1.getNombre(), empleado1.getApellido(), empleado1.getSalarioAnual());
        System.out.printf("\uD83D\uDCCA Salario anual de %s %s: %.2f%n", empleado2.getNombre(), empleado2.getApellido(), empleado2.getSalarioAnual());
        System.out.println("══════════════════════════════════════════════════════════");
        // Dar a cada empleado un aumento del 10%
        Integer aumento=10;
        empleado1.aumentarSalario(aumento);
        empleado2.aumentarSalario(aumento);
        System.out.println("\uD83D\uDD25 Aumento aplicado a los empleados: "+ aumento +"%");
        System.out.println("══════════════════════════════════════════════════════════");
        // Mostrar el salario mensual y anual después del aumento
        System.out.printf("\uD83D\uDCC6 Salario mensual de %s %s después del aumento: %.2f%n", empleado1.getNombre(), empleado1.getApellido(), empleado1.getSalarioMensual());
        System.out.printf("\uD83D\uDCC6 Salario mensual de %s %s después del aumento: %.2f%n", empleado2.getNombre(), empleado2.getApellido(), empleado2.getSalarioMensual());

        System.out.printf("\uD83D\uDCCA Salario anual de %s %s después del aumento: %.2f%n", empleado1.getNombre(), empleado1.getApellido(), empleado1.getSalarioAnual());
        System.out.printf("\uD83D\uDCCA Salario anual de %s %s después del aumento: %.2f%n", empleado2.getNombre(), empleado2.getApellido(), empleado2.getSalarioAnual());
        System.out.println("══════════════════════════════════════════════════════════");
        // Mostrar el número de empleados
        System.out.printf("⚙\uFE0F Número total de empleados: %d%n", Empleado.getContadorEmpleados());
    }
}
