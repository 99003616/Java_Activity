package Vehicle;

public class TwoWheeler extends Vehicle{
	
	private boolean kickStart  = true ;
	

	TwoWheeler(String make, String vehicleNumber, String fuelType, Integer fuelCapacity, Integer cc) {
		super(make, vehicleNumber, fuelType, fuelCapacity, cc);
		// TODO Auto-generated constructor stub
	}
	
	public void displayDetailInfo() {
		System.out.println("Two wheller has KickStart Available : " + kickStart );
	}

	public boolean isKickStart() {
		return kickStart;
	}

	public void setKickStart(boolean kickStart) {
		this.kickStart = kickStart;
	}
	
}