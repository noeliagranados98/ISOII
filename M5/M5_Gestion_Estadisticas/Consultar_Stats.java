package M5_Gestion_Estadisticas;

public class Consultar_Stats {

	String nombre;
	String detalles;
	String tipo;
	int fecha;

//constructor
	public Actualizar_bbdd(String nombre, String detalles, String tipo, int fecha ) {
		super();
		this.nombre=nombre;
		this.detalles=detalles;
		this.tipo=tipo;
		this.fecha=fecha;
	}

	public void getNombre() {
		throw new UnsupportedOperationException();
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void getDetalles() {
		throw new UnsupportedOperationException();
	}

	public void setDetalles(String detalles) {
		this.detalles = detalles;
	}

	public void getTipo() {
		throw new UnsupportedOperationException();
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public void getFecha() {
		throw new UnsupportedOperationException();
	}

	public void setFecha(int fecha) {
		this.fecha = fecha;
	}

	public void tmed_asignarbox() {
		// TODO - implement Consultar_Stats.tmed_asignarbox
		throw new UnsupportedOperationException();
	}

	public void tmed_rep_averias() {
		// TODO - implement Consultar_Stats.tmed_rep_averias
		throw new UnsupportedOperationException();
	}

	public void tmed_gen_cuenta() {
		// TODO - implement Consultar_Stats.tmed_gen_cuenta
		throw new UnsupportedOperationException();
	}

	public void tmed_prep_boxlibre() {
		// TODO - implement Consultar_Stats.tmed_prep_boxlibre
		throw new UnsupportedOperationException();
	}

}