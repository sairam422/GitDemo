package week1.day1;

public class Car {

	public String brandName = "Hyundai";
	public int numWheels = 4;
	public boolean isPunctured = false;
	public char fuelType = 'P';
	public double carPrice = 4500000.34123;

	public void driveCar() {
		System.out.println("Driving Car");
		// System.out.println(brandName);
	}

	public void applyBrake() {
		System.out.println("Apply Brake");
		// System.out.println(carPrice);
	}
	public static void main(String[] args) {
		Car myCar = new Car();

		myCar.driveCar();
		myCar.applyBrake();
		int noOfWheels = myCar.numWheels;
		System.out.println(noOfWheels);

		System.out.println(myCar.brandName);
		System.out.println(myCar.carPrice);
	}

}
