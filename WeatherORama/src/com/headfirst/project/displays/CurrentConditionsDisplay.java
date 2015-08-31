package com.headfirst.project.displays;

import com.headfirst.project.interfaces.DisplayElement;
import com.headfirst.project.interfaces.Observer;
import com.headfirst.project.interfaces.Subject;

public class CurrentConditionsDisplay implements Observer, DisplayElement {

	private float temperature;
	private float humidity;
	private Subject weatherData;

	public CurrentConditionsDisplay(Subject weatherData) {
		this.weatherData = weatherData;
		this.weatherData.registerObserver(this);
	}

	@Override
	public void display() {
		System.out.println("Current conditions: " + this.temperature + "F degrees and " + this.humidity + "% humidity");

	}

	@Override
	public void update(float temp, float humidity, float pressure, float light) {
		this.temperature = temp;
		this.humidity = humidity;
		display();

	}

}
