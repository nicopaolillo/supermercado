package datos;

import java.util.*;

public class AdmCarrito {

	private Set<Carrito> listaCarrito;

	public AdmCarrito(Set<Carrito> listaCarrito) {
		super();
		this.listaCarrito = new HashSet<Carrito>();
	}

	@Override
	public String toString() {
		return "AdmCarrito [listaCarrito=" + listaCarrito + "]";
	}

}
