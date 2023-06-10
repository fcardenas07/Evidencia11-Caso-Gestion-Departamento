package universidad;

import java.util.List;

public class Profesor extends Personal {
	private final List<Asignatura> asignaturas;

	public Profesor(String nombre, List<Asignatura> asignaturas) {
		super(nombre);
		this.asignaturas = asignaturas;
	}

	public List<Asignatura> getAsignaturas() {
		return asignaturas;
	}
}