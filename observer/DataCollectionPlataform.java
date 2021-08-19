package design_patterns.padroes.observer;

// Concrete Observable

public class DataCollectionPlataform extends Observable {

	protected float temperature, waterPh, atmosphericPressure;
	
	public DataCollectionPlataform() {
		this.temperature = 22;
		this.waterPh = 7;
		this.atmosphericPressure = 1;
	}
	
	public void setTemperature(float temp) {
		this.temperature = temp;
		notifyObservers();
	}
	
	public void setWaterPh(float waterPh) {
		this.waterPh = waterPh;
		notifyObservers();
	}
	
	public void setAtmosphericPressure(float pressure) {
		this.atmosphericPressure = pressure;
		notifyObservers();
	}
	
	public void monitoring() {
		System.out.println(
				  "\n\t Temperatura: " + this.temperature 
				+ "\n\t PH da Água: " + this.waterPh
				+ "\n\t Pressão Atmosférica: " + this.atmosphericPressure + "\n"
		);
	}
	
}
