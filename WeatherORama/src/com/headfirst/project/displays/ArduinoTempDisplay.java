package com.headfirst.project.displays;

import com.headfirst.project.interfaces.DisplayElement;
import com.headfirst.project.interfaces.Observer;
import com.headfirst.project.interfaces.Subject;

public class ArduinoTempDisplay implements Observer, DisplayElement {

	private float temperature;
	private float light;
	private Subject weatherData;

	public ArduinoTempDisplay(Subject weatherData) {
		this.weatherData = weatherData;
		this.weatherData.registerObserver(this);

	}

	@Override
	public void display() {
		System.out.println("Temperature of the Arduino: " + this.temperature + "C Light: " + this.light);

	}

	@Override
	public void update(float temp, float humidity, float pressure, float light) {
		this.temperature = temp;
		this.light = light;
		this.display();

	}

}
