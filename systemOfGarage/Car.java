package systemOfGarage;

public class Car extends vehicle {
	private int seatingCapacity;
	
	public Car( String ownerName , String brand , String model , int year , int seatingCapacity ) {
		super(ownerName , brand , model , year);
		this.seatingCapacity = seatingCapacity;
	}
	public void setseatingCapacity(int seatingCapacity) {
		this.seatingCapacity = seatingCapacity;
		
	}
	public int getseatingCapacity() {
		return seatingCapacity;
	}
	
	@Override
	public void displayInfo() {
		System.out.println("Owner: " + getownerName());
		System.out.println("Car: " + getbrand() + "Model: " + getmodel() + "Year: " + getyear() );
		System.out.println("Seating Capacity: " + seatingCapacity);
	}

}
