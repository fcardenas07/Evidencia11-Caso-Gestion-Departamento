package universidad;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class DepartamentoTest {
    private Departamento departamento;

    @BeforeEach
    void setUp() {
        List<Asignatura> asignaturas = List.of(
                new Asignatura("ICC123", "Programación"),
                new Asignatura("ICC124", "Sistemas Operativos")
        );

        List<Profesor> profesores = List.of(
                new Profesor("Profesor1", asignaturas),
                new Profesor("Profesor2", List.of(new Asignatura("ICC123", "Programación")))
        );

        List<Estudiante> estudiantes = List.of(
                new Estudiante("Estudiante1", asignaturas),
                new Estudiante("Estudiante2", new ArrayList<>())
        );

        departamento = new Departamento("DCI", profesores, new ArrayList<>(), estudiantes);
    }

    @Test
    void buscarProfesores() {
        List<Profesor> profesors = departamento.buscarProfesoresPorCurso("ICC123");

        int sizeActual = profesors.size();

        assertEquals(2, sizeActual);
    }

    @Test
    void debeRetornarUnaListaVacia_cuandoNoEncuentraLaAsignatura() {
        List<Profesor> profesors = departamento.buscarProfesoresPorCurso("Invalido");

        int sizeActual = profesors.size();

        assertEquals(0, sizeActual);
    }

    @Test
    void buscarEstudiantes_debeRetornarUnaListaVacia_cuandoNoEncuentraLaAsignatura() {
        List<Estudiante> estudiantes = departamento.buscarEstudiantesPorCurso("");

        int sizeActual = estudiantes.size();

        assertEquals(0, sizeActual);
    }

    @Test
    void buscarEstudiantes() {
        List<Estudiante> estudiantes = departamento.buscarEstudiantesPorCurso("ICC123");

        int sizeActual = estudiantes.size();

        assertEquals(1, sizeActual);
    }
}