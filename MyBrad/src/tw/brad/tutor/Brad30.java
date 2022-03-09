package tw.brad.tutor;

import tw.brad.myclass.Bike;

public class Brad30 {

	public static void main(String[] args) {
		Bike myBike = new Bike();
		System.out.println(myBike);
		System.out.println(myBike.getSpeed());
		myBike.upSpeed();
		System.out.println(myBike.getSpeed());
		myBike.upSpeed();
		System.out.println(myBike.getSpeed());
		myBike.upSpeed();
		System.out.println(myBike.getSpeed());
	}

}
