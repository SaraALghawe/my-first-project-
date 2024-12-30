package systemOfGarage;

public class Motorcycle extends vehicle {
	private int engineSize;
	
	public Motorcycle(String ownerName, String brand, String model, int year, int engineSize) {
		super(ownerName, brand, model, year);
		this.engineSize = engineSize;
	}
	
	public void setEngineSize(int engineSize) {
		this.engineSize = engineSize;
	}
	public int getEngineSize() {
		return engineSize;
	}
	
	@Override
	public void displayInfo() {
		System.out.println("ower: " + getownerName());
		System.out.println("Car: " + getbrand() + "model: " + getmodel() + "year: " + getyear() );
		System.out.println("Engine Size: " + engineSize + "cc");
	}

}
