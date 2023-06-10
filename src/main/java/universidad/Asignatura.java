package universidad;

public class Asignatura {
	private final String codigo;
	private final String nombre;

	public Asignatura(String codigo, String nombre) {
		this.codigo = codigo;
		this.nombre = nombre;
	}

	public String getCodigo() {
		return codigo;
	}
}