package week3.day2;

public class College extends University{

	@Override
	public void ug() {
		System.out.println("ug from college");
		
	}
	
	public static void main(String[] args) {
		College clg = new College();
		clg.pg();
		clg.ug();
	}

}
