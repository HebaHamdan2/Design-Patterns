package observercode;
public class ForecastDisplay implements Observer, DisplayElement {
	private float currentPressure = 29.92f;  
	private float lastPressure;
	private Subject WeatherData;
        
      public ForecastDisplay(Subject WeatherData){
      this.WeatherData=WeatherData;
      WeatherData.registerObserver(this);
      }
        @Override
	public void update(float temp, float humidity, float pressure) {//push 
          lastPressure = currentPressure;
		currentPressure =pressure;
		display();
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
		}}

    @Override
    public void update() {//pull
    lastPressure = currentPressure;
    currentPressure = WeatherData.getPressure();
    display();
    }
}
