package week3.day1;

public class Students {
	
	public void getStudentInfo() {
		System.out.println("Student details");
	}
	
	public void getStudentInfo(int id) {
		System.out.println("Student details based on id");

	}
	
	public void getStudentInfo(int id, String name) {
		System.out.println("Student details based on id and Name");

	}
	
	public void getStudentInfo(String email, int PhoneNumber) {
		System.out.println("Student details based on email and PhoneName");

	}
	
	public static void main(String[] args) {
		Students std = new Students();
		std.getStudentInfo();
		std.getStudentInfo(509974);
		std.getStudentInfo(509974, "Sai Ram");
		std.getStudentInfo("sairam.rain422@gmail.com", 9550200);
	}

}
