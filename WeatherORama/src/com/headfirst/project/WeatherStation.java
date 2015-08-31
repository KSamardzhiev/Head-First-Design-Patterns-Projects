package com.headfirst.project;

import java.io.FileNotFoundException;

import com.headfirst.project.displays.ArduinoTempDisplay;

public class WeatherStation {

	public static WeatherData weatherData = new WeatherData();

	static Runnable myRunnable = new Runnable() {

		public void run() {
			try {
				weatherData.collectData();
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	};

	public static void main(String[] args) throws FileNotFoundException, InterruptedException {

		ArduinoTempDisplay arduinoTempDisplay = new ArduinoTempDisplay(weatherData);

		while (true) {
			Thread.sleep(7000);
			Thread thread = new Thread(myRunnable);
			thread.start();
		}
	}

}
