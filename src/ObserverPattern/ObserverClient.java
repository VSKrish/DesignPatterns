package ObserverPattern;

public class ObserverClient {
	public static void main(String[] args) {
		WeatherStation weatherStation = new WeatherStation();

        // Create display devices (observers)
        CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay();
        StatisticsDisplay statisticsDisplay = new StatisticsDisplay();
        ForecastDisplay forecastDisplay = new ForecastDisplay();
        
        // Register observers with the subject (WeatherStation)
        weatherStation.registerObserver(currentConditionsDisplay);
        weatherStation.registerObserver(statisticsDisplay);
        weatherStation.registerObserver(forecastDisplay);
        
        // Simulate weather changes
        weatherStation.setMeasurements(75, 60, 30.4f);
        weatherStation.setMeasurements(80, 65, 29.2f);

        // Unregister an observer (e.g., statisticsDisplay)
        weatherStation.removeObserver(statisticsDisplay);

        // Simulate more weather changes
        weatherStation.setMeasurements(78, 62, 31.0f);
	}
}
