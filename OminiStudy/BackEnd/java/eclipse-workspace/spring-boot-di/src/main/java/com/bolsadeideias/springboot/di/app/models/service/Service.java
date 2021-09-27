package com.bolsadeideias.springboot.di.app.models.service;

import org.springframework.stereotype.Component;

@Component
public class Service implements IService {

	public String operation() {
		return "My service operation info";
	}
}
