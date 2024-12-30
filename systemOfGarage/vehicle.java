package systemOfGarage;

public abstract class vehicle {
	private String ownerName;
	private String brand;
	private String model;
	private int year;
	
	public vehicle(String ownerName , String brand , String model , int year) {
		this.ownerName=ownerName;
		this.brand=brand;
		this.model=model;
		this.year=year;
	}
	
	public void setownerName(String ownerName) {
		this.ownerName=ownerName;
	}
	public String getownerName() {
		return ownerName;
	}
	public void setbrand(String brand) {
		this.brand=brand;
	}
	public String getbrand() {
		return brand;
	}
	public void setmodel(String model) {
		this.model=model;
	}
	public String getmodel() {
		return model;
	}
	public void setyear(int year) {
		this.year= year;
	}
	public int getyear() {
		return year;
	}
	
	public abstract void displayInfo() ;
}