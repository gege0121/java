public class Truck extends Car {
	private int cargoweight;
	public Truck(String brand, int wheelnumber, int cargoweight){
		super(brand, wheelnumber);
		this.cargoweight=cargoweight;
	}

	public String toString(){
		return (super.toString() + cargoweight);
	}
}
