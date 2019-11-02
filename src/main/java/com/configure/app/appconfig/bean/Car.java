package com.configure.app.appconfig.bean;

/**
 * @author vivek Pojo class for Car associated with the Engine definition
 */
public class Car {

	private String model;

	private String engineType;

	private Integer engineHorsePower;
	
	public Car(Engine engine) {
		this.engineType=engine.getEngineType();
		this.engineHorsePower=engine.getEngineHorsePower();
	}
	
	

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	private Engine engine;

	public Engine getEngine() {
		return engine;
	}

	public void setEngine(Engine engine) {
		this.engine = engine;
	}

	public String getEngineType() {
		return engineType;
	}

	public void setEngineType(String engineType) {
		this.engineType = engineType;
	}

	public Integer getEngineHorsePower() {
		return engineHorsePower;
	}

	public void setEngineHorsePower(Integer engineHorsePower) {
		this.engineHorsePower = engineHorsePower;
	}

}
