#Weather-O-Rama

*This project represent the Strategy Pattern. Also the idea of the project is to simulate a simple Weather Station. The weather station is based on WeatherData object, which tracks current weather conditions (temperature, humidity, and barometric pressure). The project also provide 3 display elements: current conditions, weather statistics and a simple forecast, all updated in real time as the WeatherData object  acquires the most recent measurements.* 

I also extended the project and add one more display - ArduinoTempDisplay which displays data about the temperature and the light intensitet based on real measurements by arduino sensors. The Processing file make the connection between the values from the sensors and the Java program. In this way the Processing program get the values from the Serial port on which the Arduino talks, and write them in .txt file (this procedure is made every 6 sec). Simultaneously the Java program read the values from the .txt files and update all objects that are involved with this information. In this addition to the main project of Head First Design Patterns book, I used multithreading so that on every 7 sec, new information about the temperature and light is get. *

OO Principles used in the project:

> Encapsulate what varies

> Favour composition over inheritance

> Program to interface, not implementation

> Strive for loosely coupled designs between objects that interact

Observer Pattern definition:

> Observer Pattern defines a one-to-many dependency between objects so that when one object changes state, all its dependents are notified and updated automatically.
