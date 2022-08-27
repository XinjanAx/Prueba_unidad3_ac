package com.uce.demo3.prueba3.service;

import java.util.List;

import com.uce.demo3.prueba3.repository.modelo.ListaCompras;
import com.uce.demo3.prueba3.repository.modelo.Venta;

public interface IVentaService {
	
	public void Venta(List<ListaCompras> productos, String cedula, String numVenta);

}
