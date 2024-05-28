package observercode;

/**
 *
 * @author HebaHamdan
 */
public class ObserverCode {

    public static void main(String[] args) {
  

		//write necessary code here to create instances of three observers displays: currentConditionDisplay, ForecastDisplay, StatisticsDisplay
            WeatherData w=new  WeatherData();

		//write code to update the displays for each of following measures

             StatisticsDisplay s=new StatisticsDisplay(w);
             ForecastDisplay f=new ForecastDisplay(w);
             CurrentConditionsDisplay c=new CurrentConditionsDisplay(w);
             w.setMeasurements(80, 65, 30.4f);
              w.setMeasurements(82, 70, 29.2f);
                 w.setMeasurements(78, 90, 29.2f);
		//tempreture , humidity, pressure
		//80, 65, 30.4f
		//82, 70, 29.2f;
		//78, 90, 29.2f;
	
    }
    
}
