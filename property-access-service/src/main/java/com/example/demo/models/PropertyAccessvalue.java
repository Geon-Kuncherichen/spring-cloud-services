package com.example.demo.models;

public class PropertyAccessvalue {
	
	private String name;
	
	private String description;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public String toString() {
		return "PropertyAccessvalue [name=" + name + ", description=" + description + "]";
	}

	public PropertyAccessvalue(String name, String description) {
		super();
		this.name = name;
		this.description = description;
	}
	
	

}
