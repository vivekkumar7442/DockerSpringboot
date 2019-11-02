package com.configure.app.appconfig.bean;

import java.util.ArrayList;
import java.util.List;

/**
 * @author vivek Engine class is used to hold details related to engine
 *         configuration of cars its as simple pojo class
 *
 */
public class Engine {

	private String engineType;

	private Integer engineHorsePower;

	private List<Car> cars;

	public List<Car> getCars() {
		if (cars == null) {
			cars = new ArrayList<>();
		}
		return cars;
	}

	public void setCars(List<Car> cars) {
		this.cars = cars;
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

	@Override
	public String toString() {
		return "Engine [engineType=" + engineType + ", engineHorsePower=" + engineHorsePower + "]";
	}

}
