package TareasAsignadas;

import java.util.LinkedList;
import Enum.Estado;

public class Modulo {
    private String nombreModulo;
    private Estado estado;
    private LinkedList<Modulo> dependencias;

    public Modulo(String nombreModulo) {
        this.nombreModulo = nombreModulo;
        this.estado = Estado.DESARROLLO;
        this.dependencias = new LinkedList<>();
    }

    public void completarModulo() {
        this.estado = Estado.COMPLETADO;
        System.out.println("Módulo " + getNombreModulo() + " está completado.");
    }

    public boolean verificarDependencias() {
        for (Modulo dependencia : dependencias) {
            if (dependencia.getEstado() != Estado.COMPLETADO) {
                return false; 
            }
        }
        return true; 
    }

    public String getNombreModulo() {
        return nombreModulo;
    }

    public Estado getEstado() {
        return estado;
    }

    public void agregarDependencia(Modulo modulo) {
        dependencias.add(modulo);
    }
}
