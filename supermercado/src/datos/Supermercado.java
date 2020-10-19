package datos;

public class Supermercado {

	AdmCliente admCliente;
	AdmProducto admProducto;
	AdmCarrito admCarrito;

	public Supermercado(AdmCliente admCliente, AdmProducto admProducto, AdmCarrito admCarrito) {
		super();
		this.admCliente = admCliente;
		this.admProducto = admProducto;
		this.admCarrito = admCarrito;
	}

	public Supermercado() {
		super();
	}

	public AdmCliente getAdmCliente() {
		return admCliente;
	}

	public void setAdmCliente(AdmCliente admCliente) {
		this.admCliente = admCliente;
	}

	public AdmProducto getAdmProducto() {
		return admProducto;
	}

	public void setAdmProducto(AdmProducto admProducto) {
		this.admProducto = admProducto;
	}

	public AdmCarrito getAdmCarrito() {
		return admCarrito;
	}

	public void setAdmCarrito(AdmCarrito admCarrito) {
		this.admCarrito = admCarrito;
	}

	@Override
	public String toString() {
		return "Supermercado [admCliente=" + admCliente + ", admProducto=" + admProducto + ", admCarrito=" + admCarrito
				+ "]";
	}

}
