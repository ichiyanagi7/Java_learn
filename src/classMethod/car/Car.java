package classMethod.car;

public class Car {
	public double fuelCost;
	public double fuelAmount;

	public Car(double fuelCost, double fuelAmount) {
		this.fuelCost = fuelCost;
		this.fuelAmount = fuelAmount;
	}

	public void move(int range) {
		System.out.println(range + "km 走ります");
		this.fuelAmount -= (range / fuelCost);
	}

	public double getFuelAmount() {
		return this.fuelAmount;
	}
}
