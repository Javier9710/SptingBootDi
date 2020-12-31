package com.ufps.springboot.di.app;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

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

}
