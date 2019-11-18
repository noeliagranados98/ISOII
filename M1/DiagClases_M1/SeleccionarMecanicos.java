package DiagClases_M1;

public class SeleccionarMecanicos {

	private int idmecanico;
	private String NomMecanico;
	private int idTaller;
	
	

	public SeleccionarMecanicos(int idmecanico) {
		super();
		this.idmecanico = idmecanico;
	}
public SeleccionarMecanicos(int idmecanico, String nomMecanico, int idTaller) {
	super();
	this.idmecanico = idmecanico;
	NomMecanico = nomMecanico;
	this.idTaller = idTaller;
}

	public void getIdmecanico() {
		// TODO - implement SeleccionarMecanicos.getIdmecanico
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param idmecanico
	 */
	public void setIdmecanico(int idmecanico) {
		this.idmecanico = idmecanico;
	}
	
	

	public String getNomMecanico() {
		return NomMecanico;
	}
	public void setNomMecanico(String nomMecanico) {
		NomMecanico = nomMecanico;
	}
	public int getIdTaller() {
		return idTaller;
	}
	public void setIdTaller(int idTaller) {
		this.idTaller = idTaller;
	}
	public void seleccionarMedicos() {
		// TODO - implement SeleccionarMecanicos.seleccionarMedicos
		throw new UnsupportedOperationException();
	}
	@Override
	public String toString() {
		return "SeleccionarMecanicos [idmecanico=" + idmecanico + ", NomMecanico=" + NomMecanico + ", idTaller="
				+ idTaller + "]";
	}
	
	

}