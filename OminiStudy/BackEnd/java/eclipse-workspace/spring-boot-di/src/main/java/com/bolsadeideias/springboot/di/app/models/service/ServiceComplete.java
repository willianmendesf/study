package com.bolsadeideias.springboot.di.app.models.service;

import org.springframework.stereotype.Component;

@Component("ServiceComplete")
public class ServiceComplete implements ServiceInterface {

	public ServiceComplete(){};

	@Override
	public String operation() {
		return "My service complete operation info";
	}
}
