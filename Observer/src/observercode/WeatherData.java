package observercode;
import java.util.*;
public class WeatherData implements Subject {
	private ArrayList<Observer> observers;
	private float temperature;
	private float humidity;
	private float pressure;
    
        public WeatherData(){
            observers=new ArrayList();
        }
	public void measurementsChanged() {
		notifyObservers();
	}
        @Override
        public void notifyObservers(){
            for(int i=0;i<observers.size();i++){
            Observer observer=(Observer)observers.get(i);
            observer.update(temperature, humidity, pressure);// for push
           // observer.update(); for pull
            }

}	
	public void setMeasurements(float temperature, float humidity, float pressure) {
		this.temperature = temperature;
		this.humidity = humidity;
		this.pressure = pressure;
		measurementsChanged();
	}
    @Override
    public void registerObserver(Observer o) {
        observers.add(o);
    }
    @Override
    public void removeObserver(Observer o) {
    int i=observers.indexOf(o);
    if(i<=0){
    observers.remove(i);
    } }
//for the pull case 
    public float getTemperature() {
        return temperature;
    }
    public float getHumidity() {
        return humidity; }
    public float getPressure() {
        return pressure;
    }



}
