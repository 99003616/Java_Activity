package Vehicle;
import java.util.Scanner;

public class Inheritance {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Select Type of Vehicle : 1. Four Wheeler           2. Two Wheeler");
		int type = sc.nextInt();
		if(type == 1) {
			System.out.println("Enter maker of Four Wheeler");
			String make = sc.next() ;
			System.out.println("Enter Vehicle no ");
			String vehicleNumber = sc.next();
			System.out.println("Enter Fuel type : 1.Petrol     2.Diesel");
			String fuelType = sc.next(); 
			System.out.println("Enter fuel Capacity");
			int fuelCapacity = sc.nextInt(); 
			System.out.println("Enter cc of your vehicle");
			int cc = sc.nextInt();
			
			FourWheeler obj = new FourWheeler(make, vehicleNumber , fuelType , fuelCapacity , cc);
			obj.displaymake();
			obj.displayBasicInfo();
			obj.displayDetailInfo();
		}
		else if(type == 2){
			System.out.println("Enter maker of Four Wheeler");
			String make = sc.next() ;
			System.out.println("Enter Vehicle no ");
			String vehicleNumber = sc.next();
			System.out.println("Enter Fuel type : 1.Petrol     2.Diesel");
			String fuelType = sc.next(); 
			System.out.println("Enter fuel Capacity");
			int fuelCapacity = sc.nextInt(); 
			System.out.println("Enter cc of your vehicle");
			int cc = sc.nextInt();
			
			TwoWheeler obj1 = new TwoWheeler(make, vehicleNumber , fuelType , fuelCapacity , cc);
			obj1.displaymake();
			obj1.displayBasicInfo();
			obj1.displayDetailInfo();
			
		}
		
	}

}
