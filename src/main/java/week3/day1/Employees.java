package week3.day1;

public class Employees /* extends Company */ {

	/*
	 * int empId; String empName;
	 */

	/*
	 * Employees() {
	 * 
	 * 
	 * this(509974, "Sai Ram");
	 * 
	 * empId=100; empName="Sai Ram";
	 * 
	 * 
	 * System.out.println("Default constructor"); }
	 */

	Employees(int empId, String empName) { 
		// this(); 
		int emp = empId; 
		String empN = empName; 
		// System.out.println(empName);
		System.out.println("Paramterized Constructor" + emp);
	}

	public static void main(String[] args) {
		System.out.println("log");
		//Employees emp = new Employees();

		Employees emp1 = new Employees(509974, "Sai Ram");

		/*
		 * System.out.println(emp.empId+1); System.out.println(emp.empName);
		 */
		/* System.out.println(emp.num); */

	}

}
