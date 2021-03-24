package Vehicle;

class FourWheeler extends Vehicle {
	private String audioSystem = "Beats" ;
	private int noOfDoors = 5 ; 

	FourWheeler(String make, String vehicleNumber, String fuelType, Integer fuelCapacity, Integer cc) {
		super(make, vehicleNumber, fuelType, fuelCapacity, cc);
		// TODO Auto-generated constructor stub
	}
	
	public void displayDetailInfo() {
		System.out.println("Two wheller has Audio System :" + audioSystem + " and " + noOfDoors + " Doors");
	}

	public String getAudioSystem() {
		return audioSystem;
	}

	public void setAudioSystem(String audioSystem) {
		this.audioSystem = audioSystem;
	}

	public int getNoOfDoors() {
		return noOfDoors;
	}

	public void setNoOfDoors(int noOfDoors) {
		this.noOfDoors = noOfDoors;
	}
}