package agencia_viajes;

public class Cliente {
	private String 	dni;
	private String	nombre;
	private String apellidos;
	private String localidad;
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellidos() {
		return apellidos;
	}
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	public String getLocalidad() {
		return localidad;
	}
	public void setLocalidad(String localidad) {
		this.localidad = localidad;
	}
	public Cliente(String dni, String nombre, String apellidos, String localidad) {
		this.dni = dni;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.localidad = localidad;
	}
	public Cliente() {
	}
	@Override
	public String toString() {
		return "Clientes [dni=" + dni + ", nombre=" + nombre + ", apellidos=" + apellidos + ", localidad=" + localidad
				+ "]";
	}
	

}
