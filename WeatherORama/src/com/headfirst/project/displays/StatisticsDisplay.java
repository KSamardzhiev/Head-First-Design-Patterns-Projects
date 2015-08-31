package com.headfirst.project.displays;

import com.headfirst.project.interfaces.DisplayElement;
import com.headfirst.project.interfaces.Observer;
import com.headfirst.project.interfaces.Subject;

public class StatisticsDisplay implements Observer, DisplayElement {

	private float minTemp = 0.0f;
	private float maxTemp = 200;
	private float tempSum = 0.0f;
	private int numReadings;
	private Subject weatherData;

	public StatisticsDisplay(Subject weatherData) {
		this.weatherData = weatherData;
		this.weatherData.registerObserver(this);
	}

	@Override
	public void display() {
		System.out.println("Avg/Max/Min temperature = " + (tempSum / numReadings) + "/" + maxTemp + "/" + minTemp);
	}

	@Override
	public void update(float temp, float humidity, float pressure, float light) {
		tempSum += temp;
		numReadings++;

		if (temp > maxTemp) {
			maxTemp = temp;
		}

		if (temp < minTemp) {
			minTemp = temp;
		}

		display();

	}

}
