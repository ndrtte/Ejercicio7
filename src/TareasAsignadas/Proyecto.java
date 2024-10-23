package TareasAsignadas;

import java.util.ArrayList;
import Clases.Empleado;

public class Proyecto {
    private String nombreProyecto, fechaInicio, fechaFin;
    private ArrayList<Modulo> modulos;

    public Proyecto(String nombreProyecto, String fechaInicio, String fechaFin) {
        this.nombreProyecto = nombreProyecto;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.modulos = new ArrayList<>();
    }

    public void agregarModulo(Modulo modulo) {
        modulos.add(modulo);
    }

    public void verProgreso() {
        for (Modulo modulo : modulos) {
            System.out.println("Proyecto: "+nombreProyecto+"\n"+
            "Fecha de inicio: "+fechaInicio+" | Fecha de fin: "+fechaFin);
            System.out.println("Módulo: " + modulo.getNombreModulo() + "\nEstado del Módulo: " + modulo.getEstado());
        }
    }

    public void asignarEmpleadoAProyecto(Empleado empleado, Modulo modulo) {
        if (modulo.verificarDependencias()) {
            System.out.println("Empleado: " + empleado.getNombre() + " asignado al módulo: " + modulo.getNombreModulo());
            empleado.trabajarEnProyecto(modulo);
            modulo.completarModulo(); 
        } else {
            System.out.println("No se puede asignar. El módulo tiene dependencias no completadas.");
        }
    }
}
