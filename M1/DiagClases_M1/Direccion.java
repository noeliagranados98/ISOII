package DiagClases_M1;

public class Direccion {

	private int id;
	private int componentes;
	private String rango;
	
	public Direccion (int id, int componentes, String rango) {
		this.id=id;
		this.componentes=componentes;
		this.rango= rango;
		
	}
	
	public void getRango() {
		throw new UnsupportedOperationException();
	}
	public void setRango(String rango) {
		this.rango=rango;
	}

	public void getId() {
		// TODO - implement Direccion.getId
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param id
	 */
	public void setId(int id) {
		this.id = id;
	}

	public void getComponentes() {
		// TODO - implement Direccion.getComponentes
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param componentes
	 */
	public void setComponentes(int componentes) {
		this.componentes = componentes;
	}

}