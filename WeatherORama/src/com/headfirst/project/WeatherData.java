package com.headfirst.project;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

import com.headfirst.project.interfaces.Observer;
import com.headfirst.project.interfaces.Subject;

public class WeatherData implements Subject {

	private ArrayList<Observer> observers;
	private float temperature;
	private float humidity;
	private float pressure;
	private float light;
	
	public WeatherData(){
		observers = new ArrayList<Observer>();
	}
	
	@Override
	public void registerObserver(Observer obs) {
		observers.add(obs);

	}

	@Override
	public void removeObserver(Observer obs) {
		
		observers.remove(obs);

	}

	@Override
	public void notifyObservers() {
		for(int i = 0; i < observers.size(); i++){
			Observer observer = observers.get(i);
			observer.update(this.temperature, this.humidity, this.pressure, this.light);
		}

	}

	public float getTemperature() throws FileNotFoundException{
		
		return this.temperature;
	}
	
	public float getHumidity(){
		return this.humidity;	
	}
	
	public float getPressure(){
		return this.pressure;
	}
	
	private void measurementsChanged(){
		this.notifyObservers();
	}
	
	public void setMeasurements(float temperature, float humidity, float pressure){
		this.temperature = temperature;
		this.humidity = humidity;
		this.pressure = pressure;
		this.measurementsChanged();
	}
	
	public void collectData() throws FileNotFoundException{
		File file = new File("/Users/KSamardzhiev/Documents/Processing/ArduinoTempJava/data.txt");
		Scanner streamRead = new Scanner(new FileInputStream(file));
		
		String[] line = streamRead.nextLine().split(" ");
		this.temperature = Float.parseFloat(line[0]);
		this.light = Float.parseFloat(line[1]);
		PrintWriter writer = new PrintWriter(file);
		writer.print("");
		writer.close();
		streamRead.close();
		this.measurementsChanged();
	}
	
}
