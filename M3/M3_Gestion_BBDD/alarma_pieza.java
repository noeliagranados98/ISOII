package M3_Gestion_BBDD;

public class alarma_pieza {

	private int id_pieza;
	private int tipo_pieza;
	private int umbral_calidad;


	public alarma_pieza(int id_pieza, int tipo_pieza, int umbral_calidad) {
		super();
		this.id_pieza = id_pieza;
		this.tipo_pieza=tipo_pieza;
		this.umbral_calidad=umbral_calidad;
	}

	public void getId_pieza() {
		// TODO - implement alarma_pieza.getId_pieza
		throw new UnsupportedOperationException();
	}
	
	public void setId_pieza(int id_pieza) {
		this.id_pieza = id_pieza;
	}

	public void getTipo_pieza() {
		// TODO - implement alarma_pieza.getTipo_pieza
		throw new UnsupportedOperationException();
	}

	public void setTipo_pieza(int tipo_pieza) {
		this.tipo_pieza = tipo_pieza;
	}

	public void getUmbral_calidad() {
		// TODO - implement alarma_pieza.getUmbral_calidad
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param umbral_calidad
	 */
	public void setUmbral_calidad(int umbral_calidad) {
		this.umbral_calidad = umbral_calidad;
	}

	public void alarmar_pieza() {
		// TODO - implement alarma_pieza.alarmar_pieza
		throw new UnsupportedOperationException();
	}

}