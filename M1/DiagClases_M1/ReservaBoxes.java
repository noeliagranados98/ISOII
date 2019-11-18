package DiagClases_M1;

public class ReservaBoxes {

	private int idbox;
	private int estado;
	private boolean ocupado;

	public int getIdbox() {
		return idbox;
	}

	public void setIdbox(int idbox) {
		this.idbox = idbox;
	}

	public boolean isOcupado() {
		return ocupado;
	}

	public void setOcupado(boolean ocupado) {
		this.ocupado = ocupado;
	}

	public ReservaBoxes(int idbox, int estado, boolean ocupado) {
		super();
		this.idbox = idbox;
		this.estado = estado;
		this.ocupado = ocupado;
	}

	public void getEstado() {
		// TODO - implement ReservaBoxes.getEstado
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param estado
	 */
	public void setEstado(int estado) {
		this.estado = estado;
	}

	public void reservarBox() {
		// TODO - implement ReservaBoxes.reservarBox
		throw new UnsupportedOperationException();
	}

	public void cancelarReserva() {
		// TODO - implement ReservaBoxes.cancelarReserva
		throw new UnsupportedOperationException();
	}

}