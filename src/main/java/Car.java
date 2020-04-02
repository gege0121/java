public class Car{
	private String brand;
	private int wheelnumber;
	public Car(String brand, int wheelnumber){
		this.brand=brand;
		this.wheelnumber=wheelnumber;
	}

	public String toString(){
		return brand + " " + wheelnumber + " ";
	}

}