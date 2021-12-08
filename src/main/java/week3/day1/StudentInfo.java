package week3.day1;

public class StudentInfo {
	
	public void getStudentDetails(String name) {
		System.out.println("Student details based on given name");
	}

	public void getStudentDetails(int id) {
		System.out.println("Student details based on given ID");
	}
	
	public void getStudentDetails(String name, int PhNo) {
		System.out.println("Student details based on given name and Phone number");
	}
	
	public void getStudentDetails(int id, String eMail) {
		System.out.println("Student details based on given ID and eMail");
	}

	public static void main(String[] args) {
		StudentInfo si = new StudentInfo();
		si.getStudentDetails("Sai Ram");
		si.getStudentDetails(100);
		si.getStudentDetails("Sai Ram", 955020);
		si.getStudentDetails(100, "sairam.rain422@gmail.com");
		
	}
	
}
