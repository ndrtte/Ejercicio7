package Clases;

import TareasAsignadas.Modulo;

public class Tester extends Empleado {

    public Tester(String nombre, String idEmpleado, double salario) {
        super(nombre, idEmpleado, salario);
    }

    @Override
    public void trabajarEnProyecto(Modulo modulo) {
        System.out.println("El Tester esta trabajando en el modulo "+modulo.getNombreModulo());
    }

    @Override
    public void calcularSalario() {
        System.out.println("Salario: "+salario);
    }
    
}
