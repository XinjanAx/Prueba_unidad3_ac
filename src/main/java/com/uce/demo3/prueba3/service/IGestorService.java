package com.uce.demo3.prueba3.service;

import java.sql.SQLException;
import java.util.List;

import com.uce.demo3.prueba3.repository.modelo.ListaCompras;
import com.uce.demo3.prueba3.repository.modelo.Producto;

public interface IGestorService {
	
	public void ingresarProducto (Producto producto) throws SQLException;
	
	public void realizarVenta (List<ListaCompras> productos, String cedula, String numVenta);
	
	public void reporteVenta();
	
	public void consultarStock (String codigoB);
}
