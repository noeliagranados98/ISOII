package DiagClases_M0;

public class Autenticarse {

	private string usuario;
	private string password;
	private int prioridad;
	
	public static void main(args) {
		System.out.print("Introduce usuario");
		System.out.print("Introduce password");
	}

	public string getUsuario() {
		return this.usuario;
	}

	public void setUsuario(string usuario) {
		this.usuario = usuario;
	}

	public string getPassword() {
		return this.password;
	}

	public void setPassword(string password) {
		this.password = password;
	}

	public int getPrioridad() {
		return this.prioridad;
	}

	public void setPrioridad(int prioridad) {
		this.prioridad = prioridad;
	}

	public void login() {
		// TODO - implement Autenticarse.login
		throw new UnsupportedOperationException();
	}

}