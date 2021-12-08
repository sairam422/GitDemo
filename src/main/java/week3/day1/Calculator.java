package week3.day1;

public class Calculator {
	
	public int add(int a, int b) {
		return a+b;
	}
	
	public int add(int a, int b, int c) {
		return a+b+c;
	}
	
	public int multiply(int a, int b) {
        return a*b;
	}
	
	public double multiply(int a, double b) {
        return a*b;
	}

	public int subtract(int a, int b) {
        return a-b;   
	}
	
	public double subtract(double a, double b) {
        return a-b;   
	}
	
	public int divide(int a, int b) {
		return a/b;
	}
	
	public double divide(double a, int b) {
		return a/b;
}
	
	public static void main(String[] args) {
		Calculator calci = new Calculator();
		System.out.println(calci.add(1, 2));
		System.out.println(calci.add(1, 2, 3));
		System.out.println(calci.multiply(4, 2));
		System.out.println(calci.multiply(2, 34.34333422));
		System.out.println(calci.subtract(8, 3));
		System.out.println(calci.subtract(77.94286, 50.62175));
		System.out.println(calci.divide(16, 4));
		System.out.println(calci.divide(125.225, 5));
	}
	
}