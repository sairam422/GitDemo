package week3.day1;

public class EmployeesInfo {
	
	int empId;
	String empName;
	static String cmpName;	
	
	EmployeesInfo(int empId, String empName, String cmpName){
		this.empId = empId;
		this.empName = empName;
		this.cmpName = cmpName;
		
	}
	
	public static void getDetails() {
		System.out.println("static method");
		
	}
	
	
	public static void main(String[] args) {
	
		EmployeesInfo emp1 = new EmployeesInfo(100 , "Sai","Google");
	
	
		
		EmployeesInfo emp2 = new EmployeesInfo(200 , "Ram", "Amazon");
			
		System.out.println(emp1.empId);
		System.out.println(emp1.empName);
		System.out.println(cmpName);
		
		
		System.out.println("*****************************************");
		
		System.out.println(emp2.empId);
		System.out.println(emp2.empName);
		System.out.println(cmpName);
	     getDetails();
	     
	

	}

}
