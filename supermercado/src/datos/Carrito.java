package datos;

import java.time.*;
import java.util.*;

public class Carrito {

	private int IdCarrito;
	private LocalDate fecha;
	private LocalTime hora;
	private Set<ItemCarrito> listItemCarrito;
	private Cliente cliente;

	public Carrito(int idCarrito, LocalDate fecha, LocalTime hora, Cliente cliente) {
		super();
		IdCarrito = idCarrito;
		this.fecha = fecha;
		this.hora = hora;
		this.listItemCarrito = new HashSet<ItemCarrito>();
		this.cliente = cliente;
	}

	public Carrito() {
		super();
	}

	public int getIdCarrito() {
		return IdCarrito;
	}

	public void setIdCarrito(int idCarrito) {
		IdCarrito = idCarrito;
	}

	public LocalDate getFecha() {
		return fecha;
	}

	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}

	public LocalTime getHora() {
		return hora;
	}

	public void setHora(LocalTime hora) {
		this.hora = hora;
	}

	public Set<ItemCarrito> getListItemCarrito() {
		return listItemCarrito;
	}

	public void setListItemCarrito(Set<ItemCarrito> listItemCarrito) {
		this.listItemCarrito = listItemCarrito;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	@Override
	public String toString() {
		return "Carrito [IdCarrito=" + IdCarrito + ", fecha=" + fecha + ", hora=" + hora + ", listItemCarrito="
				+ listItemCarrito + "\n" + "Cliente=" + cliente + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + IdCarrito;
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
		Carrito other = (Carrito) obj;
		if (IdCarrito != other.IdCarrito)
			return false;
		return true;
	}

	public boolean agregarItem(Producto producto, int cantidad) {
		ItemCarrito itemCarrito = new ItemCarrito(listItemCarrito.size(), producto, cantidad);
		boolean answer = listItemCarrito.add(itemCarrito);
		return answer;
	}

	public boolean eliminarItem(Producto producto, int cantidad) {
		for (ItemCarrito item : listItemCarrito) {
			if (item.getProducto().equals(producto)) {
				item.setCantidad(item.getCantidad() - cantidad);
			}
			if (item.getCantidad() == 0) {
				return listItemCarrito.remove(item);
			}
		}
		return false;
	}

	public float calcularTotal() {
		float total = 0;
		for (ItemCarrito item : listItemCarrito) {
			total = total + item.calcularSubtotal();
		}
		return total;
	}
}
