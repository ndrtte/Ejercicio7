package Clases;

import TareasAsignadas.Modulo;

public class Gerente extends Empleado {

    

    public Gerente(String nombre, String idEmpleado, double salario) {
        super(nombre, idEmpleado, salario);
    }

    @Override
    public void trabajarEnProyecto(Modulo modulo) {
        System.out.println("El Gerente esta trabajando en el modulo "+modulo.getNombreModulo());
    }

    @Override
    public void calcularSalario() {
        System.out.println("Salario: "+salario);
    }
     
    public void asignarTarea(Empleado empleado, Modulo modulo) {
        System.out.println(nombre + " ha asignado el módulo " + modulo.getNombreModulo() + " a " + empleado.nombre);
        empleado.trabajarEnProyecto(modulo);
    }

}
