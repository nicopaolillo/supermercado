package datos;

import java.util.*;

public class AdmProducto {

	private Set<Producto> listaProducto;

	public AdmProducto() {
		super();
		this.listaProducto = new HashSet<Producto>();
	}

	@Override
	public String toString() {
		return "AdmProducto [listaProducto=" + listaProducto + "]";
	}

	public boolean agregarProducto(String producto, float precio) {
		Producto producto1 = new Producto(listaProducto.size(), producto, precio);
		if (listaProducto.add(producto1) == true) {
			return true;
		}
		return false;
	}

	public Producto traerProducto(int idProducto) throws Exception {
		Producto prod = new Producto();
		for (Producto p : listaProducto) {
			if (p.getIdproducto() == idProducto) {
				prod = p;
			}
		}
		if (prod.getProducto() == null) {
			throw new Exception("Error al buscar producto, el ID no se encuentra en la lista");
		}
		return prod;
	}

	public boolean eliminarProducto(int idProducto) {
		for (Producto p : listaProducto) {
			if (p.getIdproducto() == idProducto) {
				listaProducto.remove(p);
				return true;
			}
		}
		return false;
	}

}
