package datos;

import java.util.*;

public class AdmCliente {

	private Set<Cliente> listCliente;

	public AdmCliente() {
		super();
		this.listCliente = new HashSet<Cliente>();
	}

	@Override
	public String toString() {
		return "AdmCliente [listCliente=" + listCliente + "]";
	}

	public boolean agregarCliente(String cliente, long dni, String direccion) throws Exception {
		Cliente cliente1 = new Cliente(listCliente.size(), cliente, dni, direccion);
		boolean bandera = listCliente.add(cliente1);

		if (bandera == false)
			throw new Exception("Error, el cliente ya se encuentra en la lista");

		return bandera;
	}
}
