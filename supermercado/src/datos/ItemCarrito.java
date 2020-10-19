package datos;

public class ItemCarrito {

	private int IdItemCarrito;
	private Producto producto;
	private int cantidad;

	public ItemCarrito(int idItemCarrito, Producto producto, int cantidad) {
		super();
		IdItemCarrito = idItemCarrito;
		this.producto = producto;
		this.cantidad = cantidad;
	}

	public int getIdItemCarrito() {
		return IdItemCarrito;
	}

	public void setIdItemCarrito(int idItemCarrito) {
		IdItemCarrito = idItemCarrito;
	}

	public Producto getProducto() {
		return producto;
	}

	public void setProducto(Producto producto) {
		this.producto = producto;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	@Override
	public String toString() {
		return "ItemCarrito [IdItemCarrito=" + IdItemCarrito + ", producto=" + producto + ", cantidad=" + cantidad
				+ "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + IdItemCarrito;
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
		ItemCarrito other = (ItemCarrito) obj;
		if (IdItemCarrito != other.IdItemCarrito)
			return false;
		return true;
	}

	public float calcularSubtotal() {
		float total = producto.getPrecio() * cantidad;
		return total;
	}
}
