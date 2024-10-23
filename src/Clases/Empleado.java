package Clases;

import TareasAsignadas.Modulo;

public abstract class Empleado {
    protected String nombre, idEmpleado;
    protected double salario;

    public Empleado(String nombre, String idEmpleado, double salario) {
        this.nombre = nombre;
        this.idEmpleado = idEmpleado;
        this.salario = salario;
    }
    public abstract void trabajarEnProyecto(Modulo modulo);
    public abstract void calcularSalario();

    public String getNombre() {
        return nombre;
    }

    public String getIdEmpleado() {
        return idEmpleado;
    }
}
