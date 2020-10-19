package datos;

public class Producto {

	private int Idproducto;
	private String producto;
	private float precio;

	public Producto(int idproducto, String producto, float precio) {
		super();
		Idproducto = idproducto;
		this.producto = producto;
		this.precio = precio;
	}

	public Producto() {
		super();
	}

	public int getIdproducto() {
		return Idproducto;
	}

	public void setIdproducto(int idproducto) {
		Idproducto = idproducto;
	}

	public String getProducto() {
		return producto;
	}

	public void setProducto(String producto) {
		this.producto = producto;
	}

	public float getPrecio() {
		return precio;
	}

	public void setPrecio(float precio) {
		this.precio = precio;
	}

	@Override
	public String toString() {
		return "Producto [Idproducto=" + Idproducto + ", producto=" + producto + ", precio=" + precio + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Idproducto;
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
		Producto other = (Producto) obj;
		if (Idproducto != other.Idproducto)
			return false;
		return true;
	}

}
