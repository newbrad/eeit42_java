package tw.brad.tutor;

import tw.brad.myclass.Bike;

public class Brad31 {

	public static void main(String[] args) {
		Bike myBike = new Bike();
		Bike urBike = new Bike();
		myBike.upSpeed();
		myBike.upSpeed();
		myBike.upSpeed();
		myBike.upSpeed();

		urBike.upSpeed();
		urBike.upSpeed();
		urBike.upSpeed();
		urBike.downSpeed();
		
		System.out.println(myBike.getSpeed());
		System.out.println(urBike.getSpeed());
		
//		myBike.speed = 3.1;
//		System.out.println(myBike.speed);

		 
	}

}
