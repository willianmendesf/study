package com.bolsadeideias.springboot.di.app.models.service;

import org.springframework.stereotype.Component;

@Component("Service")
public class Service implements ServiceInterface {

	public Service(){};

	@Override
	public String operation() {
		return "My service operation info";
	}
}
