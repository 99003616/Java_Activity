package Hotel;

public class DeluxRoom extends HotelRoom {

	
	private int ratePerSqFeet;

	public void setRatePerSqFeet(int ratePerSqFeet) {
		this.ratePerSqFeet = ratePerSqFeet;
	}

	public DeluxRoom(String hotelName, int numberofSqFeet, boolean hasTV, boolean hasWifi ) {
		super(hotelName, numberofSqFeet, hasTV, hasWifi);
		this.ratePerSqFeet=10;
		}
	
	
	public float getRatePerSqFeet() {
		
		if(hasWifi==true){
			
		ratePerSqFeet=ratePerSqFeet+2;
	
		}
		else
		{
		return ratePerSqFeet;
		}
		return ratePerSqFeet;
	}
	
	
	public int calculateTarrif(){
	
		System.out.println("Room Tariff Per Day is: "+ (ratePerSqFeet*numberofSqFeet));
		return ratePerSqFeet;
		
	}

}