package M2_gestion_datos_box;

public class Almacenar_Transacciones_Estados {
	
	private boolean libre;
	private boolean reservada;
	private boolean ocupada;
	private boolean pidiendo; 
	private boolean espera;
	private boolean servidos;
	private boolean espera_cuenta;
	private boolean pagando;
	private boolean preparacion;
	
	
	public void getlibre() {
		
		
	}

	public void setlibre(boolean libre) {
		this.libre = libre;
	}
	
}