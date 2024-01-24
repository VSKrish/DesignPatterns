package ObserverPattern;

import java.util.HashSet;
import java.util.Set;

public class WeatherStation implements Subject {

	// when order of the notifications is important use List (which is the case mostly)
	private Set<Observer> observers = new HashSet<>();
	private float temperature;
    private float humidity;
    private float pressure; 
    
	@Override
	public void registerObserver(Observer observer) {
		observers.add(observer);
	}

	@Override
	public void removeObserver(Observer observer) {
		observers.remove(observer);
	}

	@Override
	public void notifyObservers() {
		for(Observer ob: observers)
			ob.update(temperature, humidity, pressure);
	}
	
	public void setMeasurements(float temperature,float humidity, float pressure) {
		this.temperature = temperature;
		this.humidity = humidity;
		this.pressure = pressure;
		measurementsChanged();
	}
	
	private void measurementsChanged() {
		notifyObservers();
	}

}
