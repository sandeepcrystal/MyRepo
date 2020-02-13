package com.basic.springcore.thirdspring;

import java.util.Set;

public class CarDealer {

	private String name;
	private Set<String> Models;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Set<String> getModels() {
		return Models;
	}

	public void setModels(Set<String> models) {
		Models = models;
	}
}
