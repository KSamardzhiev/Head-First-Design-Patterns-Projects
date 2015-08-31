package com.headfirst.project.displays;

import com.headfirst.project.interfaces.DisplayElement;
import com.headfirst.project.interfaces.Observer;
import com.headfirst.project.interfaces.Subject;

public class ForecastDisplay implements Observer, DisplayElement {

	private float currentPressure = 29.92f;
	private float lastPressure;
	private Subject weatherData;

	public ForecastDisplay(Subject weatherData) {
		this.weatherData = weatherData;
		this.weatherData.registerObserver(this);
	}

	@Override
	public void display() {
		System.out.print("Forecast: ");
		if (currentPressure > lastPressure) {
			System.out.println("Improving weather on the way!");
		} else if (currentPressure == lastPressure) {
			System.out.println("More of the same");
		} else if (currentPressure < lastPressure) {
			System.out.println("Watch out for cooler, rainy weather");
		}
	}

	@Override
	public void update(float temp, float humidity, float pressure, float light) {
		this.lastPressure = this.currentPressure;
		this.currentPressure = pressure;
		
		display();

	}

}
