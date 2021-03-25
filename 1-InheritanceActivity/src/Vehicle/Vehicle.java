package Vehicle;

public class Vehicle {
	protected String make ;
	protected String vehicleNumber ;
	protected String fuelType ; 
	protected int fuelCapacity ; 
	protected int cc ;	
	Vehicle(String make,String vehicleNumber,String fuelType,Integer fuelCapacity,Integer cc){
		this.make = make ;
		this.vehicleNumber = vehicleNumber ;
		this.fuelType = fuelType ;
		this.fuelCapacity =fuelCapacity ;
		this.cc = cc ;
	}
	
	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public String getVehicleNumber() {
		return vehicleNumber;
	}

	public void setVehicleNumber(String vehicleNumber) {
		this.vehicleNumber = vehicleNumber;
	}

	public String getFuelType() {
		return fuelType;
	}

	public void setFuelType(String fuelType) {
		this.fuelType = fuelType;
	}

	public int getFuelCapacity() {
		return fuelCapacity;
	}

	public void setFuelCapacity(int fuelCapacity) {
		this.fuelCapacity = fuelCapacity;
	}

	public int getCc() {
		return cc;
	}

	public void setCc(int cc) {
		this.cc = cc;
	}

	public void displaymake() {
		System.out.println(make);
	}
	
	public void displayBasicInfo() {
		System.out.println("Vehicle No : " + vehicleNumber );
		System.out.println("FuelCapacity : " + fuelCapacity);
		System.out.println("fuelType : " + fuelType);
		System.out.println("cc : " + cc);
	}
	
	void displayDetailInfo() {
		
	}
}
