package observercode;
	
public class CurrentConditionsDisplay implements Observer, DisplayElement {
	private float temperature;
	private float humidity;
	private final Subject WeatherData;
         public CurrentConditionsDisplay(Subject weatherData){
             this.WeatherData=weatherData;
            weatherData.registerObserver(this);
         }
        @Override
	public void update(float temperature, float humidity, float pressure) {
		this.temperature = temperature;     //push
		this.humidity = humidity;
		display();
	}
        @Override
        public void update(){//pull
            this.temperature =WeatherData.getTemperature();
            this.humidity = WeatherData.getHumidity();
		display();
        }
        
	
        @Override
	public void display() {
		System.out.println("Current conditions: " + temperature 
			+ "F degrees and " + humidity + "% humidity");
	}
}
