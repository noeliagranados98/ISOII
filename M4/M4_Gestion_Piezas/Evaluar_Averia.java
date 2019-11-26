package M3_Gestion_Piezas;

public class Evaluar_Averia {

	private int id_averia;
	private String Mecanico;
	private String formulario;
	private int nota;
	
	
	public Evaluar_Averia(int id_averia, String mecanico, String formulario, int nota) {
		super();
		this.id_averia = id_averia;
		Mecanico = mecanico;
		this.formulario = formulario;
		this.nota = nota;
	}

	public int getId_averia() {
		return id_averia;
	}

	public void setId_averia(int id_averia) {
		this.id_averia = id_averia;
	}

	public String getMecanico() {
		return Mecanico;
	}

	public void setMecanico(String mecanico) {
		Mecanico = mecanico;
	}

	public String getFormulario() {
		return formulario;
	}

	public void setFormulario(String formulario) {
		this.formulario = formulario;
	}

	public int getNota() {
		return nota;
	}

	public void setNota(int nota) {
		this.nota = nota;
	}

	public void Evaluar() {
		// TODO - implement Evaluar_Averia.Evaluar
		throw new UnsupportedOperationException();
	}

	public void Notificar() {
		// TODO - implement Evaluar_Averia.Notificar
		throw new UnsupportedOperationException();
	}

}