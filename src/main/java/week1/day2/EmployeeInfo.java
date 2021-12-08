package week1.day2;

import week1.day1.Car;

public class EmployeeInfo {

	public void printEmpDetails() {

		System.out.println("Sai");

	}

	
	  public String getEmployeeName() {
	  
	  return "Ram";
	  
	  }
	  
	  public long getEmployeePhone(int id, String name) {
		 if(id==100)
			 return 9550200548l;
		 else
			 return 9999999999l;

	}
	  
	 

	public static void main(String[] args) {

		EmployeeInfo ei = new EmployeeInfo();
		/* Car car = new Car(); */
		ei.printEmpDetails();
		System.out.println(ei.getEmployeeName());
		String en = ei.getEmployeeName();
		System.out.println(en);
		/*
		 * String c=car.getEmployeeName(); System.out.println(c);
		 */
		long eP = ei.getEmployeePhone(100, "Sai");
		System.out.println(eP);
		
	}

}
