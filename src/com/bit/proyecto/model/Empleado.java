package com.bit.proyecto.model;

public class Empleado {
    private String nombre;
    private String apellido;
    private double salarioMensual;

    // Variable de clase para contar el número de empleados
    private static int contadorEmpleados = 0;

    // Constructor
    public Empleado(String nombre, String apellido, double salarioMensual) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.salarioMensual = salarioMensual > 0 ? salarioMensual : 0; // Establecer a 0 si no es positivo
        contadorEmpleados++; // Incrementar el contador de empleados
    }

    // Métodos get y set para nombre
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    // Métodos get y set para apellido
    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    // Métodos get y set para salarioMensual
    public double getSalarioMensual() {
        return salarioMensual;
    }

    public void setSalarioMensual(double salarioMensual) {
        this.salarioMensual = salarioMensual > 0 ? salarioMensual : 0; // Establecer a 0 si no es positivo
    }

    // Método para obtener el salario anual
    public double getSalarioAnual() {
        return salarioMensual * 12;
    }

    // Método para aumentar el salario en un porcentaje
    public void aumentarSalario(double porcentaje) {
        if (porcentaje > 0) {
            salarioMensual += salarioMensual * (porcentaje / 100);
        }
    }

    // Método estático para obtener el número de empleados
    public static int getContadorEmpleados() {
        return contadorEmpleados;
    }
}
