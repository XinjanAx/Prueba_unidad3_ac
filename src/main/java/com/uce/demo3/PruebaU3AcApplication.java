package com.uce.demo3;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.uce.demo3.prueba3.repository.modelo.ListaCompras;
import com.uce.demo3.prueba3.repository.modelo.Producto;
import com.uce.demo3.prueba3.service.IGestorService;

@SpringBootApplication
public class PruebaU3AcApplication implements CommandLineRunner{
	Logger Log = LogManager.getLogger(LogManager.ROOT_LOGGER_NAME);

	@Autowired
	private IGestorService gestorService;
	
	public static void main(String[] args) {
		SpringApplication.run(PruebaU3AcApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		Log.info("\nSanta Maria");
		
		Producto p1 = new Producto();
			p1.setNombre("Sombrero");
			p1.setCodigoBarras("50mbr3-s");
			p1.setStock(3);
			p1.setPrecio(new BigDecimal(5.5));
			p1.setCategoria("Ropa");	
	
		this.gestorService.ingresarProducto(p1);
		
// ingreso por segunda vez		
		this.gestorService.ingresarProducto(p1);
//---------------------------------------------		
		
		List<ListaCompras> lista = new ArrayList<>();
			ListaCompras c1 = new ListaCompras();	
			c1.setCodigoBarras("c4m1-s");
			c1.setCantidad(2);
		lista.add(c1);
			
			
		this.gestorService.realizarVenta(lista, "17843541384", "sm-0024-5163");
		
//----------------------------------------------	
		
		this.gestorService.reporteVenta();//falta...
//----------------------------------------------
		
		this.gestorService.consultarStock("q3s0-s");
//----------------------------------------------		
			
	}

}
