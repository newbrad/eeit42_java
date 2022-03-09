package tw.brad.tutor;

import tw.brad.myclass.Bike;
import tw.brad.myclass.Scooter;

public class Brad33 {

	public static void main(String[] args) {
		Bike bike = new Bike();
		Scooter scooter = new Scooter();
		bike.upSpeed();bike.upSpeed();
		scooter.upSpeed(); scooter.upSpeed();
		System.out.println(bike.getSpeed());
		System.out.println(scooter.getSpeed());
	}

}
