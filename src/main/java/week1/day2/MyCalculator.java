package week1.day2;

public class MyCalculator {

	public static void main(String[] args) {
		Calculator cl=new Calculator();
		System.out.println("Additon of three numbers: "+cl.add(1, -2, 3));
		System.out.println("Subtraction of two numbers: "+cl.sub(-6, 4));
		System.out.println("Multiplication of two numbers: "+cl.mul(2.326, 1.72));
		System.out.println("Division of two numbers: "+cl.divide(9, 3));

	}

}
