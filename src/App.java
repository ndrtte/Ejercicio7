import Clases.Desarrollador;
import Clases.Empleado;
import Clases.Gerente;
import Clases.Tester;
import TareasAsignadas.Modulo;
import TareasAsignadas.Proyecto;

public class App {
    public static void main(String[] args) {
        Proyecto proyecto = new Proyecto("Pagina web", "2024-10-25", "2024-10-31");

        Modulo modulo1 = new Modulo("Interfaz de Usuario");
        Modulo modulo2 = new Modulo("Base de Datos");
        Modulo modulo3 = new Modulo("API");
        Modulo modulo4 = new Modulo("Redes");
        
        modulo2.agregarDependencia(modulo1);
        modulo3.agregarDependencia(modulo2);
        modulo4.agregarDependencia(modulo3);

        proyecto.agregarModulo(modulo1);
        proyecto.agregarModulo(modulo2);
        proyecto.agregarModulo(modulo3);
        proyecto.agregarModulo(modulo4);

        Empleado desarrollador1 = new Desarrollador("Andrea", "1234", 3000);
        Empleado desarrollador2 = new Desarrollador("Yoongi", "5678", 3000);
        Empleado tester = new Tester("Suzie", "9012", 2500);
        Gerente gerente = new Gerente("Rafayel", "3456", 4000);

        System.out.println();

        proyecto.asignarEmpleadoAProyecto(desarrollador1, modulo1);
        System.out.println("///////////////////");
        proyecto.asignarEmpleadoAProyecto(desarrollador2, modulo2);
        System.out.println("///////////////////");
        proyecto.asignarEmpleadoAProyecto(gerente, modulo4);
        System.out.println("///////////////////");
        proyecto.asignarEmpleadoAProyecto(tester, modulo3);
        System.out.println("///////////////////");

        proyecto.verProgreso();

        System.out.println("///////////////////");
        proyecto.asignarEmpleadoAProyecto(gerente, modulo4);
        System.out.println("///////////////////");

        proyecto.verProgreso();
    }
}
