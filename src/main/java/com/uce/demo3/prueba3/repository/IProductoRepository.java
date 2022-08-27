package com.uce.demo3.prueba3.repository;

import com.uce.demo3.prueba3.repository.modelo.Producto;
import com.uce.demo3.prueba3.repository.modelo.ProductoSimple;

public interface IProductoRepository {
	
	public void insertar (Producto producto);
	public void actualizarP (Producto producto);
	public Producto buscarCodigoB (String codigoB);
	
	public ProductoSimple buscarStock(String codigoB);
}

