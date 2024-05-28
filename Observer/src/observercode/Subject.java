package observercode;


public interface Subject {
	public void registerObserver(Observer o);
	public void removeObserver(Observer o);
	public void notifyObservers();

  public float getTemperature();

    public float getPressure();

    public float getHumidity();


}
