package universidad;

import java.util.List;

public class Estudiante extends Persona {
    private final List<Asignatura> asignaturas;

    public Estudiante(String nombre, List<Asignatura> asignaturas) {
        super(nombre);
        this.asignaturas = asignaturas;
    }

    public List<Asignatura> getAsignaturas() {
        return asignaturas;
    }
}