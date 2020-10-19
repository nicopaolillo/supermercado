package datos;

public class Cliente {

	private int IdCliente;
	private String nombre;
	private long dni;
	private String direccion;

	public Cliente(int idCliente, String nombre, long dni, String direccion) {
		super();
		IdCliente = idCliente;
		this.nombre = nombre;
		this.dni = dni;
		this.direccion = direccion;
	}

	public Cliente() {
		super();
	}

	public int getIdCliente() {
		return IdCliente;
	}

	public void setIdCliente(int idCliente) {
		IdCliente = idCliente;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public long getDni() {
		return dni;
	}

	public void setDni(long dni) {
		this.dni = dni;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	@Override
	public String toString() {
		return "Cliente [IdCliente=" + IdCliente + ", nombre=" + nombre + ", dni=" + dni + ", direccion=" + direccion
				+ "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (dni ^ (dni >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cliente other = (Cliente) obj;
		if (dni != other.dni)
			return false;
		return true;
	}

}
