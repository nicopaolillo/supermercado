package test;

import java.time.LocalDate;
import java.time.LocalTime;

import datos.*;

public class Test {

	public static void main(String[] args) throws Exception {
//		INSTANCIO
		AdmProducto admProducto = new AdmProducto();
//		 metodos agregar
		admProducto.agregarProducto("manzana", 25);
		admProducto.agregarProducto("pera", 35);
		System.out.println("MUESTRO LISTA DE PRODUCTOS CREADOS");
		System.out.println(admProducto.toString());
//		 metodos para buscar determinado objeto
		System.out.println("\n");
		System.out.println("MUESTRO LOS PRODUCTOS QUE PUEDO TRAER INDIVIDUALMENTE");
		System.out.println(admProducto.traerProducto(1));
//		System.out.println(admProducto.traerProducto(4));  //prueba de excepción
		System.out.println(admProducto.traerProducto(0));
//		metodo para eliminar determinado objeto
//		System.out.println(admProducto.eliminarProducto(1));
//		INSTANCIO los objetos necesarios para poder usar los siguientes casos de uso
		Cliente cliente1 = new Cliente(5, "Nicolás", 41237024, "condarco 2024");
		Carrito carrito = new Carrito(1, LocalDate.of(2020, 10, 19), LocalTime.of(11, 10), cliente1);
		Producto producto0 = admProducto.traerProducto(0);
		Producto producto1 = admProducto.traerProducto(1);
//		agrego items al carrito y muestro dicho carrito con su cliente
		carrito.agregarItem(producto0, 3);
		carrito.agregarItem(producto1, 2);
		System.out.println("\n");
		System.out.println("MUESTRO LOS ITEMS AGREGADOS AL CARRITO Y SU CLIENTE");
		System.out.println(carrito.toString());
		System.out.println("\n");
//		quito un item del carrito
		carrito.eliminarItem(producto0, 3);
		carrito.eliminarItem(producto1, 1);
		System.out.println("MUESTRO LOS ITEMS QUITADOS AL CARRITO Y SU CLIENTE");
		System.out.println(carrito.toString());
//		calculo el total del carrito
		System.out.println("\n");
		System.out.println("MUESTRO EL TOTAL DEL CARRITO");
		System.out.println(carrito.calcularTotal());
//		agrego un cliente y lanzo exception si ya existia en la lista
//		INSTANCIO
		AdmCliente admCliente = new AdmCliente();
		admCliente.agregarCliente("Horacio", 35489632, "9 de julio");
		admCliente.agregarCliente("juan", 27896324, "ituzaingo");
//		muestro la lista de clientes
		System.out.println("\n");
		System.out.println("MUESTRO LA LISTA DE CLIENTES AGREGADOS A LA LISTA");
		System.out.println(admCliente.toString());
		
	}

}
