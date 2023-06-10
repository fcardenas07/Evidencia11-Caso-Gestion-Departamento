package universidad;

import java.util.ArrayList;
import java.util.List;

public class Departamento {
    private final List<Profesor> profesores;
    private final List<Administrativo> administrativos;
    private final List<Estudiante> estudiantes;
    private String nombre;


    public Departamento(String nombre,
                        List<Profesor> profesores,
                        List<Administrativo> administrativos,
                        List<Estudiante> estudiantes) {
        this.nombre = nombre;
        this.profesores = profesores;
        this.administrativos = administrativos;
        this.estudiantes = estudiantes;
    }

    public List<Profesor> buscarProfesoresPorCurso(String codigoAsignatura) {
        ArrayList<Profesor> profesoresFiltrados = new ArrayList<>();
        for (Profesor profesor : profesores) {
            for (Asignatura asignatura : profesor.getAsignaturas()) {
                if (codigoAsignatura.equals(asignatura.getCodigo())) {
                    profesoresFiltrados.add(profesor);
                }
            }
        }
        return profesoresFiltrados;
    }

    public List<Estudiante> buscarEstudiantesPorCurso(String codigoAsignatura) {
        ArrayList<Estudiante> estudiantesFiltrados = new ArrayList<>();
        for (Estudiante estudiante : estudiantes) {
            for (Asignatura asignatura : estudiante.getAsignaturas()) {
                if (codigoAsignatura.equals(asignatura.getCodigo())) {
                    estudiantesFiltrados.add(estudiante);
                }
            }
        }
        return estudiantesFiltrados;
    }

    public void mostrarPersonal() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "Departamento{" +
                "profesores=" + profesores +
                ", administrativos=" + administrativos +
                '}';
    }
}