package com.ufps.springboot.di.app;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import com.ufps.springboot.di.app.models.entity.ItemFactura;
import com.ufps.springboot.di.app.models.entity.Producto;
import com.ufps.springboot.di.app.models.service.IServicio;
import com.ufps.springboot.di.app.models.service.MiServicio;
import com.ufps.springboot.di.app.models.service.MiServicioComplejo;

@Configuration
public class AppConfig {
	
	@Bean("miServicioSimple")
	@Primary
	public IServicio registarMiServicio() {
		
		
		return new MiServicio();
	}
	
	@Bean("miServicioComplejo")
	public IServicio registarMiComplejo() {
		
		return new MiServicioComplejo();
	}
	
	@Bean("itemFactura")
	public List<ItemFactura> registarItem(){
		Producto producto1= new Producto("Camara Sony", 5000);
		Producto producto2= new Producto("Compoutador Acer", 10000);

		ItemFactura linea1 = new ItemFactura(producto1, 2);
		ItemFactura linea2 = new ItemFactura(producto2, 1);
		
		return Arrays.asList(linea1,linea2);
	}
	

}
