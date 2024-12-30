package systemOfGarage;

public class Garage {
	private vehicle[] vehicles;
	private int count;
	
	public Garage() {
		this.vehicles = new vehicle[100];
		this.count = 0;
	}
	
	public void addVehicle(vehicle Vehicle) {
		if(count < vehicles.length ) {
			vehicles[count] = Vehicle;
			count++;
			System.out.print("Vehicle adde to the garage . ");
		}
		else {
			System.out.print("Garage is full . can not add more vehicle . ");
		}
	}
	public void updateVehicle(String brand ,String model ,int year ,String newOwner ,String currentOwner) {
		boolean found = false;
		for (int i=0 ; i<count ; i++) {
			if(vehicles[i].getownerName().equalsIgnoreCase(currentOwner)) {
				vehicles[i].setbrand(brand) ;
				vehicles[i].setmodel(model) ;
				vehicles[i].setyear(year) ;
				vehicles[i].setownerName(newOwner) ;
				System.out.print("vehicle updated successful . ");
				found = true;
				break;
			}
	}
		if(!found) {
			System.out.print("vehicle with owner ' " + currentOwner + " ' not found . update failed.");
		}
	}
	
    public void removeVehicle(String ownerName) {
    	boolean found = false;
    	for (int i=0 ; i<count ; i++) {
    		if(vehicles[i].getownerName().equalsIgnoreCase(ownerName)){
    			vehicles[i] = vehicles[count-1];
    			vehicles[count-1] = null;
    			count--;
    			System.out.print("vehile removed from the garage .");
    			found = true;
    			break;
    		}
    	}
    	if(!found) {
    		System.out.print("vehicle with owner ' " + ownerName + "' not found . removal failed . ");
    	}
    }
    public void displayVehicle() {
    	if(count == 0) {
    		System.out.print("The Garage is empty.");
    	}else {
    		for(int i=0 ; i<count ; i++) {
    			vehicles[i].displayInfo();
    			System.out.println();
    		}
    	}
    }
    public void displayVehicleDetails(String ownerName) {
    	boolean found = false;
    	for(int i=0 ; i<count ; i++) {
    		if(vehicles[i].getownerName().equalsIgnoreCase(ownerName)) {
    			vehicles[i].displayInfo();
    			found = true;
    			break;
    		}
    	}
    	if(!found) {
    		System.out.println("vehicle with owner '" + ownerName +" ' not found .");
    	}
    }
}


    
    
    
    
    
    
    