package observercode;

public class StatisticsDisplay implements Observer, DisplayElement {
	private float maxTemp = 0.0f;
	private float minTemp = 200;
	private float tempSum= 0.0f;
	private int numReadings;
        private Subject WeatherData;
	//compose the Concrete subject (WeatherData) here , write necessary code
        public StatisticsDisplay(Subject WeatherData){
        this.WeatherData= WeatherData;
        WeatherData.registerObserver(this);
        }
	public void update(float temp, float humidity, float pressure) {
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

        @Override
	public void display() {
		System.out.println("Avg/Max/Min temperature = " + (tempSum / numReadings)
			+ "/" + maxTemp + "/" + minTemp);
	}

    @Override
    public void update() {
    tempSum += WeatherData.getTemperature();
		numReadings++;

		if (WeatherData.getTemperature() > maxTemp) {
			maxTemp = WeatherData.getTemperature();
		}
 
		if (WeatherData.getTemperature() < minTemp) {
			minTemp = WeatherData.getTemperature();
		}

		display();
    }
}

