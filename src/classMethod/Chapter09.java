package classMethod;

import classMethod.car.Car;

public class Chapter09 {
	public static void main(String[] args) {
		double fuelCost = 12.5; //燃費
		double fuelAmount = 55.0; //燃料
		
		Car car = new Car(fuelCost,fuelAmount);
		
		car.move(20);
		System.out.println("残量は" + car.getFuelAmount() + "です。");
	}
}
