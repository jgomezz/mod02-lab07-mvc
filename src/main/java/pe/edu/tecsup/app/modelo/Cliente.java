package pe.edu.tecsup.app.modelo;

public class Cliente {

	private String codigo;
	private String nombres;
	private String paterno;
	private String materno;
	private String dni;

	public String getInformacion() {
		return this.nombres + " " + this.paterno + " " + this.materno + " " + this.dni;
	}

	public Cliente(String codigo, String nombres, String paterno, String materno) {
		super();
		this.codigo = codigo;
		this.nombres = nombres;
		this.paterno = paterno;
		this.materno = materno;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getNombres() {
		return nombres;
	}

	public void setNombres(String nombres) {
		this.nombres = nombres;
	}

	public String getPaterno() {
		return paterno;
	}

	public void setPaterno(String paterno) {
		this.paterno = paterno;
	}

	public String getMaterno() {
		return materno;
	}

	public void setMaterno(String materno) {
		this.materno = materno;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	@Override
	public String toString() {
		return "Cliente [codigo=" + codigo + ", nombres=" + nombres + ", paterno=" + paterno + ", materno=" + materno
				+ "]";
	}

	
	
}
